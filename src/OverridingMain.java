
public class OverridingMain
{
    public static void main(String[] args)
    {
        Animal ob=new Animal();
        ob.eat();
        ob.sleep();
        Animal ob1=new Dog();
        ob1.sleep();
        ob1.eat();
        Animal ob2=new Cat();
        ob2.sleep();
        ob2.eat();
    }
}
