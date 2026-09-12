class car {
car()
{
    System.out.println("Inside car constructor");
}
}
class bus extends car{
    bus()
    {
        super();
        System.out.println("Inside bus constructor");
    }
}
class supcons
{
    public static void main(String[] args)
    {
        bus b = new bus();
    }
}

