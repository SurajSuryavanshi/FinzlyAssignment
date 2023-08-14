import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = a.nextLine();

        if(containsAllVowels(input)){
            System.out.println("All Vowels are present in the String :- ***"+input+"***");
        }else {
            System.out.println("All Vowels are not present in this string ");
        }
    }
    public static boolean
    containsAllVowels(String str) {
        str = str.toLowerCase();
        boolean aFound = false, eFound = false, iFound = false, oFound = false, uFound = false;

        for (char c : str.toCharArray()) {
            if (c == 'a') {
                aFound = true;
            } else if (c == 'e') {
                eFound = true;
            } else if (c == 'i') {
                iFound = true;
            } else if (c == 'o') {
                oFound = true;
            } else if (c == 'u') {
                uFound = true;
            }
        }
        return aFound && eFound && iFound && oFound && uFound;
    }
    }


