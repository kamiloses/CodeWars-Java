import java.util.Arrays;
import java.util.Collections;

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
            if (word.charAt(i-1)=='-') {
                char c = word.charAt(i);
                toUpper +=Character.toUpperCase(c);

            } else {
                toUpper += word.charAt(i);
            }

        }


        return toUpper.replace("-","");
    }


}
