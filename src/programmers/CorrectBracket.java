package programmers;


import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Stack;

public class CorrectBracket {
    public static void main(String[] args) {
        String s = "((())()";
        boolean output = solution(s);
        System.out.println(output);

    }
    static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }

            if (s.charAt(i) == ')') {
                if (stack.size() == 0) {
                    return false;
                } else stack.pop();
            }
        }

        if (stack.size() != 0) answer = false;

        return answer;
     }
    }

