package easy;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        shellSort(arr1);
        shellSort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        return s1.equals(s2);
    }

    public void shellSort(char[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                char insertVal = arr[i];
                int insertIndex = i;
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }
}
