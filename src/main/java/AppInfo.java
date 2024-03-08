public class AppInfo {
    public String appName;
    public Integer version;
    public String Opis;

    AppInfo(String appName, int version, String Opis){
        this.appName = appName;
        this.version = version;
        this.Opis = Opis;
    }

    public void App(){
        System.out.println("Name: " + appName);
        System.out.println("Wersja: " + version);
        System.out.println(Opis);
    }
}
