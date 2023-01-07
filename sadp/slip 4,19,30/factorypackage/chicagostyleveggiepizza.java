package factorypackage;

public class chicagostyleveggiepizza extends pizza
{
  public chicagostyleveggiepizza()
  {
    name="chicago style deep dish cheese pizza";
    dough="extra thick crust dough";
    sauce="plum tomato sauce";

    topping.add("shrdded mozzerella cheese");
    topping.add("black olives");
    topping.add("spinech");
    topping.add("eggplant");
  }
void cut()
{
  System.out.println("cutting the pizza into diagonal slice");
}
}