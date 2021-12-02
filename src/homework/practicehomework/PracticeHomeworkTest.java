package homework.practicehomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework practice = new PracticeHomework();
        System.out.println(practice.convert(5));
        System.out.println(practice.calcAge(2));
        System.out.println(practice.nextNumber(5));
        System.out.println(practice.isSameNum(5, 5));
        System.out.println(practice.lessThanOrEqualToZero(1));
        System.out.println(practice.reverseBool(false));
        int[] array1 = {5, 9, 78, 22, 66, 47, 45};
        int[] array2 = {32, 58, 74, 12};
        System.out.println(practice.maxLength(array1,array2));

    }

}
