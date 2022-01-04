package lesson14;

public class RawDemo {
    public static void main(String[] args) {
        Gen <Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<>("Test obobsheno");
        Gen raw = new Gen(new Double (98.6));
        double d = (Double) raw.getob();
        System.out.println("Znachenie : " + d);

    }
}
class Gens <T>{
    T ob ;
    Gens (T o ){
        ob = o;

    }
    T getob (){
        return ob;
    }


}
