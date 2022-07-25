package GLquestion1.driver;

import GLquestion1.balancingbrackets.BalancingBrackets;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the brackets ");
        String brackets = in.next();
        if(BalancingBrackets.balanced(brackets)){
            System.out.println("The entered String has Balanced Brackets");
        }
        else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
        in.close();
    }
}
