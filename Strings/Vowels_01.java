package Strings;
import java.util.*;
public class Vowels_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int UpperVowels = 0;
        int LowerVowels = 0;
        int UpperConsonants=0;
        int LowerConsonants=0;
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                if(ch == 'A' || ch == 'E' || ch =='I' || ch=='O' || ch =='U') {
                    UpperVowels++;
                } else {
                    UpperConsonants++;
                }
            } else if(Character.isLowerCase(ch)) {
                if(ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') {
                    LowerVowels++;
                } else {
                    LowerConsonants++;
                }
            }
        }
        System.out.println("Uppercase Vowels = " + UpperVowels);
        System.out.println("Lowercase Vowels = " + LowerVowels);
        System.out.println("Uppercase Consonants = " + UpperConsonants);
        System.out.println("Lowercase Consonants = " + LowerConsonants);
    }
}
