package topiconfcmd;

public class Main {
	public static void main(String[] args) {
		System.out.println("topiconf gestart");
		Tent tent = new Tent();
		tent.start();
		Spreker spreker = new Spreker();
		spreker.start();
		Bezoeker bezoeker = new Bezoeker();
		bezoeker.start();
		Student student = new Student(true);
		student.start();
		Bar bar = new Bar();
		bar.start();
		Medewerker medewerker = new Medewerker("Egebert","Willemsen", 55);
		medewerker.start();
		Voedsel voedsel = new Voedsel();
		voedsel.start();
		EvenementPlanner evenementPlanner = new EvenementPlanner();
		evenementPlanner.start();

		bar.takeOrder(student);
		System.out.println("================");
		evenementPlanner.startTopiConf();
	}
}
