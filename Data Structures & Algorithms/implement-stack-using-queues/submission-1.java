class MyStack {

    private final Queue<Integer> q = new LinkedList<>();
    private int top;

    public void push(int x) {
        q.add(x);          // O(1)
        top = x;           // запоминаем последний добавленный
    }

    public int pop() {     // O(n)
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            top = q.remove();   // предпоследний станет новым top
            q.add(top);
        }
        return q.remove();      // последний добавленный
    }

    public int top() { return top; }          // O(1)

    public boolean empty() { return q.isEmpty(); }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */