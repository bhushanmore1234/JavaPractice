package JavaPractice.InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Bhushan";
        String revName ="";
        char[] newChar = new char[name.length()];

        char[] nameChar = name.toCharArray();
        System.out.println(nameChar);
        for (int i = nameChar.length-1, j = 0; i >= 0; i--, j++) {
             newChar[j] = nameChar[i];
        }
        System.out.println("Reverse String is : "+new String(newChar));

    }
}
