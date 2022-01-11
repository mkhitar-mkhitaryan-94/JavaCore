package lesson11;

public class MyThread extends Thread{
    MyThread(){
        super("Demonstraciono potok");
        System.out.println("Docherni potok: " + this);
        start();
    }
    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Docherni potok : " + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Docherni potok prervan");

        }
        System.out.println("docherni potok zavershen");
    }
    }

