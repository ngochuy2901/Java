package Models;

import java.util.Date;

public class Person {
    private static int count = 0;
    private int id;
    private String name;
    private Date birthDate;
    private String address;
    private Double height;
    private Double weight;

    //constructor
    public Person(String name, Date birthDate, String address, Double height, Double weight) {
        this.id = ++count;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
    //to String

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
