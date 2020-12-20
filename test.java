import java.util.*;

public class test{
    public String fName;
    public String lName;
    public String fullName;
    private static String bugFullName;
     
    public static void main(String[] args){
        //scanning the strings and storing them in variables
        
        System.out.println("Please enter two String");
        System.out.println();
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
        
        //bug code
        int max = (1000 / fCount);
        int modulo = (1000 % fCount);
        int modulo_string = (int)(Math.random()* modulo);
        double x = (Math.random() * max); 
        int z = (int) x;
        String bugFullName = fullName.repeat(z);
        
        
        //num characters of bugstring
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
        
        //counting specific charatres
        int charCount = 0;
        for (int i = 0; i < bugFullName.length(); i++){
        
            if(bugFullName.charAt(i) == fCharacter)
                charCount++;
               
            
        }
        
        //counting specific character in substring
        int charCountMainString = charCount;
        int charCountSub = 0;
        for (int o = 0; o<subBug.length(); o++){
            if(subBug.charAt(o) == fCharacter)
                charCountSub++;
        }
        int finalCount = (charCountMainString + charCountSub);
        
        //printing results
        System.out.println("The number of characters in the string will be  " +count);
        System.out.println(bugFullName + bugFullName.substring(0, modulo_string));
        System.out.println("The number of times the asked character ("+fCharacter+") is executed in this string are : " +finalCount);
        
        //BONUS FEATURES
        
        
    }

}