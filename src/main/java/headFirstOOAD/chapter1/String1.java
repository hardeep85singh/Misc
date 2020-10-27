package headFirstOOAD.chapter1;

public interface String1 {
    public int length();

}



class StringImpl implements String1 {
    private final String val;
    public StringImpl(String s) {
        this.val = s;
    }

    @Override
    public int length() {
        return val.length();
    }
}

class Driver {

    public void usage() {
        String1 hello = new StringImpl("hello");
        reverse(hello);

    }



    public String1 reverse(String1 s) {
        return s;
    }

}
