package Planets;

public class Parcel {
    private String content;

    public Parcel(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "content='" + content + '\'' +
                '}';
    }
}
