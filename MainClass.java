package replace_element;

import java.util.Arrays;

class MainClass {
    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};

        System.out.println(Arrays.toString(replaceElement(nums)));

    }
    public static int[] replaceElement(int[] array){
        int maxNum = -1;
        for(int i= array.length - 1; i>=0; i--){
            int temp = array[i];
            array[i] = maxNum;
            if (temp>maxNum) {
                maxNum = temp;
            }
        }
        return array;
    }
    
}