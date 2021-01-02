// ## This program was made in order to recreate a string bug ## \\
// ## Team members : Jozef Adam Lecky, Rufus Lyasa, Gianluca Masi, Mark Shenall Schubert ## \\
import java.util.*;

public class codeit{
    //Declaring variables
    public String fName;
    public String lName;
    public String fullName;
    private static String bugFullName;
    private static String authors = "Jozef Adam Lecky, Rufus Lyasa, Gianluca Masi, Mark Shenall Schubert"; 
    public static void main(String[] args){
        long start = System.nanoTime(); //Starting the timer for measuring time of execution 
        //Scanning the strings and storing them in variables
        System.out.print('\u000C'); //Clearing screen so it's easier to see outputs
        System.out.println("Please enter two String");
        System.out.println();
        Scanner firstName = new Scanner(System.in);
        String firstN = firstName.nextLine();
        Scanner lastName = new Scanner(System.in);
        String lastN = lastName.nextLine();
        String fullName = firstN + lastN; 
        System.out.println("The appended string is "+fullName);

        //Counting number of character in appended string
        int fCount = 0;
        for(int i = 0; i < fullName.length(); i++){
            if(fullName.charAt(i) != ' '){
                fCount++;
            }
            
        }
        
        //Bug code
        int max = (1000 / fCount);
        int modulo = (1000 % fCount);
        int modulo_string = (int)(Math.random()* modulo);
        double x = (Math.random() * max); 
        int z = (int) x;
        String bugFullName = fullName.repeat(z);
        
        
        //Number of characters in bugged string
        int count = 0;
        for(int i = 0; i< bugFullName.length(); i++){

            if(bugFullName.charAt(i) != ' ')
                count++;
        }
        
        //Scanning specific character to count
        System.out.println("Enter a character that needs to be find in the string");
        Scanner character = new Scanner(System.in);
        char fCharacter = character.next().charAt(0);
        String subBug = bugFullName.substring(0, modulo_string);
        
        //Counting specific selected character in whole string
        int charCount = 0;
        for (int i = 0; i < bugFullName.length(); i++){
        
            if(bugFullName.charAt(i) == fCharacter)
                charCount++;
               
            
        }
        
        //Counting specific selected character in partial print
        int charCountMainString = charCount;
        int charCountSub = 0;
        for (int o = 0; o<subBug.length(); o++){
            if(subBug.charAt(o) == fCharacter)
                charCountSub++;
        }
        int finalCount = (charCountMainString + charCountSub);
        
        //Calculating time of execution 
        long end = System.nanoTime();
        long time = end - start;
        
        //Printing results
        System.out.println("The number of characters in the string will be  " +count);
        System.out.println(bugFullName + bugFullName.substring(0, modulo_string));
        System.out.println("The number of times the asked character ("+fCharacter+") is executed in this string are : " +finalCount);
        System.out.println();
        System.out.println("Time elapsed in seconds : " +(double)time/1000000000);
        System.out.println("Made by : "+authors);
        
        
        
    }
    
}

