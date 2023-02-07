package topiconfcmd;

import java.util.ArrayList;
import java.util.Scanner;


public class Student  {
	private boolean isDrunk;
	private double money = 20;
	public String name;
	

   public void start() {
	  System.out.println("Start: Student");
   } 
   //CONSTRUCTORS
   
   //default constructor
   public Student() {}
   
   
   // client with unknown name
   public Student (boolean isDrunk) {
	   this.isDrunk = isDrunk;
   }
   
   // sober students
   public Student(String name) {
	   this.name = name;
   }
   
   public Student(String name, boolean isDrunk) {
	   this(isDrunk);
	   this.name = name;
   }
   
   
   //GETTERS AND SETTERS
   
   public boolean getIsDrunk() {
	   return this.isDrunk;
   }
   public String getName() {
	   return this.name;
   }
   public void setName(String name) {
	   if (name == null) {
		   System.out.println("Name cannot be null");
		   return;
	   }
	   this.name=name;
   }
   
   //create students and return list of them
   public ArrayList<Student> getAFriendGroup() {
	   ArrayList<Student> friends = new ArrayList<>(5);
	   createGroup(friends);
	   return friends;
   }
   
   //OTHER METHODS
   
   
   //order drink 
   public void OrderDrink(Bar bar) {
	   if(bar != null) {
		   
		   if(bar.getBierPrice()<=this.money) {
			   this.money -= bar.getBierPrice();
			   System.out.println("Lets start the party!!");
		   }
		   else {System.out.println("I have noe enough money....");}
	   }
   }
   
   // create new students
    private void createGroup(ArrayList<Student> friends) {
    	Scanner in = new Scanner(System.in);
    	String name;
    	
    	while(true) {
    		System.out.println("Add new name or press Q to quit");
    		name = in.nextLine();
    		
    		if(name.equalsIgnoreCase("q")) {break;}
    		friends.add(new Student(name));
    	}
    }
   
}
