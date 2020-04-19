import java.util.Scanner;

public class EnglishToPigLatinAndMorseCodeTranslator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter phrase to convert to Morse Code: ");
        String englishPhrase = input.nextLine();
        System.out.printf("Given English Phrase: %s%n", englishPhrase);
        System.out.printf("The Corresponding Pig Latin: %s%n", translateToPigLatin(englishPhrase));
        System.out.printf("The Corresponding Morse Code: %s%n", translateToMorseCode(englishPhrase));
    }

    public static String translateToPigLatin(String englishPhrase) {
        String result = "";
        String[] words = englishPhrase.split("\\s");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
        }
        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }
        return result;
    }

    public static String translateToMorseCode(String englishPhrase) {
        String result = "";
        String[] codes = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---"
                , "...--", "....-", ".....", "-....", "--...", "---..", "-----.", "-----"};
        String[] words = englishPhrase.split("\\s");

        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toLowerCase().toCharArray();
            String wordResult = "";
            for (int j = 0; j < word.length; j++) {
                switch (word[j]) {
                    case 'a':
                        wordResult += codes[0];
                        break;
                    case 'b':
                        wordResult += codes[1];
                        break;
                    case 'c':
                        wordResult += codes[2];
                        break;
                    case 'd':
                        wordResult += codes[3];
                        break;
                    case 'e':
                        wordResult += codes[4];
                        break;
                    case 'f':
                        wordResult += codes[5] ;
                        break;
                    case 'g':
                        wordResult += codes[6] ;
                        break;
                    case 'h':
                        wordResult += codes[7] ;
                        break;
                    case 'i':
                        wordResult += codes[8] ;
                        break;
                    case 'j':
                        wordResult += codes[9] ;
                        break;
                    case 'k':
                        wordResult += codes[10] ;
                        break;
                    case 'l':
                        wordResult += codes[11] ;
                        break;
                    case 'm':
                        wordResult += codes[12] ;
                        break;
                    case 'n':
                        wordResult += codes[13] ;
                        break;
                    case 'o':
                        wordResult += codes[14] ;
                        break;
                    case 'p':
                        wordResult += codes[15] ;
                        break;
                    case 'q':
                        wordResult += codes[16] ;
                        break;
                    case 'r':
                        wordResult += codes[17] ;
                        break;
                    case 's':
                        wordResult += codes[18] ;
                        break;
                    case 't':
                        wordResult += codes[19] ;
                        break;
                    case 'u':
                        wordResult += codes[20] ;
                        break;
                    case 'v':
                        wordResult += codes[21] ;
                        break;
                    case 'w':
                        wordResult += codes[22] ;
                        break;
                    case 'x':
                        wordResult += codes[23] ;
                        break;
                    case 'y':
                        wordResult += codes[24] ;
                        break;
                    case 'z':
                        wordResult += codes[25];
                        break;
                    case '1':
                        wordResult += codes[26] ;
                        break;
                    case '2':
                        wordResult += codes[27] ;
                        break;
                    case '3':
                        wordResult += codes[28] ;
                        break;
                    case '4':
                        wordResult += codes[29] ;
                        break;
                    case '5':
                        wordResult += codes[30] ;
                        break;
                    case '6':
                        wordResult += codes[31] ;
                        break;
                    case '7':
                        wordResult += codes[32] ;
                        break;
                    case '8':
                        wordResult += codes[33] ;
                        break;
                    case '9':
                        wordResult += codes[34];
                        break;
                    case '0':
                        wordResult += codes[35] ;
                        break;
                }
                result += wordResult + "   ";
            }
        }
        return result;
    }
}

