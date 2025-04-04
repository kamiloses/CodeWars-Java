import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Exercises {


    public boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            stringBuilder.append(numberAsString.charAt(i));
        }


        return stringBuilder.toString().equals(numberAsString);
    }


    //Emotional Sort ( ︶︿︶)
    public String[] emotionalSort(String[] arr, boolean isAscending) {

        Integer[] numbers = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case ":D":
                    numbers[i] = 5;
                    break;
                case ":)":
                    numbers[i] = 4;
                    break;
                case ":|":
                    numbers[i] = 3;
                    break;
                case ":(":
                    numbers[i] = 2;
                    break;
                case "T_T":
                    numbers[i] = 1;
                    break;
            }
        }


        if (isAscending) {
            Arrays.sort(numbers, Collections.reverseOrder());
        } else Arrays.sort(numbers);


        for (int i = 0; i < numbers.length; i++) {

            switch (numbers[i]) {
                case 5:
                    arr[i] = ":D";
                    break;
                case 4:
                    arr[i] = ":)";
                    break;
                case 3:
                    arr[i] = ":|";
                    break;
                case 2:
                    arr[i] = ":(";
                    break;
                case 1:
                    arr[i] = "T_T";
                    break;
            }
        }
        return arr;

    }


// samogłoska - spółgloska naprzemiennie


    public boolean isAlternate(String word) {
        boolean isAlternate = true;
        for (int i = 1; i < word.length(); i++) {
            if ("aeiou".contains(String.valueOf(word.charAt(i - 1)))) {
                if (!"aeiou".contains(String.valueOf(word.charAt(i)))) {
                    i++;
                } else {
                    isAlternate = false;
                    break;
                }
            } else {
                if (!"aeiou".contains(String.valueOf(word.charAt(i - 1)))) {
                    if ("aeiou".contains(String.valueOf(word.charAt(i)))) {
                        i += 2;
                    } else {
                        isAlternate = false;
                        break;
                    }
                }


            }

        }

        return isAlternate;
    }


    // convert String to cammel case
    public String convertToCamelCase(String word) {
        String toUpper = "";
        toUpper += word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == '-') {
                char c = word.charAt(i);
                toUpper += Character.toUpperCase(c);

            } else {
                toUpper += word.charAt(i);
            }

        }


        return toUpper.replace("-", "");
    }


    public int[][] generateMultiplicationTable(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return matrix;
    }

    //odwórcone słowo w zdaniu jeżeli powyżej 5 liter
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        String finalResult = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {

                StringBuilder reversed = new StringBuilder(words[i]).reverse();

                finalResult += " " + reversed;
            } else {
                finalResult += " " + words[i];
            }


        }
        return finalResult.trim();
    }


    //7) róznica między tablicami
    public HashSet<Integer> difference(int[] a, int[] b) {
        HashSet<Integer> difference = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] != a[i]) difference.add(a[i]);

            }
        }

        return difference;
    }


    //8)liczenie duplikatów
    public int duplicates(String word) {
        String[] wordSplit = word.toLowerCase().split("");
        int count = 0;
        String duplicatedletters = "";

        for (int i = 0; i < wordSplit.length - 1; i++) {
            if (duplicatedletters.contains(wordSplit[i])) {
                continue;
            }
            for (int j = i + 1; j < wordSplit.length; j++) {
                if (wordSplit[i].equals(wordSplit[j])) {
                    count++;
                    duplicatedletters += wordSplit[i];
                    break;
                }
            }
        }
        return count;
    }
    //https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1


//9 reversed list

    public List<String> reverseList(List<String> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            String temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);

        }


        return list;
    }


//10)fibonacci
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
    public  int[] fibonacciArray(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] fib = new int[n];
        fib[0] = 0;

        if (n > 1) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }


}


//10 bubble sort



