package headFirstOOAD.chapter5_6;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZIALIAN_ROSEWOOD,
    MAHAGONY, MAPLE, COCOBOLO, CEDAR,
    ADIRONDACK, ALDER, SITKA;

    @Override
    public String toString() {
        switch (this){
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZIALIAN_ROSEWOOD: return "Brazilian Rosewood";
            case MAHAGONY: return "Mahogony";
            case MAPLE: return "Maple";
            case COCOBOLO: return "Cocobolo";
            case CEDAR: return "Cedar";
            case ADIRONDACK: return "Adirondack";
            case ALDER: return "Alder";
            case SITKA: return "Sitka";
        }
        return "Wood not found";
    }
}
