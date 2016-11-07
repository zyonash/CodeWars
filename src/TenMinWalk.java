/**
 * Created by zacharyyonash on 11/6/16.
 */
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int[] grid = new int[2];
        grid[0] = 0;
        grid[1] = 0;
        if(walk.length == 10){
            for(int i = 0; i < walk.length; i++){
                if(walk[i] == 'n'){
                    grid[1]++;
                } else if(walk[i] == 's'){
                    grid[1]--;
                } else if(walk[i] == 'w'){
                    grid[0]--;
                } else if(walk[i] == 'e'){
                    grid[0]++;
                }
            }
        } else {
            return false;
        }

        if(grid[0] == 0 && grid[1] == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]){

        // Expect false
        boolean tof = isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'});
        System.out.println(tof);
    }
}