public class Main {


    public static void main(String[] args) {
            MyStack myStack = new MyStack();
            MyStackArrayList myStackArrayList = new MyStackArrayList();
            MyQueue myQueue = new MyQueue();
            MyQueueArrayList myQueueArrayList = new MyQueueArrayList();

            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            myStack.pop();
            myStack.push(15);
            myStack.printArray();
            System.out.println(myStack.peek());

            //Stack with ArrayList

            myStackArrayList.push(1);
            myStackArrayList.push(2);
            myStackArrayList.push(3);
            myStackArrayList.push(4);
            myStackArrayList.push(1);
            myStackArrayList.pop();
            myStackArrayList.pop();
            myStackArrayList.push(15);
            myStackArrayList.printArray();
            System.out.println(myStackArrayList.peek());

            //Queue
            myQueue.add(1);
            myQueue.add(2);
            myQueue.add(3);
            myQueue.add(4);
            myQueue.add(5);
            myQueue.poll();
            myQueue.poll();
            myQueue.printArray();
            System.out.println(myQueue.peek());

            //Queue with ArrayList
            myQueueArrayList.add(1);
            myQueueArrayList.add(2);
            myQueueArrayList.add(3);
            myQueueArrayList.add(4);
            myQueueArrayList.add(5);
            myQueueArrayList.poll();
            myQueueArrayList.poll();
            myQueueArrayList.printArray();
            System.out.println(myQueueArrayList.peek());

        }
}

