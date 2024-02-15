public class Dog2 extends Animal2
{
  String breed;
  Dog2(String color,String breed){
      super(color);
      this.breed=breed;

  }
  void display(){
      System.out.println("breed is :"+this.breed);
      System.out.println("color is ;"+super.color);
  }
  void eat()
  {
      super.eat();
      System.out.println("Dog is eating");
  }
}
