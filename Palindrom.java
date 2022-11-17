import java.util.Scanner;

public class Palindrom
{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = sc.nextLine();

        String reversestr = "";

        for(int i = str.length()-1; i >= 0; i--){

            reversestr = reversestr + str.charAt(i);

        }

        if(str.equals(reversestr)){

            System.out.println("This is palindrom");

        }

        else{


            System.out.println("This not palindrom");

        }
    }
}