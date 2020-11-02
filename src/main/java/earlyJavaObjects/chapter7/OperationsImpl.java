package earlyJavaObjects.chapter7;

import java.util.ArrayList;
import java.util.List;

public class OperationsImpl implements ListOperations {

    private List list;

    public OperationsImpl(List list){
        this.list = list;
    }

    @Override
    public List<String> addStr(List<String> list, String str) {
        list.add(str);
        return list;
    }

    @Override
    public List<String> delete(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    @Override
    public int length(List<String> list) {
        return list.size();
    }
}
