package lesson14;

public class TwoGen <T, V>{
    T ob1;
    V ob2;
    TwoGen (T o1,V o2){
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes(){
        System.out.println("Tip T: " + ob1.getClass().getName());
        System.out.println("Tip V: " + ob2.getClass().getName());
    }
    T getob1(){
        return ob1;
    }
    V getob2(){
        return ob2;
    }
}
