import java.util.ArrayList;

public class MyQueueArrayList implements MyQueueInterface{

    ArrayList<Integer> queueList = new ArrayList<>();

    @Override
    public void add(int item) {
        queueList.add(item);
    }

    @Override
    public Integer peek() {
        if(queueList.isEmpty()) {
            return null;
        }
        return queueList.get(0);
    }

    @Override
    public Integer poll() {
        if(queueList.isEmpty()) {
            return null;
        }
        return queueList.remove(0);
    }

    @Override

    public void printArray(){
        System.out.println(queueList);
    }
}

