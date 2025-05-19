package JavaPractice.InterviewQuestions;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "Bhushan";
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 1; j < str.length()-1; j++) {
                if (chars[i]==chars[j])
                {
                    System.out.println("Duplicate character is: "+chars[i]);
                }
            }

        }
    }
}
