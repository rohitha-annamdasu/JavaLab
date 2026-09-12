abstract class person{
    abstract void eat();
}
class anonymousinnerclass{
    public static void main(String args[]){
        person p = new person()
        {
 void eat(){
        System.out.println("nice fruits");
    }
        };
p.eat();
}
}