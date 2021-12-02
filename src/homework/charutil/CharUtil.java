package homework.charutil;

public class CharUtil {
    public static void main(String[] args) {
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;

            }
        }
        System.out.println(count);


        // պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] x = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] y = new char[2];
        if (x.length % 2 == 0) {
            y[0] = x[(x.length / 2) - 1];
            y[1] = x[x.length / 2];
            System.out.println(y[0] + ", " + y[1]);

        }

        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'y'};
        boolean a = false;
        if (bolola2[bolola2.length - 2] == 'l' && bolola2[bolola2.length - 1] == 'y') {
            a = true;

        }
        System.out.println(a);


        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bolol = {'b', 'o', 'l', 'o', 'l', 'a'};
        boolean isBob = false;
        for (int i = 0; i < bolol.length - 2; i++) {
            if (bolol[i] == 'b' && bolol[i + 2] == 'b') {
                isBob = true;
                break;

            }

        }
        System.out.println(isBob);


        // Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;
        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }


    }
}

