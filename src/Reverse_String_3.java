public class Reverse_String_3 {
    //main method
    public static void main(String[]args){
        //using string for reverse string
        String str[]={"a","b","c","d","f"};

        //using for loop to get reverse string (length is for how many letter)
        for (int i= str.length-1; i >=0; i--){
            System.out.println(str[i]);
        }
    }
}
