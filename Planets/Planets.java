package Planets;

public enum Planets {
    Earth("Земля"), Venus("Венера"), Mercury("Меркурий"), Mars("Марс"), Saturn("Сатурн"),
    Uranus("Уран"), Neptune("Нептун"), Jupiter("Юпитер");

    private String pseudonym;

    Planets(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public static Planets getPlanets(String planetsName) {
        Planets[] planet = values();
        for (int i = 0; i < values().length; i++) {
            if (planet[i].name().equalsIgnoreCase(planetsName) || planet[i].pseudonym.equalsIgnoreCase(planetsName)) {
                return planet[i];
            }
        }
        return null;
    }
}