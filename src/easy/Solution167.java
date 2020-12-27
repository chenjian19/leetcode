package easy;

public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] indexArray = new int[2];
        int index1 = 0;
        int index2 = 1;
        while(true){
            int sum = numbers[index1] + numbers[index2];
            if(sum == target){
                indexArray[0] = index1 + 1;
                indexArray[1] = index2 + 1;
                break;
            }
            if(sum < target){
                if(index2 == numbers.length-1){
                    index1++;
                    index2 = index1 + 1;
                }else{
                    index2++;
                }
            }
            if(sum > target){
                index1++;
                index2 = index1 + 1;
            }
        }
        return indexArray;
    }
}
