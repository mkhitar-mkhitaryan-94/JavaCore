package homework.charutill;

public class CharUtilTest {
    public static void main(String[] args) {
        CharUtil charUtil = new CharUtil();
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        charUtil.count(bolola);
        int count = charUtil.count(bolola);
        System.out.println(count);
        charUtil.centresymbol(bolola);
        System.out.println();
        charUtil.symbol(bolola);
        charUtil.bob(bolola);
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' '};
        charUtil.prabel(text);

    }
}
