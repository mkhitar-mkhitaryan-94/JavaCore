package lesson12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Znachenie ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel) ;
        System.out.println("Peremennaya ap soderjit GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Sort Jonathan krasnyi");
                break;
            case GoldenDel:
                System.out.println("Sort Golden Delicius jelty");
                break;
            case RedDel:
                System.out.println("Sort Red Deliciud krasny");
                break;
            case Winesap:
                System.out.println("Sort Winesap krasny");
                break;
            case Cortland:
                System.out.println("Sort Cortland krasny");
        }

    }
}
