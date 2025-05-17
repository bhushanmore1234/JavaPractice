package JavaPractice.InterviewQuestions;

import java.util.Scanner;

public class Reverse_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your sentence = ");
        String input = sc.nextLine();

        String word[] = input.split(" ");

        for (int i = word.length-1; i >=0; i--) {

            System.out.print(word[i]+" ");

        }

    }
}
