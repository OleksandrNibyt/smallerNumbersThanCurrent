import java.util.Arrays;

class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int [] copy = nums.clone();
        Arrays.sort(copy);
        var map = new int[101];
        for(int i = 1; i < copy.length; i++){
            if(copy[i] != copy[i-1]){
                map[copy[i]] = i;
            }
        }
        for(int i = 0; i < result.length; i++){
            result[i] = map[nums[i]];
        }
        return result;
    }
}


public class SmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] input = {8,1,2,2,3};
        int[] result = Solution.smallerNumbersThanCurrent(input);
        System.out.println(result.toString());
    }

}
