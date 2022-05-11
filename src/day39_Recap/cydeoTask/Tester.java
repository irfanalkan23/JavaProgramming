package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void createTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing the application");
    }



    // no need to override toString(), Employee class includes everything we need here
}
/*
    3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */