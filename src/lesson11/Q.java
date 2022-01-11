package lesson11;

public class Q {
    int n;

    synchronized int get (){
        System.out.println("polucheno " + n);
        return n;
    }
    synchronized void put (int n){
        this.n = n;
        System.out.println("Otpravleno " + n);
    }
}
