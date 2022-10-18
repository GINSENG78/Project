package Lesson3.stringLesson;

public class ReverceString {
    public static void main(String[] args) {
        ReverceString reverceString = new ReverceString();
        reverceString.reverseString("dog");
    }

    public void reverseString(String textToReverse){
        if(textToReverse==null || textToReverse.isEmpty() || textToReverse.isBlank()){
            System.out.println("The string is null or empty");
        }
        else{
            System.out.println(String.format("The input string is %s",textToReverse));
            String result = "";
        int lastLetter = textToReverse.length()-1;
        for (int i=lastLetter; i>=0; i--){
            result = result +textToReverse.charAt(i);
        }
            System.out.println(result);
        }
    }
}
