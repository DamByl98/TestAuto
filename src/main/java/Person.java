public class Person {

    public String name;
    public Integer age;

    public Person(String name, int age){
        System.out.println("Person konstruktor");
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("I like pizza");
    }

    public void walk(){
        System.out.println("I like walking!");
    }
}
