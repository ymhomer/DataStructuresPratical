package pratical1;

import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter a string : "));
        String inputStr = sc.nextLine();
        
        System.out.println(inputStr + (isPalindrome(inputStr)?" is a palindrome.":" is NOT a palindrome."));
    }
    
    public static boolean isPalindrome(String inputStr){
        Stack<Character> myStack = new Stack<>();
        Queue<Character> myQueue = new ArrayBlockingQueue<>(50);
        
        for (int i=0; i<inputStr.length();i++){
            myStack.push(inputStr.charAt(i));
        }
        String reverseString = "";
        while (!myStack.isEmpty()) {
            reverseString = reverseString+myStack.pop();
        }

        return inputStr.equals(reverseString)?true:false;
    }
}
