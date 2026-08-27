
class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String e : operations) {
            if (e.equals("+")) {
                int p2 = stack.pop();
                int p1 = stack.pop();
                int sigma = p1 + p2;
                stack.push(p1);
                stack.push(p2);
                stack.push(sigma);
            } else if (e.equals("C")) { // cancel the last one.
                stack.pop();
            } else if (e.equals("D")) { // double last one and add it to stack
                Integer x = stack.peek() * 2;
                stack.push(x);
            } else {
                stack.push(Integer.parseInt(e));
            }
        }

        int res = 0;
        while(!stack.isEmpty()) {
            res = res+stack.pop();
        }

        return res;
    }
}