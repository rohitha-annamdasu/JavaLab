class student {
    void study()
    {
        System.out.println("we are studying");
    }
}
class Teacher extends student
{
void study()
{
    System.out.println("Teachers are delivering lectures");
}
}
class overriding
{
    public static void main(String args[])
{
    Teacher t= new Teacher();
    t.study();
    student s = new student();
    s.study();
}
}
