

public class Importent {
    static {
        System.loadLibrary("native");
    }
    public static void main(String[] args) {
        Object obj = "test";
        String str = obj.toString();
        System.out.println(obj);
    }
}
