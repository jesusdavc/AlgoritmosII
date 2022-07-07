import java.util.ArrayList;

public class MyStackArrayList implements MyStackInterface {
    ArrayList<Integer> stackList = new ArrayList<Integer>();

    @Override
    public void push(int item) {
        stackList.add(item);
    }

    @Override
    public Integer pop() {
        if(stackList.isEmpty()) {
            return null;
        }
        Integer numberDeleted = stackList.get(stackList.size() -1);
        stackList.remove(stackList.size() -1);
        return numberDeleted;
    }

    @Override
    public Integer peek() {
        if(stackList.isEmpty()) {
            return null;
        } return stackList.get(stackList.size()-1);
    }

    public void printArray(){
        System.out.println(stackList);
    }

}