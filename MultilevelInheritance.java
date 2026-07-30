class Super{
    void show()
    {
        System.out.println("I'm in sub class");
    }
}
class sub extends Super{
    void display()
    {
        System.out.println("I'm in sub class");
    }
}
class Inter extends sub
{
    void represent()
    {
        System.out.println("I'm in Intermediate class");
    }
}
class Main
{
    public static void main(String args[])
{
    Inter obj1=new Inter();
    obj1.show();
    obj1.display();
    obj1.represent();
}
}
