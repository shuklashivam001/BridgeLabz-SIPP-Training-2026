package core_java_practice.core_java_practice.gcr_codebase.methods.Level3;

import java.util.Arrays;

public class OTPGenerator {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {

            for (int j = i + 1; j < otpArray.length; j++) {

                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otpArray = new int[10];

        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otpArray));

        System.out.println("All OTPs Unique = " + areUnique(otpArray));
    }
}