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

    public static String createPhoneNumber(int[] numbers) {
        return "(" + Integer.toString(numbers[0]) + Integer.toString(numbers[1]) + Integer.toString(numbers[2])
                + ")" + " " + Integer.toString(numbers[3]) + Integer.toString(numbers[4])
                + Integer.toString(numbers[5]) + "-" + Integer.toString(numbers[6]) +
                Integer.toString(numbers[7]) + Integer.toString(numbers[8]) + Integer.toString(numbers[9]);
    }

    public static void main (String args[]){

        // Test getMiddle
        //String middle = getMiddle("whathuh");
        //System.out.println(middle);

        //Test createPhoneNumber
        String phoneNumber = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumber);
    }
}