package homework.charutill;

public class CharUtil {
    int count(char[] bolola) {
        char count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }
        }
        return count;
    }
    void centresymbol(char[] bolola) {
        char[] y = new char[2];
        if (bolola.length % 2 == 0) {
            y[0] = bolola[(bolola.length / 2) - 1];
            y[1] = bolola[bolola.length / 2];
            System.out.println(y[0] + ", " + y[1]);
        }
    }

    void symbol(char[] bolola) {
        boolean a = false;
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            a = true;

        }
        System.out.println(a);
    }

    void bob(char[] bolola) {
        boolean isBob = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                isBob = true;
                break;

            }

        }
        System.out.println(isBob);
    }
    void prabel (char [] text){
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
