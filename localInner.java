public class localInner{
    private int data=30;
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local lc = new Local();
        lc.msg();
    }
    public static void main(String args[])
    {
        localInner obj = new localInner();
        obj.display();
    }
}
