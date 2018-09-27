package v1;

import java.util.Scanner;
public class V3
{
    public static int getDepth(String str)
    {
        if(str.length()==0)
        {
            return 0;
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                count++;
            }
            if(count > max)
            {
                max = count;
            }
            if(str.charAt(i)==')')
            {
                count--;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(getDepth(str));


    }
}