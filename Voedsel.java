package topiconfcmd;
import java.util.*;

public class Voedsel {
	Spreker s = new Spreker();
	
	String v1 = "lasagne";
	String v2 = "macaroni";
	String v3 = "Stampot";

	int am1 = 3;
	int am2 = 2;
	int am3 = 1;
	
	void start() {
		opwarmen();
		System.out.println("Dit is het voedsel wat wij hebben:");
		System.out.println("1. "+v1+ " dit kost "+ am1+" munten");
		System.out.println("2. "+v2+ " dit kost "+ am2+" munten");
		System.out.println("3. "+v3+ " dit kost "+ am3+" munten");
		s.vult();
	}
	void opwarmen() {
		System.out.println("het eten wordt opgewarmt");
	}
	void eetVoedsel() {
		System.out.println("spreker glenn the man eet zijn macaroni");
	}
}
