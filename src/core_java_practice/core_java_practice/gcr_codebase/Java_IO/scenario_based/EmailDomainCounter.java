package core_java_practice.core_java_practice.gcr_codebase.Java_IO.scenario_based;

import java.io.*;

public class EmailDomainCounter {
    public static void main(String[] args) {

        int gmail = 0;
        int yahoo = 0;

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                String domain =
                        email.substring(email.indexOf("@") + 1);

                if (domain.equals("gmail.com")) {
                    gmail++;
                }
                else if (domain.equals("yahoo.com")) {
                    yahoo++;
                }
            }

            br.close();

            System.out.println("Gmail Users = " + gmail);
            System.out.println("Yahoo Users = " + yahoo);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}