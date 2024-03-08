import java.util.Scanner;
public class Main {
    public static void main(String[] arg){

        AndroidApp app1 = new AndroidApp("FlashScorre", 12,"Pokazuje wyniki meczy");
        AndroidApp app2 = new AndroidApp("WhatsApp", 11, "Wysyłanie wiadomości");

        app1.AndroidAppShow();
        app2.AndroidAppShow();
    }
}
