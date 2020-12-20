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
        //recreating bug
        int max = (1000 / fCount);
        int modulo = (1000 % fCount);
        int modulo_string = (int)(Math.random()* modulo);
        double x = (Math.random() * max);
        int z = (int) x;
        String bugFullName = fullName.repeat(z);


        //num characters of bugged string
        int count = 0;
        for(int i = 0; i< bugFullName.length(); i++){

            if(bugFullName.charAt(i) != ' ')
                count++;
        }

        //Scanning specific character to count
        System.out.println("Please write character to count");
        Scanner character = new Scanner(System.in);
        char fCharacter = character.next().charAt(0);
        String subBug = bugFullName.substring(0, modulo_string);
        //counting specific characters
        int charCount = 0;
        for (int i = 0; i < bugFullName.length(); i++){

            if(bugFullName.charAt(i) == fCharacter)
                charCount++;


        }
        //counting specific character in sub string
        int CharCountMainString = charCount;
        int charCountSub = 0;
        for (int o = 0; o<subBug.length(); o++){
            if(subBug.charAt(o) == fCharacter)
                charCountSub++;
        }
        int finalCount = (CharCountMainString + charCountSub);
        //printing results
        System.out.println("Number of characters is  " +count);
        System.out.println(bugFullName + bugFullName.substring(0, modulo_string));

        System.out.println("Character "+fCharacter + " was found in this string for "+finalCount+" times");
    }
}
