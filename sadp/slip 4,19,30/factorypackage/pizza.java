package factorypackage;

import java.util.ArrayList;

public abstract class pizza
{
  String name;
  String dough;
  String sauce;
  ArrayList topping=new ArrayList();

void prepare()
{
  System.out.println("preparing"+name);
  System.out.println("Tossing dough..");
  System.out.println("Adding Sauce..");
  System.out.println("Adding toppings");
  for(int i=0;i<topping.size();i++)
  {
    System.out.println(".."+topping.get(i));
  }
}

void bake()
{
  System.out.println("bake for 25 mins at 350");
}
void cut()
{
 System.out.println("cutting the pizza into diagonal slice");
}
void box()
{
System.out.println("place pizza in offical pizza store box");
}

public String getname()
{
   return name;
}

public String toString()
{
   StringBuffer display=new StringBuffer();
   display.append("..."+name+"...\n");
   display.append(dough+"\n");
   display.append(sauce+"\n");
   for(int i=0;i<topping.size();i++)
   {
    display.append((String)topping.get(i)+"\n");
   }
 return display.toString();
}
}
   

