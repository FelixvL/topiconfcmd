package topiconfcmd;

import java.util.Scanner;

public class EvenementPlanner 
{
	Scanner scanner = new Scanner(System.in);
	private int keuze;
	
	private int openingTijd = 9;
	private int dichtTijd = 18;
	
	Spreker spreker = new Spreker();
	Medewerker medewerker = new Medewerker();
	
	
	public void start()
	{
		System.out.println("De evenement planner komt op het werk.");
		
		startTopiConf();
//		new Bezoeker().bezoekersInfo();
	}
	
	public void startTopiConf()
	{
		// Spreker doet openings praatje
		spreker.openingSpeech();
		
		// keuze van klant naar welke tent ze willen(scanner)
		System.out.println("Naar welke tent wilt u gaan?");
		System.out.println("1: Tent 1");
		System.out.println("2: Tent 2");
		keuze = scanner.nextInt();
		
		
		// tent openen
		switch(keuze) 
		{
			case 1:
				medewerker.tentOpenen("Tent 1");
				break;
			case 2:
				medewerker.tentOpenen("Tent 2");
				break;
		}
		
		
		
	}
	
	public void openingsTijden()
	{
		System.out.printf("We gaan open om %d, en sluiten om %d%n", openingTijd, dichtTijd);
	}
	
	
}
