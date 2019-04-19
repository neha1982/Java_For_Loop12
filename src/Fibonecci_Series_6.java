public class Fibonecci_Series_6 {
    //a program to print Fibonacci series of n terms where n is input by user :
    //0	1 1 2 3 5 8 13 24 ....
    //main method
    public static void main(String[] args) {

        //using 3 int
        int n = 10, t1 = 0, t2 = 1;

        //using first 10 terms and adding each previous number to the next number
        //like 0+1+1+(1+1)2+(1+2)3+(2+3)5....
        System.out.println("First "+ n + " terms: ");

        //using for loop it is easy to get the fibonecci series number
        for (int i = 1; i <= n; ++i){

            //number is adding previous num and making series
            System.out.println(t1 + " + ");

            //int sum is total by t1 and t2
            int  sum =  t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }



}
