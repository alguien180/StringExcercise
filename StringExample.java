import java.lang.StringBuilder;
import java.util.ArrayList;
public class StringExample {
    public static void main(String[] args) {
        String str = "Parse this string ";

        //method that creates a string in the inverse sense using a string builder object and by creating substrings in a for loop
        displayStringBackwards(str);
        spaceSearcher(str);
        searchString(str,'s');

        //printing the string with a for loop
        for(String i: stringParserWithSubstrings(str)){
            System.out.println(i+' ');
        }
        stringParserWithSplit(str);
        stringParserWithMultipleChars(str);
    }

    static void displayStringBackwards(String str) {
        String strBackwards="";
        System.out.println(str);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0;i--){
            //printing each element from -1
            System.out.print(str.charAt(i));
            //Storing first in a String builder object
            stringBuilder.append(str.charAt(i));
            //Reassigning it to a string every loop
            strBackwards+= str.substring(i,i+1);
        }
        System.out.println("\nthis is the result in string builder :\n" + stringBuilder);
        System.out.println("\n this is the result of string backwards \n" + strBackwards);
    }
    //method that uses  for loop and aa nested if to count the number of empty spaces between characters in the given string
    static void spaceSearcher(String str){
        int counter = 0;
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i)==' '){
                counter+=1;
            }
        }
        System.out.println("\nThe string has : "+ counter+" space(s) in it");
    }

    //methos that uses a for loop and a nested if to count the number of times a given character appears in the string
    static void searchString(String str, char target){
        int counter=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                counter++;
            }
        }
        System.out.println("The string \""+ target +"\" appears "+ counter+ " times in the string");
    }
    /*Method that parses through the string and
    returns strings separated by a space*/
    static ArrayList<String> stringParserWithSubstrings(String string){
        ArrayList<String> parsedString = new ArrayList<>();
        while(string.length()>0){
            for(int i=0;i<string.length();i++){
                if(i==string.length()-1){
                    parsedString.add(string.substring(0));
                    string="";
                    break;
                }else if(string.charAt(i)==' '){
                    parsedString.add(string.substring(0,i));
                    string=string.substring(i+1);
                    break;
                }
            }
        }
        return parsedString;
    }
    //Splits a string based in a single character
    static void stringParserWithSplit(String string){
        String[] words = string.split(" ");
        String [] tokens=string.split("i");
        for(String i : tokens){
            System.out.println(i+", ");
        }
    }
    //Splits a string based in multiple characters (taken as chars, not continous string)
    static void stringParserWithMultipleChars(String string){

        String [] tokens=string.split("[tri]");
        for(String i : tokens){
            System.out.println(i+", ");
        }
    }
}
