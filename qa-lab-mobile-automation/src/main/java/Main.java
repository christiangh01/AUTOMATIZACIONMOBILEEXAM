import java.io.File;

public class Main {
    public static void main(String[] args){
        File app = new File("/Users/sgodoype/Downloads/Airbnb_23.46.1_Apkpure.apk");
        System.out.println("RUTA: " + app.getAbsolutePath().replace("\\", "/"));
    }
}
