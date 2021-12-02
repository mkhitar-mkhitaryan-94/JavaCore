package homework.figure;

public class FigurePainter5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
