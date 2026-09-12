
class Person{
    public void setName(String name){
    this.Name=new Name();
}  
}
public class encapsulation{
    public static void main(String args[]){
        Person myobj = new Person();
        myobj.setName("john");
        System.out.println(myobj.getName());
        }
}

