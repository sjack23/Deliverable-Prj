import java.util.Scanner;

public class Main {

    //The Deliverable Part 1
    public static void main(String[] args) {

        int number, reverse = 0;

        //Allows me to type in counsel
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

//Beginning of a while loop
        while (number > 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
//Allows system to print line in reverse
        System.out.println("Reverse of entered number is " + reverse);
    }

}

