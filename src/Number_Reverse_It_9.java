import java.util.Scanner;
//Input number & reverse it & print it using while loop.
public class Number_Reverse_It_9 {
    //main method
    public static void main(String[] args) {

        //using scanner for user enter number
        int lastNumber, number, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        number = sc.nextInt();

        //using while loop for reverse number
        while (number!=0){
            lastNumber = number % 10;
            reverse = reverse + lastNumber;
            reverse = reverse*10;
            number /= 10;

            if (number<10){
                reverse = reverse + number;
                        break;
            }
        }
        sc.close();
        System.out.println("Reverse number is "+reverse);
    }
}
