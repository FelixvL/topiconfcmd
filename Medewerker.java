package topiconfcmd;

public class Medewerker {
		public String naam;
		public String achternaam;
		public String leeftijd;
		public boolean heeftVakantie;
		public String afdeling;
		
		
		public String getNaam() {
			return naam;
		}

		public void setNaam(String naam) {
			this.naam = naam;
		}

		public String getAchternaam() {
			return achternaam;
		}

		public void setAchternaam(String achternaam) {
			this.achternaam = achternaam;
		}

		public String getLeeftijd() {
			return leeftijd;
		}

		public void setLeeftijd(String leeftijd) {
			this.leeftijd = leeftijd;
		}

		public boolean isHeeftVakantie() {
			return heeftVakantie;
		}

		public void setHeeftVakantie(boolean heeftVakantie) {
			this.heeftVakantie = heeftVakantie;
		}

		public String getAfdeling() {
			return afdeling;
		}

		public void setAfdeling(String afdeling) {
			this.afdeling = afdeling;
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
		
}
