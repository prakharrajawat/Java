import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    // stack.push(34);
    // stack.push(45);
    // stack.push(23);
    // stack.push(67);
    // stack.push(38);

    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());

    Queue<Integer> queue = new LinkedList<>();

    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.add(7);
    queue.add(1);

    System.out.println(queue.remove());
  }
}
