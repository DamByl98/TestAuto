public class Footballer extends Person{

    public String team;

    public Footballer(String name, int age, String team) {
        super(name, age);
        this.team = team;
        System.out.println("Person footballer");


    }

    public void playFootball(){
        eat();
        walk();
        System.out.println("I'm playing football");
    }
}
