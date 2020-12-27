package easy;

public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        for(int i = 0 ; i < length-1 ; i++){
            int max = arr[i+1];
            for(int j = i+1 ; j < length ; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        result[length-1] = -1;
        return result;
    }
}
