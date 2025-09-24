public class Main {
    // 1.a - main-metoden
    public static void main(String[] args) {
        // 1.g - opret et Team-objekt
        Team a = new Team("De Uovervindelige");

        // 1.i - sæt rang
        a.setRank(3);

        // 1.l - tilføj nogle spillere
        a.addPlayer("Anna");
        a.addPlayer("Bilal");
        a.addPlayer("Carla");

        // Print teamet (1.j)
        System.out.println(a);
        System.out.println(); // tom linje for luft

        // 1.k - lav 5 flere teams og print dem
        Team b = new Team("Lynene");
        b.setRank(1);
        b.addPlayer("David");
        b.addPlayer("Elin");
        System.out.println(b);
        System.out.println();

        Team c = new Team("Stormridere");
        c.setRank(2);
        c.addPlayer("Felix");
        System.out.println(c);
        System.out.println();

        Team d = new Team("Natskyggerne");
        d.setRank(5);
        System.out.println(d);
        System.out.println();

        Team e = new Team("Hedehestene");
        e.setRank(4);
        e.addPlayer("Gina");
        e.addPlayer("Hassan");
        e.addPlayer("Ida");
        System.out.println(e);
        System.out.println();

        Team f = new Team("Nordlys");
        f.setRank(6);
        System.out.println(f);
    }
}


