public class Multipliy_Table5_7 {
   // Print single multiplication table using do while loop for given number
    //main method
    public static void main(String[] args) {

        //int i is start form number 1 and num 5 is (for print time table)
        int i=1, num=5;

        //do while loop is giving time table up to any number u want(but here i put 10 in while)
        do {
            //using s.out for formation that user want(5*1=5)
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }while (i<=10);

    }

}
