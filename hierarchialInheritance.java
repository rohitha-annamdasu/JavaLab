class Animal{
    void show()
    {
        System.out.println("I'm an Animal");
    }
}
class Cat extends Animal
{
    void display()
    {
        System.out.println("I'm a cat");
    }
}
class Dog extends Animal
{
    void show1()
    {
        System.out.println("I'm a dog");
    }
}
class Fox extends Animal{
    void display1()
    {
        System.out.println("I'm a fox");
    }
}
class Main{
    public static void main(String args[])
    {
        Fox f=new Fox();
        Dog d = new Dog();
        Cat c = new Cat();
        f.display1();
        d.show();
        c.display();
    
    
    }
}