class Solution {
    public boolean backspaceCompare(String s, String t) {
        String FinalS = toDoTheThing(s);
        String FinalT = toDoTheThing(t);

        return FinalS.equals(FinalT);
    }

    private String toDoTheThing(String str)
    {
        StringBuilder stack = new StringBuilder();

        for(char c : str.toCharArray())
        {
            if(c != '#')
            {
                stack.append(c);
            }
            else if(stack.length() > 0)
            {
                stack.deleteCharAt(stack.length() - 1);
            }
        }
        return stack.toString();
    }
}