package OOPs.Inheritance.Project2;

public class Employee extends Person {
    int employeeid;
    double salary;
    String position;

    public Employee(String name, int age, int employeeid, double Salary, String position){
        super(name,age);
        this.employeeid=employeeid;
        this.salary=salary;
        this.position=position;
    }


    public void work(){
        System.out.println(name + " is working as " + position);
    }
}
