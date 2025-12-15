package replace_element;

import java.util.Arrays;

class MainClass {
    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};

        System.out.println(Arrays.toString(replaceElement(nums)));

    }
    public static int[] replaceElement(int[] array){
        for(int i=0; i<array.length-1; i++){
            int maxNum = array[i+1];
            for(int j=i+1; j<array.length; j++){
                if (array[j] > maxNum) {
                    maxNum = array[j];
                }
            }
            array[i] = maxNum;
        }
        array[array.length-1] = - 1;
        return array;
    }
    
}