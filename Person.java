package OOPs.Inheritance.Project2;

public class Person {
    String name ;
    int age;

    //parameterized constructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }


    public void walk(){
        System.out.println(name + "  is walking ");
    }
    public void run(){
        System.out.println(name + " is running ");
    }
}
