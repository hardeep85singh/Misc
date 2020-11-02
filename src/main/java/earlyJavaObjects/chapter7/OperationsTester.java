package earlyJavaObjects.chapter7;

import java.util.ArrayList;
import java.util.List;

public class OperationsTester {
    public static void main(String[]args){
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.remove(4);
        list.size();

        OperationsImpl impl = new OperationsImpl(list);
        System.out.println(impl.addStr(list, "hardeep"));
        System.out.println(impl.addStr(list, "singh"));
        System.out.println(impl.length(list));
        System.out.println(impl.delete(list, 0));
        System.out.println(impl.length(list));


    }
}
