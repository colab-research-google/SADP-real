package factorypackage;

public abstract class pizzastore
{
  abstract pizza createPizza(String item);

public pizza orderPizza(String type)
{
  pizza pizza=createPizza(type);
  System.out.println("making a"+pizza.getname()+"...");
  pizza.prepare();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;
}
}