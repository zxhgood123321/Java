package jvm.outofmemoryerror;

import javax.activation.CommandObject;
import java.util.ArrayList;
import java.util.List;

/**
 * java堆溢出
 */
public class HeapOOM {
    static class OOMObject{

    }
    public static void main(String[] args) {
        List<OOMObject> list= new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
