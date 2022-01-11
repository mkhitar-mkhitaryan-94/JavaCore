package lesson11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("odin");
        new NewThread2("dva");
        new NewThread2("tri");
        try{
            Thread.sleep(10000);

        }catch (InterruptedException e ){
            System.out.println("Glavni potok prervan");
        }
        System.out.println("Glavni potok zavershen");
    }
}
