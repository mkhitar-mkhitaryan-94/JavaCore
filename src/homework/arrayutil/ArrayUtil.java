package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 55, 14, 97, 33, 84, 2, 42, 99, 25};
        // Տպեք մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Տպեք մասիվի ամենամեծ թիվը
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println(maximum);


        // Տպեք մասիվի ամենափոքրը թիվը

        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];

            }
        }
        System.out.println(minimum);


        //Տպեք մասիվի բոլոր զույգ էլեմենտները
        int zuyg;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                zuyg = array[i];
                System.out.print(zuyg + " ");
            }
        }
        System.out.println();
        // Տպեք մասիվի բոլոր կենտ էլեմենտները։
        int kent;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                kent = array[i];
                System.out.print(kent + " ");
            }

        }
        System.out.println();
        // Տպեք զույգերի քանակը։
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                z++;

            }
        }
        System.out.print(z + " ");
        System.out.println();


        // Տպեք կենտերի քանակը
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                k++;

            }
        }
        System.out.print(k + " ");
        System.out.println();


        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        double result=0;
        if (array.length>0) {
        double gumar = 0;
            for (int i = 0; i < array.length; i++) {
                gumar = gumar + array[i];
            }
            result = gumar / array.length;
            System.out.println(result);
        }


        // Տպեք մասիվի էլեմենտների գումարը։


        int gumar = 0;
       for (int i = 0; i < array.length; i++) {
           gumar = gumar + array[i];
       }

        System.out.print(gumar);
    }

}


