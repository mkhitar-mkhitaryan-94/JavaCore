package lesson7;

public class OverloadDemo {
    void test(){
        System.out.println("Parametry otsutstvuyut");
    }
    void test (int a ){
        System.out.println("a: " + a);
    }
    void test (int a, int b) {
        System.out.println(" a i b : " + a + " " + b);
    }
    double test (double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}
