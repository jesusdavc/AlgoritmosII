import java.util.Arrays;

public class MyQueue implements MyQueueInterface{

    private int[] queue;

    public MyQueue() {
        this.queue = new int[0];
    }

    @Override
    public void add(int item) {
        int[] newArray = new int[queue.length + 1];
        newArray[queue.length] = item;
        System.arraycopy(queue, 0, newArray, 0, queue.length);
        queue = newArray;
    }

    @Override
    public Integer peek() {
        if(queue.length > 0) {
            return queue[0];
        }
        return null;
    }

    @Override
    public Integer poll() {
        if(queue.length > 0) {
            int valueToReturn = queue[0];
            queue = Arrays.copyOfRange(queue, 1, queue.length);
            return valueToReturn;
        }
        return null;
    }
    public void printArray(){
        System.out.println(Arrays.toString(queue));
    }

}
