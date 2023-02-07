package topiconfcmd;

import java.util.ArrayList;
import java.util.Scanner;

public class Bar {
    private StringBuilder keuzeMenu = new StringBuilder();
    private Scanner sc = new Scanner(System.in);
    private final double bierPrice = 2.50;
    private Student student = new Student();
    private ArrayList<Student> studentsAtTheBarArray = student.getAFriendGroup();


        public Bar(Medewerker medewerker1, Medewerker medewerker2, Medewerker medewerker3) {
            System.out.println("Hoi " + medewerker1.getNaam() + " fijn dat je komt helpen?");
            System.out.println("Heei " + medewerker2.getNaam() + " goed dat je er bent, we wachten nu nog op 1 collega");
            System.out.println("Aha, daar zul je " + medewerker3.getNaam() + medewerker3.getAchternaam() + " Hebben");

            System.out.println("Maar voordat we de bar openen, wat verdienen jullie eigenlijk?");
            System.out.println("Wat verdien jij " + medewerker1.getNaam() + " ?");
            System.out.println(medewerker1.getUurloon() + " ? " + " Aha, en jij " + medewerker2.getNaam() + " ?");
            System.out.println(medewerker2.getUurloon() + " ? " + " Allebei hetzelfde als ik." + " en jij " +medewerker3.getNaam());
            System.out.println(medewerker3.getUurloon() + " ? " + " Nou daar zit dus geen verschil tussen");
            System.out.println("Laten we iets gaan doen.");
        }

    public double getBierPrice() {
        return bierPrice;
    }



    public void start() {
        this.keuzeMenu();
    }

    private void keuzeMenu() {
        keuzeMenu.append("Hoi wat mag het zijn?\n");
        keuzeMenu.append("Je mag keizen uit:\n");
        keuzeMenu.append("1. Cola\n");
        keuzeMenu.append("2. Fanta\n");
        keuzeMenu.append("3. Cassis\n");
        keuzeMenu.append("4. Bier\n");
        keuzeMenu.append("5. droge witte wijn\n");
        keuzeMenu.append("6. rode wijn\n");
        keuzeMenu.append("7. Bacardi Cola\n");
        keuzeMenu.append("8. Pina Colada\n");
        keuzeMenu.append("9. Bailys\n");
        keuzeMenu.append("10. water");


    }

    public void takeOrder(Student student) {
        if (student.getIsDrunk()) {
            System.out.println("Sorry, lijkt mij niet verstandig, jij hebt al genoeg gedronken");
        } else {
            System.out.println("Jij bent nog niet dronken dus jij mag nog el een biertje");
            student.OrderDrink(this);
        }
    }
}