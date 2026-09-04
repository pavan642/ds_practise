import java.util.Stack;

public class ValidParenthesis {
    private static void isValidParenthesis(String input){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push('(');
            }  else if(input.charAt(i) == ')'){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.print("Valid");
        } else {
            System.out.print("In Valid");
        }
    }
    public static void main(String[] args){
        String input = "()(())()";
        isValidParenthesis(input);
    }
}
