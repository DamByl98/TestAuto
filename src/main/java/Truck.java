public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("jade ciezarowka " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Wciskam hamulec w ciezarowce");
    }
}
