public class AndroidApp extends AppInfo{

    public static String systemAndroid = "Android";
    AndroidApp(String appName, int version, String Opis) {
        super(appName, version, Opis);
    }

    public void AndroidAppShow(){
        App();
        System.out.println("System: " + systemAndroid);
    }
}
