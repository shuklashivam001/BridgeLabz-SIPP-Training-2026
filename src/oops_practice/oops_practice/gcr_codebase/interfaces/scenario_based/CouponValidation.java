package oops_practice.oops_practice.gcr_codebase.interfaces.scenario_based;

interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE");
    }
}

public class CouponValidation {
    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "OFF20",
                "SAVE50",
                "AB12",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            if (cart.validateCoupon(code)) {
                System.out.println(code + " : Valid");
            } else {
                System.out.println(code + " : Invalid");
            }
        }
    }
}