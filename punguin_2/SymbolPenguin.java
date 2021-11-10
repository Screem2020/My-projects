package punguin_2;

public enum SymbolPenguin {
    PENGUIN_RIGHT( (char) 9654), PENGUIN_BOTTOM((char) 9660), PENGUIN_TOP((char)9650), PENGUIN_LEFT((char) 9664);

    private char name;

    SymbolPenguin(char name) {
        this.name = name;
    }

    public String parseChar(int value) {
        SymbolPenguin[] values = SymbolPenguin.values();
        for (SymbolPenguin symbolPenguin : values) {
            if (symbolPenguin.getName() == value) {
                char ch = (char) value;
                return String.valueOf(ch);
            }
        }
        return null;
    }

    public char getName(){
        return name;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
