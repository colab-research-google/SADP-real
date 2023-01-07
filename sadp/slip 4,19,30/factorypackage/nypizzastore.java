package factorypackage;

public class nypizzastore extends pizzastore
{
  pizza createPizza(String item)
  {
    if(item.equals("cheese"))
    {
      return new nystylecheesepizza();
    }
    else if(item.equals("veggie"))
    {
      return new nystyleveggiepizza();
    }
    else return null;
  }
}