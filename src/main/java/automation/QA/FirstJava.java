package automation.QA;

import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {
        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();

        System.out.println("Your name is: " + firstName);

        System.out.println("please enter your age: ");

        int userAge = scanner.nextInt();

        System.out.println("Your age is: " + userAge);

        if (userAge >= 18){
            System.out.println(firstName + " can drink alcohol legally!!!");
        }
        if(userAge < 18){
            System.out.println(firstName + " can't drink alcohol legally");
        }
        if (userAge >= 65){
            System.out.println(firstName + " is retired");
        }
    }

}
