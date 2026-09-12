class bike1{
    final void run()
    {
        System.out.println("running");
    }
}
class honda extends bike1
{
    void run()
    {
        System.out.println("running safely with 100 kmph");
    }
    public static void main(String args[])
    {
        honda Hon = new honda();
        Hon.run();
    }
}