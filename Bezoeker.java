package topiconfcmd;


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
    }
}


