class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (openCount > 0) {
                    result += c;
                }
                openCount++;
            } else if (c == ')') {
                openCount--;
                if (openCount > 0) {
                    result += c;
                }
            }
        }

        return result;
    }
}
