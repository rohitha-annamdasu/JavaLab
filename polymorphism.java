class vehicle {
    void start()
    {
        System.out.println("Vehicle starts");
    }
}
class Car extends vehicle{
    void start()
    {
        super.start();
        System.out.println("car starts");
    }
}
public class polymorphism{
    public static void main(String args[])
    {
        vehicle v = new Car();
        v.start();
    }
}
