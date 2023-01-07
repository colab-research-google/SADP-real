package factorypackage;

public class nystyleveggiepizza extends pizza
{
  public nystyleveggiepizza()
  {
    name="ny style deep dish cheese pizza";
    dough="extra thick crust dough";
    sauce="plum tomato sauce";

    topping.add("shrdded mozzerella cheese");
    topping.add("black olives");
    topping.add("spinech");
    topping.add("eggplant");
    topping.add("tomato");
  }
void cut()
{
  System.out.println("cutting the pizza into diagonal slice");
}
}