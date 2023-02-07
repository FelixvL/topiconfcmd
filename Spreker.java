package topiconfcmd;

public class Spreker {
	private String firstName;
	private String lastName;
	private String language;
	
	void start(){
		System.out.println("Spreker start() is aangeroepen.");
		test();
		Voedsel macaroni = new Voedsel();
		macaroni.eetVoedsel();
	}
	
	void vult() {
		System.out.println("\nSpreker heeft gegeten en zijn maag is nu gevuld.\n");
	}
	
	void test() {
		System.out.println("\nDe test methode word aangeroepen, maakt een test spreker aan en print info.");
		Spreker test = new Spreker();
		test.firstName = "Glenn";
		test.lastName = "Bakker";
		test.language = "Nederlands";
		test.printInfo();
	}
	
	public void printInfo() {
		System.out.println("Deze spreker heet: " + firstName + " " + lastName);
		System.out.println("Hij/Zij spreekt de volgende taal: " + language);
	}
}
