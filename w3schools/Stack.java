//https://www.w3resource.com/java-exercises/stack/index.php
package w3schools;

public class Stack {
  private int[] arr;
  private int top;

  public Stack(int size) {
    arr = new int[size];
    top = -1;
  }

  public void push(int num) {
    if (top == arr.length - 1) {
      System.out.println("Stack esta cheia");
    } else {
      top++;
      arr[top] = num;
    }
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    } else {
      int poppedElement = arr[top];
      top--;
      return poppedElement;
    }
  }

  public int peek() {
    if (top == -1) {
      System.out.println("Stack esta vazia");
      return -1;
    } else {
      return arr[top];
    }
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void display() {
    if (top == -1) {
      System.out.println("Stack esta vazia");
    } else {
      System.out.print("Elementos da stack: ");
      for (int i = top; i >= 0; i--) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Inicializando a stack:");
    Stack stack = new Stack(5);
    System.out.println("A stack esta vazia? " + stack.isEmpty());
    System.out.println("\n Adicionado elementos ao stack:");
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.display();
    System.out.println("\n Primeiro elemento da stack: " + stack.peek());
    System.out.println("\n Remover dois elementos da stack:");
    stack.pop();
    stack.pop();
    stack.display();
    System.out.println("\n Adicionando elementos ao inicio da stack apos remover: " + stack.peek());
    System.out.println("\n A stack esta vazia? " + stack.isEmpty());
  }
}
