/**
 * Demonstration source code.
 * Demonstrates use of:
 *   console interface and model objects
 *   for loops
 *   
 *   DO NOT MODIFY THIS CLASS
 * 
 * @author GrayKnight  CPM 2017
 * @version 10/11/12, 10/20/17
 */
import java.util.Scanner;


public class LanguageDriver
{
    //instance identifiers
    private Scanner scan = new Scanner(System.in);
    private CharacterCounter cc = new CharacterCounter("Default String");

    //surveys the user for information
    //controls execution
    public void userInput()
    {//                                            |
 // 'for' loops can be used for user input too     V---- notice no increment
        for(String check = "y"; check.equals("y");   )
        {
            System.out.println("\nEnter a word or phrase:");
            String word1 = scan.nextLine();
            
            System.out.println("\nEnter a single letter:");
            String ltr = scan.nextLine();
            
            //enforce conditions
            if(ltr.length() > 1) ltr = ltr.substring(0,1);
            
            //send word to the cc object
            cc.setWord(word1);
            //get the number of time ltr occurs in word1
            int count = cc.numberOf_s(ltr);
            //language modifiers
            String plural = "";
            if (count != 1) plural = "s";
            
            System.out.println("The String '"  + word1 + "' has " + count + " '" + ltr + "'" + plural + ".\n");
            
            System.out.print("Try Again? (y or n):");
            check = scan.nextLine(); 
            
        } 
        
        System.out.print("Goodbye!\n\n");
    }
}
