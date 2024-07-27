package personla.storage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        StringBuilder finalWord = new StringBuilder();

        //TODO Fix action from user to remind him to leave a space after every word.
        System.out.println("Enter the morse code to be translated: ");
        String morseCode = userInput.nextLine();

        String[] morseCodeArray = morseCode.split(" ");
        for (int i = 0; i < morseCodeArray.length; i++) {

            switch (morseCodeArray[i]) {
                case ".-":
                    morseCodeArray[i] = String.valueOf(Symbols.A);
                    break;
                case "-...":
                    morseCodeArray[i] = String.valueOf(Symbols.B);
                    break;
                case "-.-.":
                    morseCodeArray[i] = String.valueOf(Symbols.C);
                    break;
                case "-..":
                    morseCodeArray[i] = String.valueOf(Symbols.D);
                    break;
                case ".":
                    morseCodeArray[i] = String.valueOf(Symbols.E);
                case "..-.":
                    morseCodeArray[i] = String.valueOf(Symbols.F);
                    break;
                case "--.":
                    morseCodeArray[i] = String.valueOf(Symbols.G);
                    break;
                case "....":
                    morseCodeArray[i] = String.valueOf(Symbols.H);
                    break;
                case "..":
                    morseCodeArray[i] = String.valueOf(Symbols.I);
                    break;
                case ".---":
                    morseCodeArray[i] = String.valueOf(Symbols.J);
                    break;
                case "-.-":
                    morseCodeArray[i] = String.valueOf(Symbols.K);
                    break;
                case ".-..":
                    morseCodeArray[i] = String.valueOf(Symbols.L);
                    break;
                case "--":
                    morseCodeArray[i] = String.valueOf(Symbols.M);
                    break;
                case "-.":
                    morseCodeArray[i] = String.valueOf(Symbols.N);
                    break;
                case "---":
                    morseCodeArray[i] = String.valueOf(Symbols.O);
                    break;
                case ".--.":
                    morseCodeArray[i] = String.valueOf(Symbols.P);
                    break;
                case "--.-":
                    morseCodeArray[i] = String.valueOf(Symbols.Q);
                    break;
                case ".-.":
                    morseCodeArray[i] = String.valueOf(Symbols.R);
                    break;
                case "...":
                    morseCodeArray[i] = String.valueOf(Symbols.S);
                    break;
                case "-":
                    morseCodeArray[i] = String.valueOf(Symbols.T);
                    break;
                case "..-":
                    morseCodeArray[i] = String.valueOf(Symbols.U);
                    break;
                case "...-":
                    morseCodeArray[i] = String.valueOf(Symbols.V);
                    break;
                case ".--":
                    morseCodeArray[i] = String.valueOf(Symbols.W);
                    break;
                case "-..-":
                    morseCodeArray[i] = String.valueOf(Symbols.X);
                    break;
                case "-.--":
                    morseCodeArray[i] = String.valueOf(Symbols.Y);
                    break;
                case "--..":
                    morseCodeArray[i] = String.valueOf(Symbols.Z);
                    break;
                case ".----":
                    morseCodeArray[i] = String.valueOf(Symbols.ONE);
                    break;
                case "..---":
                    morseCodeArray[i] = String.valueOf(Symbols.TWO);
                    break;
                case "...--":
                    morseCodeArray[i] = String.valueOf(Symbols.THREE);
                    break;
                case "....-":
                    morseCodeArray[i] = String.valueOf(Symbols.FOUR);
                    break;
                case ".....":
                    morseCodeArray[i] = String.valueOf(Symbols.FIVE);
                    break;
                case "-....":
                    morseCodeArray[i] = String.valueOf(Symbols.SIX);
                    break;
                case "--...":

                    morseCodeArray[i] = String.valueOf(Symbols.SEVEN);
                    break;
                case "---..":
                    morseCodeArray[i] = String.valueOf(Symbols.EIGHT);
                    break;
                case "----.":
                    morseCodeArray[i] = String.valueOf(Symbols.NINE);
                    break;
                case "-----":
                    morseCodeArray[i] = String.valueOf(Symbols.ZERO);
                    break;
                case " ":
                    morseCodeArray[i] = String.valueOf(Symbols.SPACE);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            finalWord.append(morseCodeArray[i]);
        }
        System.out.println(finalWord);
    }
}
