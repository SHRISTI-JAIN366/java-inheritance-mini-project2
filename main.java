package OOPs.Inheritance.Project2;

public class main {
    public static void main(String[] args) {
        Person person1 =new Person("shri",22);
        Person person2 =new Person("kiya",12);

        Employee employee1=new Employee("aadi",12,102,2200,"fresher");
        Employee employee2 =new Employee("ved",15,103,3300,"deginer");

        person1.walk();
        person1.run();

        person2.walk();
        person2.run();

        employee1.walk();
        employee1.run();
        employee1.work();

        employee2.walk();
        employee2.run();
        employee2.work();



    }
}
