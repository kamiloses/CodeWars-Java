public class Exercises {


    public boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = numberAsString.length()-1; i>=0 ; i--) {
             stringBuilder.append(numberAsString.charAt(i));
        }


    return stringBuilder.toString().equals(numberAsString);}
}
