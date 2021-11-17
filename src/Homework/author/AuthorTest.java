package Homework.author;

import java.util.Scanner;

public class AuthorTest {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Մուտկագրեք հեղինակների քանակը: ");
        int x = scanner.nextInt();
        AuthorStorage authorStorage = new AuthorStorage();
        for (int i = 0; i < x; i++) {
            System.out.println("Մուտկագրեք հեղինակի անունը: ");
            String name = scanner.next();
            System.out.println("Մուտկագրեք հեղինակի ազգանունը: ");
            String surname = scanner.next();
            System.out.println("Մուտկագրեք հեղինակի էլ.հասցեն: ");
            String email = scanner.next();
            System.out.println("Մուտկագրեք հեղինակի տարիքը: ");
            int age = scanner.nextInt();
            System.out.println("Մուտկագրեք հեղինակի սեռը: ");
            String gender = scanner.next();
            Author author = new Author(name, surname, email, age, gender);
            authorStorage.add(author);

        }

        authorStorage.print();
    }
}
