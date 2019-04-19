import java.util.Scanner;

public class StringCount_Total_a_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();

        int count=0;
        int size=str.length();

        for (int i=0; i <size; i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
