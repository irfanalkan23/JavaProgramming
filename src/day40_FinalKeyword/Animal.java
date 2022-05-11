package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;     // giving compile error, because when the variable is final,
    private final char gender;      // you have to make sure that,
    private final String color;     // it can be set by the time you use it
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //---------Setters----------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //---------Setters----------------------

    public void eat() {
        System.out.println(name + " is eating");
    }

    public final void drink() {
        System.out.println(name + " is drinking water");
    }




}
