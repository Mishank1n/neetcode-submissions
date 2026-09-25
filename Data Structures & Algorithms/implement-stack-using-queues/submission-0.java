class MyStack {
    List<Integer> stack;
    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        int a = stack.getLast();
        stack.removeLast();
        return a;
    }

    public int top() {
        return stack.getLast();

    }

    public boolean empty() {
        return stack.isEmpty();
    }
}