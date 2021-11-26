package lesson8;

public class Regtangle extends Figure{
    Regtangle(double a , double b) {
        super(a, b);

    }
        double area(){
            System.out.println("V oblasti chetyrexugolnika ");
            return dim1 * dim2;
        }

    }

