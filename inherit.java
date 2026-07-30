class superclass
{
    void show()
    {
        System.out.println("I'm in super class");
        }
}
class subclass extends superclass
 {
    void display()
    {
        System.out.println("I'm in CSM-A");
    }
 }
class inherit
{
    public static void main(String[] args)
    {
        subclass obj1 = new subclass();
        obj1.show();
        obj1.display();
        
    }
}
 
 
