public class MathTeacher extends Person{

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("Person math");

    }

    public void teachMath(){
        System.out.println("I'm teaching at school " + school);
    }

    public void sayHello(){
        System.out.println("My name is: " + name);
    }
}
