package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);

        Person person2 = new Person("Kseniia", 'F', 28);

        System.out.println(person1);

        System.out.println(person2);

        person2.age = 30;


    }
}
