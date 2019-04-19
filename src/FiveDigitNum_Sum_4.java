import java.util.Scanner;
//input any five digit number and then find sum of each digit
public class FiveDigitNum_Sum_4 {
//main method
    public static void main(String[] args) {

        //using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit: ");
        int digit = scanner.nextInt();
        //for five digit number sum using for loop

        int j, k=0;
        int sum=0;
        for (j=1; j<=5; j++){

            k=digit%10;
            sum = sum+k;
            digit=digit/10;

        }
        System.out.println(k);
        System.out.println(sum);
        System.out.println(digit);



        }

    }

