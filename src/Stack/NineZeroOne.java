class StockSpanner {

    java.util.Deque<int[]> stack;

    public StockSpanner() {
        stack = new java.util.ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price)
        {
            int[] trappedDay = stack.pop();
            span += trappedDay[1];
        }

        stack.push(new int[]{price,span});

        return span;
    }
}