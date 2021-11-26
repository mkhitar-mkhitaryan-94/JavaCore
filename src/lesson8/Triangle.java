package lesson8;

public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);


    }
    double area(){
        System.out.println("V oblasti treugolnika");
        return dim1 * dim2 / 2;

    }
}
