package Planets;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private Planets name;
    private List<Parcel> deliveredParcel = new ArrayList<Parcel>(10);

    public Planet(Planets name, List<Parcel> deliveredParcel) {
        this.name = name;
        this.deliveredParcel = deliveredParcel;
    }

    public Planet(Planets name) {
        this.name = name;
    }

    public Planets getName() {
        return name;
    }

    public List<Parcel> getDeliveredParcel() {
        return deliveredParcel;
    }

    public void setDeliveredParcel(List<Parcel> deliveredParcel) {
        this.deliveredParcel = deliveredParcel;
    }

    public void print() {
        for (int i = 0; i < deliveredParcel.size(); i++) {
            System.out.println(deliveredParcel.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return name == planet.name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name=" + name +
                ", deliveredParcel=" + deliveredParcel.toString() +
                '}';
    }
}
