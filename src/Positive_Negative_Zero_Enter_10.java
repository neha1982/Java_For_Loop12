import java.util.Scanner;
//a program to enter the numbers till the user wants and at the end it should display the count of positive,
// negative and zeros entered.
public class Positive_Negative_Zero_Enter_10 {
    //main method
    public static void main(String[] args) {

        //using scanner
        Scanner console = new Scanner(System.in);
        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        //using char choice to user enter the number
        char choise;
        //using do-while for positive, negative and zero
        do {
            System.out.println("Enter the number: ");
            number = console.nextInt();

            if (number > 0) {

                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.println("Do you want to continue y/n?");
            choise = console.next().charAt(0);


        }
        //while loop
        while ((choise == 'y' || choise == 'Y'));

        System.out.println("Positive Number: " + countPositive);
        System.out.println("Negative Number: " + countNegative);
        System.out.println("Zero Number: " + countZero);

    }

}

