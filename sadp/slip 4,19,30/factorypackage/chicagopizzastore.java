package factorypackage;

public class chicagopizzastore extends pizzastore
{
  pizza createPizza(String item)
  {
    if(item.equals("cheese"))
    {
      return new chicagostylecheesepizza();
    }
    else if(item.equals("veggie"))
    {
      return new chicagostyleveggiepizza();
    }
    else return null;
  }
}

 