package core_java_practice.core_java_practice.gcr_codebase.Java_IO.scenario_based;

import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("inventory.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("-");

                String product = data[0];
                int quantity =
                        Integer.parseInt(data[1]);

                if (quantity == 0) {
                    System.out.println(
                            product + " is out of stock");
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}