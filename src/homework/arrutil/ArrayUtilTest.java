package homework.arrutil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {25, 55, 89, 65, 14, 2, 77, 6, 32, 15};
        int[] array2 = {14, 65, 78, 11, 5, 98, 36, 47, 32, 7,};
        arrayUtil.element(array);
        arrayUtil.max(array);
        int arrayMax = arrayUtil.max(array);
        int arrayMax2 = arrayUtil.max(array2);
        if (arrayMax > arrayMax2) {
            System.out.println("mec tiv@ array-i mejn e " + arrayMax);
        } else {
            System.out.println("mec tiv@ array2-i mejn e " + arrayMax2);
        }
        arrayUtil.min(array);
        int arrayMin = arrayUtil.min(array);
        int arrayMin2 = arrayUtil.min(array2);
        if (arrayMin == arrayMin2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        arrayUtil.evens(array);
        arrayUtil.evens(array2);
        arrayUtil.odd(array);
        arrayUtil.odd(array2);
        arrayUtil.oddqanak(array);
        int oddQanak = arrayUtil.oddqanak(array);
        int oddQanak2 = arrayUtil.oddqanak(array2);
        if (oddQanak > oddQanak2) {
            System.out.println("kenteri mec qanak@ array-i mejn e " + oddQanak);
        } else {
            System.out.println("kenteri mec qanak@ array2-i mejn e " + oddQanak2);
        }

        double mijinTvab = arrayUtil.mijin(array);
        double mijinTvab2 = arrayUtil.mijin(array2);
        if (mijinTvab > mijinTvab2) {
            System.out.println("tveri mec mijin  tvabanakan@ array-i mejn e " + mijinTvab);
        } else {
            System.out.println("tveri mec mijin tvabanakan@ array2-i mejn e " + mijinTvab2);
        }
        arrayUtil.gumar(array);
        arrayUtil.gumar(array2);



    }
}
