package core_java_practice.core_java_practice.gcr_codebase.exception_handling;

import java.io.*;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader("info.txt"))) {

            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}