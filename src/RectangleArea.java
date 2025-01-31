public class RectangleArea {
    public static void main(String[] args) {

        double width = Double.valueOf(args[0]);
        double height = Double.valueOf(args[1]);
        double area = width*height;
        System.out.print("The area of a " + width + " by " + height + " rectangle is " + area + ".");


    }
}
