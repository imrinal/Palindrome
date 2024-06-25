import java.util.*;
public class Palindrome
{
    String String, ReversedString;
    int length, i;
    Scanner scanner = new Scanner(System.in);
    public static void main(String []args)
    {
        Palindrome palin = new Palindrome();
        palin.GetData();
        palin.Display();
    }
    
    Palindrome()
    {
        String = "";
        ReversedString = "";
        length = 0;
    }
    
    public void GetData()
    {
        System.out.println("***************************************");
        System.out.println("*          Palindrome Checker         *");
        System.out.println("***************************************");
        System.out.println("\n---------------------------------------");
        System.out.print("Input string: ");
        String = scanner.nextLine();
    }
    
    public String Reverse()
    {
        String = String.toUpperCase();
        length = String.length();
        for(i = length-1; i >= 0; i--)
        {
            ReversedString = ReversedString + String.charAt(i);
        }
        return ReversedString;
    }
    
    public Boolean CheckPalindrome()
    {
        if(Reverse().equals(String))
           return true;
        else
           return false;
    }

    public void Display()
    {
        if(CheckPalindrome()){
            System.out.println("Result: \"" + String + "\" is a Palindrome");
            System.out.println("---------------------------------------");
        }else{
            System.out.println("Result: \"" + String + "\" is NOT a Palindrome");
            System.out.println("---------------------------------------");
        }
    }
}