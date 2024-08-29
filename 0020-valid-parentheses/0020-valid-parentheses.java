class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Deque<Character> stack
            = new ArrayDeque<Character>();
        for(Character c : ch) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
                continue;
            } 

            if(stack.isEmpty())
                return false;

            char check;
             switch (c) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;

            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;

            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}