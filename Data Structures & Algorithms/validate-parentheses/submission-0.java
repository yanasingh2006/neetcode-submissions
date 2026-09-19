class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch2 = stack.peek();
                if ((ch == ')' && ch2 != '(') || (ch == ']' && ch2 != '[') || (ch == '}' && ch2 != '{')) {
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
