package homework.file;

import java.io.IOException;

public class FileUtilTest {
    public static void main(String[] args) throws IOException {
        FileUtil fileTest = new FileUtil();
        fileTest.findLines("C:\\Users\\NEK\\IdeaProjects\\JavaCore\\src\\homework\\file\\fileexample\\folder1\\poxos.txt", "world");
        fileTest.printSizeOfPackage("C:\\Users\\NEK\\IdeaProjects\\JavaCore\\src\\homework\\author");
        fileTest.createFileWithContent("C:\\Users\\NEK\\Desktop\\mxo","mxo.txt","mkhitaryan");
    }
}
