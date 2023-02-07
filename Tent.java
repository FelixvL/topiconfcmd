package topiconfcmd;

public class Tent {
	
	public boolean isOpen;
	public String name;
	
	void start() {
		System.out.println("Dit zijn tenten");
		tentIsIngezakt();
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	
	public void tentIsIngezakt() {
		Medewerker.setHelpEenIngezakteTent(true);
			System.out.println(name + " is ingezakt");
	}
}
