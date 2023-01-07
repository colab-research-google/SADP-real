package factorypackage;

public class chicagostylecheesepizza extends pizza
{
  public chicagostylecheesepizza()
  {
    name="chicago style deep dish cheese pizza";
    dough="extra thick crust dough";
    sauce="plum tomato sauce";

    topping.add("shrdded mozzerella cheese");
  }
void cut()
{
  System.out.println("cutting the pizza into diagonal slice");
}
}
