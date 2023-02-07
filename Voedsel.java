package topiconfcmd;
import java.util.*;

public class Voedsel {
	Spreker s = new Spreker();
	Scanner sc = new Scanner(System.in);
	
	String v1 = "Hamburger";
	String v2 = "zalm";
	String v3 = "salade";

	int am1 = 3;
	int am2 = 2;
	int am3 = 1;
	
	void start() {
		opwarmen();
		System.out.println("start");
		s.vult();
	}
	void opwarmen() {
		System.out.println("het eten wordt opgewarmt");
	}
	void eetVoedsel() {
		System.out.println("spreker glenn the man eet zijn vis");
	}
	void voedselWeergeven() {
		
		System.out.println("het buffet is geopend, dit is waar je uit kunt kiezen:");
		System.out.println("1. "+v1);
		System.out.println("2. "+v2);
		System.out.println("3. "+v3);
		System.out.println("maak een keuze");
		int keuze = sc.nextInt();
		switch (keuze){
		case 1 :System.out.println("u koos een hamburger");
				break;
		case 2 :System.out.println("u koos een zalmpje");
				break;
		case 3 :System.out.println("u koos een salade");
				break;
			
		}
	}
}
