package homework.figurePainter;

public class FigurePainter {
    void figureOne( int n , char c){
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    void figureTwo(){
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i  ; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
    void figureThree(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    void figureFour(){
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
    void figureFive(){
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
