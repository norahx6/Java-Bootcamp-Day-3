package Day3;

public class homework2 {

    public static void main(String[] args) {

        int num1=400;
        System.out.println(calculateTax(num1));

    } // end

    public static int calculateTax(int num1) {
        int tax2 = 0;

        if (num1 >= 100 && num1 <= 500) {
            System.out.println("your tax is");
            tax2 = num1 * 15 / 100;
        }
        else {
            System.out.println("Sorry Over Range ");
        }
        return tax2;
    }


}// end
