package Interfence.Ex_2;

public class Slingshot extends Weapon {

    private String material;

    public Slingshot(String name, int power, String material) {
        super(name, power);
        this.material = material;
    }

    public Slingshot(String name, String material) {
        super(name);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public int shot() {
        if (material.equalsIgnoreCase("glass")) {
            return 8;
        }
        else if (material.equalsIgnoreCase("stone")) {
            return 5;
        }
        return 0;
    }
}