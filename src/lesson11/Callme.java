package lesson11;

public class Callme {
    void call (String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Prervano");
        }
        System.out.println("]");
    }
}
