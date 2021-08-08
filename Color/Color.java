package Color;

public enum Color {
    Red("Красный"), Blue("Синий"), Green("Зеленый"), White("Белый");

    private String pseudonym;

    Color(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public static Color retColor(String name) {
        Color[] valColor = values();
        for (int i = 0; i < values().length; i++) {
            if (valColor[i].name().equalsIgnoreCase(name) || valColor[i].pseudonym.equalsIgnoreCase(name)) {
                return valColor[i];
            }
        }
        return null;
    }

//    public static void toStr(Color color) {
//        Color[] arrColor = values();
//        for (int i = 0; i < values().length; i++) {
//            if (arrColor[i].(color) || )
//        }
//    }

    public String getPseudonym() {
        return pseudonym;
    }

    @Override
    public String toString() {
        return "Color{" +
                "pseudonym='" + pseudonym + '\'' +
                '}';
    }
}
