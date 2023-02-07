package topiconfcmd;

public class Spreker {
	private String firstName;
	private String lastName;
	private String spokenLanguage;
	private boolean givenOpeningsSpeech = false;
	
	void start(){
		System.out.println("Spreker start() is aangeroepen.");
//		test();
		Voedsel macaroni = new Voedsel();
		macaroni.eetVoedsel();
	}
	
	void vult() {
		System.out.println("Spreker heeft gegeten en zijn maag is nu gevuld.\n");
	}
	
	void test() {
		System.out.println("\nDe test methode word aangeroepen, maakt een test spreker aan en print info.");
		Spreker test = new Spreker();
		test.geefNaam("Glenn","Bakker");
		test.geefSpreekTaal("Nederlands");
		test.printInfo();
	}
	
	public void geefNaam(String voornaam, String achternaam) {
		this.geefVoornaam(voornaam);
		this.geefAchternaam(achternaam);
	}
	
	public void geefVoornaam(String voornaam) {
		firstName = voornaam;
	}
	
	public void geefAchternaam(String achternaam) {
		lastName = achternaam;
	}
	
	public String krijgNaam() {
		System.out.println();
		return krijgVoornaam() + " " + krijgAchternaam();
	}
	
	public String krijgVoornaam() {
		return firstName;
	}
	
	public String krijgAchternaam() {
		return lastName;
	}
	
	public void geefSpreekTaal(String taal) {
		spokenLanguage = taal;
	}
	
	public String krijgSpreekTaal() {
		return spokenLanguage;
	}
	
	public void printInfo() {
		System.out.println("Deze spreker heet: " + krijgNaam());
		System.out.println("Hij/Zij spreekt de volgende taal: " + krijgSpreekTaal());
	}
	
	public void openingSpeech() {
		if(!givenOpeningsSpeech) {
			givenOpeningsSpeech = true;
			System.out.println("\n*Ahem*");
			System.out.println("Welkom allemaal bij een nieuwe editie van TopiConf!");
			System.out.println("We hopen dat jullie veel zullen opsteken van besproken onderwerpen en dat het inspiratie opwekt.");
			System.out.println("Mocht je nog vragen hebben, kan je deze altijd stellen bij het informatiepunt.");
			System.out.println("Heel veel plezier allemaal!");
		} else {
			System.out.println("Opening speech is al gegeven.");
		}
	}
}
