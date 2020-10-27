package headFirstOOAD.chapter5_6;

public enum Style {
    A, F;

    public String toString(){
        switch(this){
            case A: return "A";
            case F: return "F";
        }
        return "Style not found";
    }
}
