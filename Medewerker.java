package topiconfcmd;
import java.util.Scanner;

public class Medewerker {
		public String naam;
		public String achternaam;
		public int leeftijd;
		public double uurloon = 14.50;
		public boolean heeftVakantie = false;
		public boolean helpEenIngezakteTent = false;
		
		Medewerker(String naam, String achternaam, int leeftijd) {
			this.naam = naam;
			this.achternaam = achternaam;
			this.leeftijd = leeftijd;
		}
		public boolean isHelpEenIngezakteTent() {
			return helpEenIngezakteTent;
		}

		public void setHelpEenIngezakteTent(boolean helpEenIngezakteTent) {
			this.helpEenIngezakteTent = helpEenIngezakteTent;
		}

		public String getNaam() {
			return naam;
		}

		public String getAchternaam() {
			return achternaam;
		}

		public int getLeeftijd() {
			return leeftijd;
		}

		public boolean isHeeftVakantie() {
			return heeftVakantie;
		}

		public void setHeeftVakantie(boolean heeftVakantie) {
			this.heeftVakantie = heeftVakantie;
		}
		
		public double getUurloon() {
			return uurloon;
		}
		
		public void start() {
			System.out.println("Medewerker " + naam + achternaam + "Is klaar om te beginnen met werken.");
		}
		
		public void inklokken() {
			System.out.println("Medewerker gaat inklokken");
			System.out.println("ingeklokt op: " + java.time.LocalDateTime.now());
		}
		
		public void uitklokken() {
			System.out.println("Medewerker gaat uiklokken");
			System.out.println("uitgeklokt op: " + java.time.LocalDateTime.now());
		}
		
		public void opbouwen() {
			System.out.println("Bouwt het evenement op");
		}
		
		public void werken() {
			System.out.println("werkgeluid");
		}
		
		public void pauze() {
			System.out.println("Broodje eten....OM NOM NOM...");
			System.out.println("Praten over de wedstrijd van gister met collega");
			System.out.println("*Neemt slok koffie*");
		}
		
		public void opruimen() {
			System.out.println("Ruimt het evenement op");
		}
		
		public void tentOpenen(String naam) {
			System.out.println("De tijd breekt aan....het moment is daar. Iedereen klaar, tenten maar.");
			Tent tent = new Tent();
			tent.name = naam;
			tent.setOpen(true);
		}
}
