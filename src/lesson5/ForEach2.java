package lesson5;

public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println(" Znachenie ravno : " + sum);
            sum += x;
            if (x == 5) ;
            break;

        }
        System.out.println("Summa pyati pervix elementov ravna : " + sum);
    }
}
