//https://www.w3resource.com/java-exercises/stack/index.php
package w3schools;

public class Stack {
//Write a Java program to implement a stack with push and pop operations. Find the top element of the stack and check if it is empty or not.
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

//Write a Java program to sort the elements of a given stack in ascending order.
  public static void main(String[] args) {
    
  }
}
