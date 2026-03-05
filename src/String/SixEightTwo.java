class Solution {
    public int calPoints(String[] operations) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();

        for(String op : operations)
        {
            if(op.equals("+"))
            {
                int top1 = stack.pop();
                int top2 = stack.peek();

                int newScore = top1 + top2;
                stack.push(top1);
                stack.push(newScore);
            }
            else if(op.equals("D"))
            {
                stack.push(stack.peek() * 2);
            }
            else if(op.equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        for(int score : stack)
        {
            total += score;
        }
        return total;
    }
}