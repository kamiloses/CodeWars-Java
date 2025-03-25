import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Exercises exercises = new Exercises();

         String[] emoticons={":D", ":|", ":)", ":(", ":D"};
        System.err.println(Arrays.toString(exercises.emotionalSort(emoticons,false)));
    }
}