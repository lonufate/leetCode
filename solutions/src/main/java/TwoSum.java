/**
 * Created by ulong on 16-10-11.
 */
public class TwoSum {
        public static void main(String[] args) {
                int[] nums = {3, 2 ,4};
                int[] result = twoSum(nums, 6);
                System.out.println(result[0]+"  "+result[1]);
        }
        public static int[] twoSum(int[] nums, int target) {
                int[] result = {-1, -1};

                for(int i = 0; i < nums.length-1;i++){
                        for(int j = i+1;j < nums.length; j++){
                                if(nums[i]+nums[j] == target){
                                        result[0] = i;
                                        result[1] = j;
                                        return result;
                                }
                        }
                }

                return result;
        }
}
