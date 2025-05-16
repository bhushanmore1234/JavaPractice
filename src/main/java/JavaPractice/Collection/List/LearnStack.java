package JavaPractice.Collection.List;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {


        /*
           MAJORLY WE USE ON PUSH , POP AND PEEK METHODS FOR STACK
            LIFO - Last in First Out
        *  PUSH - We use this to add element in the list
        *  PEEK - We use this to see which element is on the top
        *  POP  - We use this to remove top element from the stack
        *
        * */


        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");
        System.out.println("Stack : "+animal);

        System.out.println("It will give you on top element Peek : "+animal.peek());
        System.out.println("It will remove top element Pop: "+animal.pop());

        System.out.println("Stack : "+animal);
        System.out.println("It will give you on top element Peek : "+animal.peek());



    }
}

