package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while (true) {
            String m=input.next();
            if (m.length()==6) {
                list.add(m);
            }
            else{
                list.add(m);
                break;
            }
        }
        boolean mx=false;
        //判断第二个字段是否是第一字段的上级
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.size();j++){
                if (list.get(i).charAt(4)==list.get(j).charAt(0)){
                    System.out.println(list.get(j).charAt(2)+"-"+list.get(i).charAt(2));
                    mx=true;
                }
            }
        }
        if (mx==false){
            System.out.println("incorrect data");
        }
    }
}
