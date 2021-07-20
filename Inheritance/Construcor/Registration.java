package Inheritance.Construcor;

public class Registration {
    String login;
    String password;
    String country;
    String city;
    int age;

    public Registration(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Registration(String login, String password, String country) {
        this.login = login;
        this.password = password;
        this.country = country;
    }

    public Registration(String login, String password, String country, String city) {
        this.login = login;
        this.password = password;
        this.country = country;
        this.city = city;
    }

    public Registration(String login, String password, String country, String city, int age) {
        this.login = login;
        this.password = password;
        this.country = country;
        this.city = city;
        this.age = age;
    }

    public void print() {
        System.out.println(this.login + " " + this.password + " " + this.country+ " " + this.city+ " " + this.age);

    }
}
