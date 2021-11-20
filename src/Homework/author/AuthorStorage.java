package Homework.author;

public class AuthorStorage {
    private Author[] authors = new Author[16];
    private int size;


    AuthorStorage() {

    }

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }


    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println(index);
            return null;
        }
        return authors[index];
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(authors[i] + " ");
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword)) {
                System.out.println(authors[i]);
            }

        }

    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() > minAge && authors[i].getAge() < maxAge) {
                System.out.println(authors[i]);
            }
        }

    }
}
