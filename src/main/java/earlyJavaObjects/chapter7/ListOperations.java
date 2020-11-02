package earlyJavaObjects.chapter7;

import java.util.List;

public interface ListOperations {

    public abstract List<String> addStr(List<String> list, String str);
    public abstract List<String> delete(List<String> list, int index);
    public abstract int length(List<String> list);

}
