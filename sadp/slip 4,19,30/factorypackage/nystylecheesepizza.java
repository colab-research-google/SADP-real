package factorypackage;

public class nystylecheesepizza extends pizza
{
  public nystylecheesepizza()
  {
    name="ny style deep dish cheese pizza";
    dough="extra thick crust dough";
    sauce="plum tomato sauce";

    topping.add("grated regginao cheese");
    
  }
void cut()
{
  System.out.println("cutting the pizza into diagonal slice");
}
}