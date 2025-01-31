public class DoubleDiscount {
    public static void main(String[] args) {

        double num1 = Double.valueOf(args[0]);
        double num2 = Double.valueOf(args[1]);
        double discountPrice = num1 - (num1*0.15);
        System.out.println("The sale price is " + discountPrice + ".");

        /*
        Integer.valueOf(s)
        Double.valueOf(s)
        Long.valueOf(s)
        Boolean.valueOf(s)
         */

    }
}