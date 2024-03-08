package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram Chrome");
    }

    @Override
    public void FindElementBy() {
        System.out.println("Znajdz element w Chrome");
    }
}
