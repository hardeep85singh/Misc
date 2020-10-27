package headFirstOOAD.chapter5_6;

public enum Type {
    ACCOUSTIC, ELECTRIC;

    public String toString(){
        switch (this){
            case ACCOUSTIC: return "Accoustic";
            case ELECTRIC: return "Electric";
        }
        return "Type not found";
    }
}
