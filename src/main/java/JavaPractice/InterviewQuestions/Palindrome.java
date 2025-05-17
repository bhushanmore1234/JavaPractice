package JavaPractice.InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String name = "nitin";
        String revName ="";
        char[] newChar = new char[name.length()];

        char[] nameChar = name.toCharArray();
        System.out.println(nameChar);
        for (int i = nameChar.length-1, j = 0; i >= 0; i--, j++) {
            newChar[j] = nameChar[i];
        }
        revName = new String(newChar);
        System.out.println(revName);
       if (name.equals(revName))
       {
           System.out.println("String is palindrome");
       }else System.out.println("Not a palindrome");

    }
}
