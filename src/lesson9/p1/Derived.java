package lesson9.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("konstruktor podklassa ");
        System.out.println("n = " + n);

        // dostupno tolko dlya klassa
        // System.out.println("n_pri = "4 + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
