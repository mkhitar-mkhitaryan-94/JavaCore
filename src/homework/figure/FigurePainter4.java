package homework.figure;

public class FigurePainter4 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4- i; j++) {
                System.out.print(" ");
            }
            for (int k = 4-i; k < 5  ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
