package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class SevenOne {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] tokens  = path.split("/");

        for(String token : tokens)
        {
            if(token.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if(!token.isEmpty() && !token.equals("."))
            {
                stack.push(token);
            }
        }
        if(stack.isEmpty())
        {
            return "/";
        }
        StringBuilder finalPath = new StringBuilder();
        Iterator<String> it = stack.descendingIterator();

        while(it.hasNext())
        {
            finalPath.append("/").append(it.next());
        }
        return finalPath.toString();
    }
}