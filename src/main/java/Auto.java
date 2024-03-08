public class Auto {

    public String model;
    public String marka;
    public int rocznik;
    public  int przebieg;

    public static int liczbaKol = 4;

    public Auto(String model, String marka, int rocznik, int przebieg){
        this.model = model;
        this.marka = marka;
        this.rocznik = rocznik;
        this.przebieg = przebieg;
    }

    public void OpisAuta(){
        System.out.println("Model: " + this.model);
    }
}
