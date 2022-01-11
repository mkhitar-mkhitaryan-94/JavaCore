package lesson11;

public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " voshel v metod B.bar()");

        try{
            Thread.sleep(1000);

        }catch (Exception e){
            System.out.println("Klass B prervan");
        }
        System.out.println(name + " pytaetsya byzvat metod A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("V metode A.last()");
    }
}
