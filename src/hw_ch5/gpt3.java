package hw_ch5;
import java.io.*;
import java.util.Scanner;

class FileReaderExample { // 移除 public
    public static void main(String[] args) {
        try {
            File file = new File("example.txt"); // 假設 example.txt 已存在
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
