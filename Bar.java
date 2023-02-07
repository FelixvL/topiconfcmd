package topiconfcmd;

public class Bar {
    private StringBuilder keuzeMenu = new StringBuilder();

    public void start() {
        this.keuzeMenu();
    }

    private void keuzeMenu() {
        keuzeMenu.append("Hallo, kan ik u iets te drinken inschenken?\n");
        keuzeMenu.append("U mag keizen uit:\n");
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
}