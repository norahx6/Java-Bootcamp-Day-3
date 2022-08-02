package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class exercises {
    public static void main(String[] args) {

// EX 1

        String name [] = new String [3] ;
        name [0] = "Saleh";
        name [1] = "Khalid";
        name [2] = "Majed";
        System.out.println(Arrays.toString(name));



// EX 2
        for (int i = 1; i <= 33; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }


// EX 7
        helloMessage("Norah","Abdullah");

// EX 8
        int avr=sum(5,5,5,5,5);
        System.out.println(avr);

// EX 9
        ArrayList num = new ArrayList<>();
        int max;
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);


} //end


// Here Method for Ex 7

    public static void helloMessage(String fname , String lname ){
    System.out.println("Hello "+fname+" "+lname); }

// Here Method for Ex 8

    public static int sum(int num1,int num2, int num3, int num4 , int num5){
     int av=num1+num2+num3+num4+num5 ;
     int res=av/5;
     return res; }

// Here Method for Ex 9

    public static ArrayList num(int num) {
        int max = Math.max(num);
        System.out.println("ArrayList values : " +num ;
        System.out.println("ArrayList max value : " + max);
    }

} // end

