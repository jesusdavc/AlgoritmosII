import java.util.Arrays;
public class Main {
    //MergeSort
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
    //InsertionSort
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
    //QuickSort
    public static Integer Partition(Integer[] array, Integer low, Integer high){
        int x = array[high];
        int i = low ;
        for (int j = low; j < high ; j++){
            if(array[j] <= x){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i = i + 1;
            }
        }
        int temp2 = array[i];
        array[i] = array[high];
        array[high] = temp2;
        return i;
    }

    public static void quickSort(Integer[] array, Integer low, Integer high){
        if (low < high){
            int q = Partition(array,low,high);
            quickSort(array,low,q-1);
            quickSort(array,q+1,high);
        }
    }
    public static void main(String[] args) {
        Integer[] A = { 12, 14, 13, 5, 6, 7, 3,55,66,17,23,68, 44, 46, 101, 500, 1 };
        Integer[] B = { 12, 14, 13, 5, 6, 7, 3,55,66,17,23,68, 44, 46, 101, 500, 1 };
        Integer[] C = { 12, 14, 13, 5, 6, 7, 3,55,66,17,23,68, 44, 46, 101, 500, 1 };

        long timeStartMerge = System.nanoTime();
        mergeSort(A,0,A.length-1);
        long timeEndMerge = System.nanoTime();

        long timeStartInsertion = System.nanoTime();
        InsertionSort(B);
        long timeEndInsertion = System.nanoTime();

        long timeStartQuickSort = System.nanoTime();
        quickSort(C,0,C.length-1);
        long timeEndQuickSort = System.nanoTime();

        System.out.println(Arrays.asList(A));
        System.out.println("Execution Time Merge " + (timeEndMerge - timeStartMerge));

        System.out.println(Arrays.asList(B));
        System.out.println("Execution Time Insertion " + (timeEndInsertion - timeStartInsertion));

        System.out.println(Arrays.asList(C));

        System.out.println("Execution Time QuickSort " + (timeEndQuickSort - timeStartQuickSort));


    }
}