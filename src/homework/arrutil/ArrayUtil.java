package homework.arrutil;

public class ArrayUtil {
    void element(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return (max);
    }

    int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];

            }
        }
        return (minimum);

    }

    void evens(int[] array) {
        int evens = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens = array[i];
                System.out.print(evens + " ");

            }

        }
        System.out.println();
    }

    void odd(int[] array) {
        int kent;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                kent = array[i];
                System.out.print(kent + " ");
            }
        }
        System.out.println();
    }

    int oddqanak(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                k++;

            }
        }
        return k;
    }

    double mijin(int[] array) {
        double result = 0;
        if (array.length > 0) {
            double gumar = 0;
            for (int i = 0; i < array.length; i++) {
                gumar = gumar + array[i];
            }
            result = gumar / array.length;

        }
        return result;
    }

    void gumar(int[] array) {
        int gumar = 0;
        for (int i = 0; i < array.length; i++) {
            gumar = gumar + array[i];
        }
        System.out.print(gumar + " ");
    }
}




