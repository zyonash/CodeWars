/**
 * Created by zacharyyonash on 11/5/16.
 */
public class BitCounting {

    public static int countBits(int n){
        String binaryString = Integer.toBinaryString(n);
        n = 0;
        for (char ch: binaryString.toCharArray()){
            if(String.valueOf(ch).equals("1")){
                n++;
            }
        }
        return n;
    }

    public static void main(String args[]){
        int numBits = countBits(5);
        System.out.println(numBits + "<--- This should be 2");
    }
}