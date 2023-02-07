package topiconfcmd;
import java.util.Scanner;

public class Bezoeker {
    private String naam;
    private int leeftijd;
    private String redenVoorBezoek;
    
    public Bezoeker() {}

    public Bezoeker(String naam, int leeftijd, String redenVoorBezoek) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.redenVoorBezoek = redenVoorBezoek;
    }

    public void bezoekersInfo() {
        System.out.println("Naam: " + naam);
        System.out.println("Leeftijd: " + leeftijd);
        System.out.println("Reden voor bezoek: " + redenVoorBezoek);
    }

    public void start() {
        System.out.println("Welkom bezoekers!");
        
        new EvenementPlanner().openingsTijden();
        
        vondUhetLeuk topiConf = new vondUhetLeuk();
        topiConf.startTopiConf();
    }

	
		
	}

// vondUhetLeuk v = new vondUhetLeuk();
// v.startTopiConf(); 

class vondUhetLeuk  {
    public void startTopiConf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vond u het bezoek leuk? (ja/nee): ");
        String mening = sc.nextLine();

        if (mening.equalsIgnoreCase("ja")) {
            System.out.println("Geweldig, blij dat u het bezoek leuk vond!");
        } else if (mening.equalsIgnoreCase("nee")) {
            System.out.println("Jammer, hopelijk heeft u toch wat aan uw bezoek gehad.");
        } else {
            System.out.println("Ongeldige invoer. Probeer het opnieuw.");
        }
    }
}

