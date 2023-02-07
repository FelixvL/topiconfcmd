package topiconfcmd;

public class Tent {
	
	public boolean isOpen;
	public String name;
	public Bar bar; 
	Voedsel voedselTent = new Voedsel();
	
	
	public void start() {
		System.out.println("Dit zijn tenten");
		tentIsIngezakt();
	}
	
	public void barOpen() {
		if (isOpen == true) {
			
			voedselTent.voedselWeergeven();
			
			Medewerker werker1 = new Medewerker("Timo", "Bellert", 32);
			Medewerker werker2 = new Medewerker("Gideon", "Goderski", 32);
			Medewerker werker3 = new Medewerker("Claudia", "van der Meijden", 32);
			bar = new Bar(werker1, werker2, werker3);
			System.out.println("Bar is geopend");
		}
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	
	public void tentIsIngezakt() {
		new Medewerker().setHelpEenIngezakteTent(true);
			System.out.println(name + " is ingezakt");
	}
}
