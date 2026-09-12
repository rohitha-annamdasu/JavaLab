class exception {
    public static void main(String args[])
    {
        int a=10;
        int b=2;
        int c;
        try{
            c=a/b;
            System.out.println("The value of c:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("This is an exception.");
        }
    }
}
