public class Bike implements Vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("Jade z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje");
    }
}
