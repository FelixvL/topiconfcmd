package topiconfcmd;

public class Student {
	private boolean isDrunk;
	private double money = 20;

   public void start() {
	  System.out.println("Start: Student");
   } 
   public Student(boolean drunk) {
	   this.isDrunk = drunk;
   }
   public boolean getIsDrunk() {
	   return this.isDrunk;
   }
   public void OrderDrink(Bar bar) {
	   if(bar.getBierPrice()<=this.money) {
		   this.money -= bar.getBierPrice();
		   System.out.println("Lets start the party!!");
	   }
	   else {System.out.println("I have noe enough money....");}
	   
   }
   
}
