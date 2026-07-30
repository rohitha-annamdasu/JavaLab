public class callbyvalue {
    public static void main(String[] args)
    {
        int num =10;
        System.out.println("Before calling method:"+num);
        modifyvalue(num);
        System.out.println("After calling method:"+num);
    }
    public static void modifyvalue(int value)
    {
        value=20;
        System.out.println("Inside method:"+value);
    }
}
