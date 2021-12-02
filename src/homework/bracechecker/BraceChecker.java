package homework.bracechecker;

public class BraceChecker {
    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    int br1 = stack.pop();
                    if (br1 != '{') {
                        System.out.println("Error: opened" + br1 + "[ but closed }" + i);

                    }
                    break;
                case ']':
                    int br2 = stack.pop();
                    if (br2 != '[') {
                        System.out.println("Error: opened" + br2 + "[ but closed ]" + i);

                    }
                    break;
                case ')':
                    int br3 = stack.pop();
                    if (br3 != '(') {
                        System.out.println("Error: opened" + br3 + "[ but closed )" + i);

                    }
                    break;

            }
        }
        for (int i = 0; i < text.length(); i++) {
            int br = stack.pop();
            if (br == 0) {
                System.out.println("Braces are balanced");
            } else {
                System.out.println("Opened " + br + "but dont closed");
            }
        }
    }
}

