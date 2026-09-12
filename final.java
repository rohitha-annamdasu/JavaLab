class bike1
{
    int speedlimit = 90;
    void run()
    {
        speedlimit = 400;
        System.out.println("speed of bike is:"+speedlimit);
    }
    public static void main(String args[])
    {
        bike1 obj = new bike1();
        obj.run();
    }
}