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
        System.out.println("MergeSort,InsertionSort, QuickSort Test ");
        System.out.println(Arrays.asList(A));
        System.out.println("Execution Time Merge " + (timeEndMerge - timeStartMerge));

        System.out.println(Arrays.asList(B));
        System.out.println("Execution Time Insertion " + (timeEndInsertion - timeStartInsertion));

        System.out.println(Arrays.asList(C));

        System.out.println("Execution Time QuickSort " + (timeEndQuickSort - timeStartQuickSort));


        //100 elements
        Integer[] numbers100 = new Integer[100];

        for(int i=0; i<100; i++){
            numbers100[i] = ((int)(Math.random()*100)+1);
        }

        Integer[] numbers100Merge = Arrays.copyOf(numbers100,numbers100.length);
        Integer[] numbers100Insertion = Arrays.copyOf(numbers100,numbers100.length);
        Integer[] numbers100Quick = Arrays.copyOf(numbers100,numbers100.length);

        long timeStart100Merge = System.nanoTime();
        mergeSort(numbers100Merge,0,numbers100Merge.length-1);
        long timeEnd100Merge = System.nanoTime();
        System.out.println("Execution Time MergeSort with 100 elements is " + (timeEnd100Merge - timeStart100Merge)/1000 + " ms");

        long timeStart100Insertion = System.nanoTime();
        InsertionSort(numbers100Insertion);
        long timeEnd100Insertion = System.nanoTime();
        System.out.println("Execution Time InsertionSort with 100 elements is " + (timeEnd100Insertion - timeStart100Insertion)/1000 + " ms");

        long timeStart100Quick = System.nanoTime();
        quickSort(numbers100Quick,0,numbers100Quick.length-1);
        long timeEnd100Quick = System.nanoTime();
        System.out.println("Execution Time QuickSort with 100 elements is  " + (timeEnd100Quick - timeStart100Quick)/1000 + " ms");


        //1000 elements
        Integer[] numbers1000 = new Integer[1000];

        for(int i=0; i<1000; i++){
            numbers1000[i] = ((int)(Math.random()*1000)+1);
        }

        Integer[] numbers1000Merge = Arrays.copyOf(numbers1000,numbers1000.length);
        Integer[] numbers1000Insertion = Arrays.copyOf(numbers1000,numbers1000.length);
        Integer[] numbers1000Quick = Arrays.copyOf(numbers1000,numbers1000.length);

        long timeStart1000Merge = System.nanoTime();
        mergeSort(numbers1000Merge,0,numbers1000Merge.length-1);
        long timeEnd1000Merge = System.nanoTime();
        System.out.println("Execution Time MergeSort with 1000 elements is " + (timeEnd1000Merge - timeStart1000Merge)/1000 + " ms");

        long timeStart1000Insertion = System.nanoTime();
        InsertionSort(numbers1000Insertion);
        long timeEnd1000Insertion = System.nanoTime();
        System.out.println("Execution Time InsertionSort with 1000 elements is " + (timeEnd1000Insertion - timeStart1000Insertion)/1000 + " ms");

        long timeStart1000Quick = System.nanoTime();
        quickSort(numbers1000Quick,0,numbers1000Quick.length-1);
        long timeEnd1000Quick = System.nanoTime();
        System.out.println("Execution Time QuickSort with 1000 elements is  " + (timeEnd1000Quick - timeStart1000Quick)/1000 + " ms");


        //10000 elements
        Integer[] numbers10k = new Integer[10000];

        for(int i=0; i<10000; i++){
            numbers10k[i] = ((int)(Math.random()*10000)+1);
        }

        Integer[] numbers10kMerge = Arrays.copyOf(numbers10k,numbers10k.length);
        Integer[] numbers10kInsertion = Arrays.copyOf(numbers10k,numbers10k.length);
        Integer[] numbers10kQuick = Arrays.copyOf(numbers10k,numbers10k.length);

        long timeStart1MMerge = System.nanoTime();
        mergeSort(numbers10kMerge,0,numbers10kMerge.length-1);
        long timeEnd1MMerge = System.nanoTime();
        System.out.println("Execution Time MergeSort with 10000 elements is " + (timeEnd1MMerge - timeStart1MMerge)/1000 + " ms");

        long timeStart1MInsertion = System.nanoTime();
        InsertionSort(numbers10kInsertion);
        long timeEnd1MInsertion = System.nanoTime();
        System.out.println("Execution Time InsertionSort with 10000 elements is " + (timeEnd1MInsertion - timeStart1MInsertion)/1000 + " ms");

        long timeStart1MQuick = System.nanoTime();
        quickSort(numbers10kQuick,0,numbers10kQuick.length-1);
        long timeEnd1MQuick = System.nanoTime();
        System.out.println("Execution Time QuickSort with 10000 elements is  " + (timeEnd1MQuick - timeStart1MQuick)/1000 + " ms");



    }
}