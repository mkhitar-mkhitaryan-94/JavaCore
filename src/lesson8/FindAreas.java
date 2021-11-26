package lesson8;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Regtangle r = new Regtangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("Ploshad ravna " + figref.area());

        figref = t;
        System.out.println("Ploshad ravna " + figref.area());

        figref = f;
        System.out.println("Ploshad ravna " + figref.area());


    }
}
