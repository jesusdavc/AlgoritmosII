import java.util.Arrays;
public class Main {
    public static void merge(Integer[] mainArray , int low, int middle, int high){
        //Sizes temporal arrays
        int length1 = middle - low + 1;
        int length2 = high - middle;
        Integer[] arrayLeft = new Integer[length1];
        Integer[] arrayRight = new Integer[length2];
        //copy temporal arrays

        System.arraycopy(mainArray, low , arrayLeft, 0, length1);
        System.arraycopy(mainArray, middle + 1, arrayRight, 0, length2);

        int i = 0;
        int j = 0;
        int k = low;

        while(i < length1 &&  j < length2){
            if (arrayLeft[i] <= arrayRight[j]){
                mainArray[k] = arrayLeft[i];
                i = i + 1;
            }else{
                mainArray[k] = arrayRight[j];
                j = j +1;
            }
            k = k+1;
        }
        while (i < arrayLeft.length){
            mainArray[k] = arrayLeft[i];
            i= i + 1;
            k=k+1;
        }
        while (j < arrayRight.length){
            mainArray[k] = arrayRight[j];
            j= j + 1;
            k=k + 1;
        }

    }
    private static void mergeSort(Integer[] mainArray , int low, int high){
        if (low < high){
            int middle = low + (high - low) / 2;

            mergeSort(mainArray, low, middle);
            mergeSort(mainArray, middle+1, high);
            merge(mainArray, low, middle, high);

        }
    }
    public static void InsertionSort(Integer[] array){
        for (int i=0; i < array.length ; i++ ){
            int temp = array[i];

            int j = i-1;

            while(j>=0 && (array[j] > temp)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }
    }
    public static void main(String[] args) {
        Integer[] A = { 12, 14, 13, 5, 6, 7 };
        Integer[] B = { 12, 14, 13, 5, 6, 7 };


        mergeSort(A,0,A.length-1);
        InsertionSort(B);

        System.out.println(Arrays.asList(A));
        System.out.println(Arrays.asList(B));
    }
}