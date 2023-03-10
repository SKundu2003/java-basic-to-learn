import static java.lang.System.*;

//q1
class employ{
    private String name;
    private int id;
    void set_nameAndId(String name ,int id)
    {
        this.name = name;
        this.id = id;
    }
    String GetName()
    {
        return name;
    }
    int GetId()
    {
        return id;
    }
}
public class Main {
    public static void main(String[] args) {
        out.println("Hello world!");

    }
}