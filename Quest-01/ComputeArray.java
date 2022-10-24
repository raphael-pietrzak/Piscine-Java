public class ComputeArray {
    public static int[] computeArray(int[] array) {
        for(int i=0;i<array.length;i++){
            int j = array[i];
            if (j%3 == 0){
                array[i] = j*5;
            } else if (j%3 == 1){
                array[i] = j+7;
            } 
        }
        return array;
    }
}

// if the item is a multiple of 3, the item is multiplied by 5

// if the item is a multiple of 3 + 1 (e.g. 1, 4, 7, ...), the item is incremented by 7

// if the item is a multiple of 3 + 2 (e.g. 2, 5, 8, ...), the item stay as it is.