package Day3;

public class homework1 {
    public static void main(String[] args) {

        int num1=11;
        System.out.println(primeNumber(num1));

    } // end

    public static String primeNumber(int num1) {
        if (num1 == 1 || num1 == 2){
            return "Prime number";
        }
        else {
            for (int i = 2; i < num1; i++) {

                if(num1%i == 0){
                    return "Not prime number";
                }
            }
            return "Prime number";
        }

    }

}// end
