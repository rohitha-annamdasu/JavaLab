class Super
{
    void show()
    {
        System.out.println("I'm in super class");
    }
}
class sub extends Super{
    void display()
    {
        System.out.println("I'm in CSM");

    }
}
class inherit{
    public static void main(String args[])
    {
        sub obj1=new sub();
        obj1.show();
        obj1.display();
            }
}