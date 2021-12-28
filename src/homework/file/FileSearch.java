package homework.file;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("Path does not exists or is not directory");

        } else {
            System.out.println("please input file name");
            String fileName = scanner.nextLine();
            findFIle(path, fileName);
        }
    }
    static void findFIle(File parent, String fileName) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFIle(file, fileName);
            } else {
                if (file.getName().contains(fileName)) {
                    System.out.println(file.getAbsoluteFile());
                    break;

                }
            }
        }
    }
}

