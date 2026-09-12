class Exception{
    public static void main(String args[]){
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("the value is:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("the value is:"+c);
        }
        finally{
            System.out.println("finally executed");
        }
    }

