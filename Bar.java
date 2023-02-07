package topiconfcmd;

import java.util.Scanner;

public class Bar {
    private StringBuilder keuzeMenu = new StringBuilder();
    private String beer;

    public double getBierPrice() {
        return bierPrice;
    }

    private final double bierPrice = 2.50;

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