import java.util.Arrays;

public class MyStack implements MyStackInterface {
    public int[] stack = new int[0];

    @Override
    public void push(int item) {
        int[] newStack = new int[stack.length + 1];

        System.arraycopy(stack, 0, newStack, 0, stack.length);

        newStack[stack.length] = item;
        stack = newStack;
    }

    @Override
    public Integer pop() {
        if(stack.length > 0) {
            int numberDeleted = stack[stack.length - 1];
            int[] newArray = new int[stack.length - 1];

            System.arraycopy(stack, 0, newArray, 0, stack.length - 1);

            stack = newArray;
            return numberDeleted;
        } else {
            return null;
        }
    }

    @Override
    public Integer peek() {
        if(stack.length > 0) {
            return stack[stack.length - 1];
        } else {
            return null;
        }
    }

    public void printArray(){
        System.out.println(Arrays.toString(stack));
    }


}