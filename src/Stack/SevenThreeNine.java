class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> Stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++)
        {
            int CurrentTemp = temperatures[i];
            while( !Stack.isEmpty() && CurrentTemp > temperatures[Stack.peek()])
            {
                int prevDay = Stack.pop();
                answer[prevDay] = i - prevDay;
            }
            Stack.push(i);
        }
        return answer;
    }
}