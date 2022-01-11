package lesson11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("Odin");
        NewThread3 ob2 = new NewThread3("Dva");
        NewThread3 ob3 = new NewThread3("Tri");
        System.out.println("Potok Odin zapushen: " + ob1.t.isAlive());
        System.out.println("Potok Dva zapushen: " + ob2.t.isAlive());
        System.out.println("Potok Tri zapushen: " + ob3.t.isAlive());

        try {
            System.out.println("Ojidanie zaversheniya potokov ");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Glavni potok prervan");
        }
        System.out.println("Potok Odin zapushen: " + ob1.t.isAlive());
        System.out.println("Potok Dva zapushen: " + ob2.t.isAlive());
        System.out.println("Potok Tri zapushen: " + ob3.t.isAlive());
        System.out.println("Glavni potok zavershen");
    }
}


