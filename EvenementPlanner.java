package topiconfcmd;

public class EvenementPlanner 
{
	private int openingTijd = 9;
	private int dichtTijd = 18;
	
	
	public void start()
	{
		System.out.println("De evenement planner komt op het werk.");
		
		new Bezoeker.bezoekersInfo();
	}
	
	
	public void openingsTijden()
	{
		System.out.printf("We gaan open om %f, en sluiten om %f%n", openingTijd, dichtTijd);
	}
	
	
}
