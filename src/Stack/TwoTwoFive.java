class MyStack {

    private java.util.Queue<Integer> queue;
    public MyStack() {
        queue = new java.util.LinkedList<>();
    }
    public void push(int x) {
        queue.add(x);

        int length = queue.size();
        for(int i = 0; i < length - 1; i++)
        {
            int oldFront = queue.remove();
            queue.add(oldFront);
        }
    }
    public boolean empty() {
        return queue.isEmpty();
    }
    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }
}
