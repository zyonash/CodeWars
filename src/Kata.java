/**
 * Created by zacharyyonash on 11/5/16.
 */

public class Kata {
    public static String getMiddle(String word) {
        if(word.length() % 2 == 0){
            StringBuilder s = new StringBuilder(2);
            s.append(word.charAt(word.length()/2-1));
            s.append(word.charAt(word.length()/2));
            return s.toString();
        } else {
            Character middleChar = word.charAt(word.length() / 2);
            return middleChar.toString();
        }

    }

    public static void main (String args[]){
        String middle = getMiddle("whathuh");
        System.out.println(middle);
    }
}