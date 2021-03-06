package punguin_2;

public enum Symbol {

    EMPTY("|_|"), WATER("|~|");

    private String name;

    Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
