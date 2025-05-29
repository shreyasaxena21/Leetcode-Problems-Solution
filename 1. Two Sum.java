class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] aux = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;

        int first = -1;
        int second = -1;

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                first = nums[i];
                second = nums[j];
                break;
            }

            else if(sum > target){
                j--;
            }

            else{
                i++;
            }

        }

        int firstIndex = -1;
        int secondIndex = -1;
        for( i = 0; i<aux.length; i++){
            if(firstIndex==-1 && aux[i]==first){
                firstIndex=i;
            }
            else{
                if(secondIndex ==-1 && aux[i]==second){
                    secondIndex=i;
                }
            }
        }
        return new int[]{firstIndex,secondIndex};
    }
    
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
      
//         // Approach - 1 Two Pointer  TC N Log N, SC O(N)
//         int []aux = Arrays.copyOf(nums, nums.length);
//         Arrays.sort(nums);  // N Log N
//         // Maintain 2 Pointers
//         int i = 0 ;
//         int j = nums.length-1;
//         int first = -1;
//         int second = -1;
//         while(i<j){
//             int sum = nums[i] + nums[j];
//             if(sum == target){
//                 first = nums[i];
//                 second = nums[j];
//                 break;
//             }
//             else if(sum>target){
//                 j--;
//             }
//             else if(sum<target){
//                 i++;
//             }
//         }
//         int firstIndex = -1;
//         int secondIndex = -1;
//         // check the index in org array (aux)
//         for( i = 0; i<aux.length; i++){
//             if(firstIndex == -1 && aux[i]==first){
//                 firstIndex = i;
//             }
//             else 
//             if(secondIndex==-1 & aux[i]==second){
//                 secondIndex = i;
//             }
//         }
//        return new int[]{firstIndex, secondIndex};
//     }
// }