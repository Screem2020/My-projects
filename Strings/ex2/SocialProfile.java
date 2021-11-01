package Strings.ex2;

import java.util.Objects;

public class SocialProfile {
    private String name;
    private String twoName;
    private String age;     // при проверке по equals вылетает NullPointerException необходимо
    private String postal;  // явно инициализировать обЬект в конструкторе, даже если не прописанны, но есть в полях
    private String country;

    public SocialProfile(String name, String twoName) {
        this.name = name;
        this.twoName = twoName;
        this.age = "";
        this.postal = "";
        this.country = "";
    }

    public SocialProfile(String name, String twoName, String age) {
        this.name = name;
        this.twoName = twoName;
        this.age = age;
        this.postal = "";
        this.country = "";
    }

    public SocialProfile(String name, String twoName, String age, String postal, String country) {
        this.name = name;
        this.twoName = twoName;
        this.age = age;
        this.postal = postal;
        this.country = country;
    }

    public static SocialProfile trim(String line) {
        String[] strings = line.split(" ");
        int i;
        for (i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        if (i == 2) {
            String name = strings[0];
            String last_name = strings[1];
            return new SocialProfile(name, last_name);
        }
        if (i == 3) {
            String name = strings[0];
            String last_name = strings[1];
            String age = strings[2];
            return new SocialProfile(name, last_name, age);
        }
        if (i == 5) {
            String name = strings[0];
            String last_name = strings[1];
            String age = strings[2];
            String postal = strings[3];
            String country = strings[4];
            return new SocialProfile(name, last_name, age, postal, country);
        }
        try {
            if (i != 2 || i != 3 || i != 5) {
                throw new java.lang.Exception();
            }
        } catch (java.lang.Exception e) {
            System.err.println("Data entered incorrect");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialProfile that = (SocialProfile) o;
        return age.equals(that.age) && Objects.equals(name, that.name) && Objects.equals(twoName, that.twoName) &&
                Objects.equals(postal, that.postal) && Objects.equals(country, that.country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Name: " + sb.append(name));
        sb = new StringBuilder();
        System.out.println("Last Name: " + sb.append(twoName));
        sb = new StringBuilder();
        System.out.println("Age: " + sb.append(age));
        sb = new StringBuilder();
        System.out.println("Postal: " + sb.append(postal));
        sb = new StringBuilder();
        System.out.println("Country: " + sb.append(country));
        System.out.println();
        return "";
    }
}
