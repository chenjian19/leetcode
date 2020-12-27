package easy;

public class Solution1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        boolean flag = false;
        int index1 = 0;
        int index2 = 1;
        int index3 = 2;
        while(index3 < arr.length){
            int num1 = arr[index1],num2 = arr[index2],num3 = arr[index3];
            if(num1 % 2 == 1 && num2 % 2 == 1 && num3 % 2 == 1){
                flag = true;
                break;
            }else if(num2 % 2 == 0 && num3 % 2 == 0){
                index1 += 3;
                index2 += 3;
                index3 += 3;
            }else if(num2 % 2 == 0 && num3 % 2 == 1){
                index1 += 2;
                index2 += 2;
                index3 += 2;
            }else{
                index1++;
                index2++;
                index3++;
            }
        }
        return flag;
    }
}
