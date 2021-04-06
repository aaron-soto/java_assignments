import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> sumNumbers(int[] inputArray) {
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        for (int element: inputArray) {
            sum += element;
            if (element > 10) {
                greaterThan10.add(element);
            }
        }
        System.out.println(sum);

        return greaterThan10;
    }

    public ArrayList<String> shuffleNames(ArrayList<String> inputArray) {
        ArrayList<String> greaterThan5Chars = new ArrayList<String>();
        for (String element: inputArray) {
            if (element.length() > 5) {
                greaterThan5Chars.add(element);
            }
        }
        Collections.shuffle(inputArray);
        System.out.println(inputArray);
        return greaterThan5Chars;
    }

    public void shuffleAlphabet() {

        ArrayList<Character> alphabet = new ArrayList<Character>();
        ArrayList<Character> vowels = new ArrayList<Character>();
        alphabet.add('a');
        vowels.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        vowels.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        vowels.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        vowels.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        vowels.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

        Collections.shuffle(alphabet);
        Character lastLetter = alphabet.get(alphabet.size() - 1);
        Character firstLetter = alphabet.get(0);
        System.out.println("First Letter: " + firstLetter + " | Last Letter: " + lastLetter);

        for (Character letter: vowels) {
            if (letter == firstLetter) {
                System.out.println("First letter is a vowel.");
            }
        }
    }
    public ArrayList<Integer> random10() {
        ArrayList<Integer> random10Nums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            Random r = new Random();
            random10Nums.add(r.nextInt(100-55) + 55);
        }

        Collections.sort(random10Nums);

        int minValue = random10Nums.get(0);
        int maxValue = random10Nums.get(random10Nums.size() - 1);

        System.out.println("min: " + minValue + " | " + "max: " + maxValue);
        return  random10Nums;

    }

    public String randomString() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

        String newString = "";


        for(int i = 0; i < 5; i++) {
            Random r = new Random();
            newString += alphabet.get(r.nextInt(26));
        }
        return newString;

    }

    public ArrayList<String> random10String() {
        ArrayList<String> randomWords = new ArrayList<String>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        

        for (int j = 0; j < 10; j++) {
            String newString = "";
            for(int i = 0; i < 5; i++) {
                Random r = new Random();
                newString += alphabet.get(r.nextInt(26));
            }
            randomWords.add(newString);
        }

        return randomWords;

    }
}
