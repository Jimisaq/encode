package appstart.mymodappdemo;

import java.util.Scanner;

public class Encode2 {
    char myChar;
    Scanner scanner = new Scanner(System.in);

    //Alphabetical letters(capital)
    char[] myBigAlphabet = new char[26];
    //Alphabetical letters(capital)_descending order
    char[] myBigAlphabetInv = new char[26];


    //Alphabetical letters(small)
    char[] mySmallAlphabet = new char[26];
    //Alphabetical letters(small)_ascending order
    char[] mySmallAlphabetInv = new char[26];

    public static void main(String[] args) {
        Encode2 obj = new Encode2();
        for (int i = 0; i < 26; i++) {
            obj.myBigAlphabet[i] = (char) (65 + i);
            obj.myBigAlphabetInv[i] = (char) (90 - i);

            obj.mySmallAlphabet[i] = (char) (97 + i);
            obj.mySmallAlphabetInv[i] = (char) (122 - i);
        }

        //System.out.println(Arrays.toString(obj.myBigAlphabet)+"\n"+Arrays.toString(obj.myBigAlphabetInv)+"\n"+Arrays.toString(obj.mySmallAlphabet)+"\n"+Arrays.toString(obj.mySmallAlphabetInv));

        obj.encode();
    }

    public void encode() {
        String input = "";
        while (!input.equals("?")) {
            System.out.print("Enter the word to encode('?' to quit):");
            input = scanner.nextLine();

            for (int x = 0; x < input.length(); x++) {
                if ((int) input.charAt(x) > 96) {
                    for (int y = 0; y < mySmallAlphabet.length; y++) {
                        if (input.charAt(x) == mySmallAlphabet[y]) {
                            char wanted = mySmallAlphabetInv[y];
                            System.out.print(wanted);
                        }
                    }
                }else if ((int) input.charAt(x) == 32){
                    char wanted = (char)32;
                    System.out.print(wanted);
                } else {
                    for (int m = 0; m < myBigAlphabet.length; m++) {
                        if (input.charAt(x) == myBigAlphabet[m]) {
                            char wanted = myBigAlphabetInv[m];
                            System.out.print(wanted);
                        }
                    }
                }

            }
            System.out.print("\n");
        }
    }
}

