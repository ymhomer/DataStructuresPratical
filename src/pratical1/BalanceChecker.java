package pratical1;
import java.util.Stack;

public class BalanceChecker {
    public static char open,close,nextCharacter;
    public static boolean isBalance = true;
    
    public static void main(String[] args) {
        //String expression = "{()}";
        //String expression = "{[)}";
        //String expression = "{}[]()";
        //String expression = "(6+2)/(5*3)";
        String expression = "62+53*/";
        System.out.println("Method \""+expression+"\" is "+checkBrackets(expression)+".");
    }
    
    public static boolean checkBrackets(String expression){
        Stack <Character> myStack = new Stack<>();
        
        for (int i=0; isBalance && i<expression.length();++i){
            nextCharacter = expression.charAt(i);
            //check open
            if (nextCharacter=='('||nextCharacter=='['||nextCharacter =='{'){
                myStack.push(nextCharacter);
            }
            //check close
            if (nextCharacter==')'||nextCharacter == ']'||nextCharacter == '}'){
                if (myStack.isEmpty()){
                    isBalance = false;
                }
                else{
                    close = nextCharacter;
                    open = myStack.pop();
                    isBalance = checkPair();
                }
            }
        }
        if (!(myStack.isEmpty())) {
              isBalance = false;
        }
        return isBalance;
    }
    //Check Pair
    private static boolean checkPair() {
        return (open == '(' && close == ')')||(open == '{' && close == '}')||(open == '[' && close == ']')? true:false;
    }
    /*
    public static String convertToPostfix(String infix){
        Stack <Character> operatorStack = new Stack<>();
        char topOperator;
        
        for (int i=0;i<infix.length();i++){
            boolean done = false;
            nextCharacter = infix.charAt(i);
            if (isVariable (nextCharacter)){
                postfix = postfix.append (nextCharacter);
            }
        }
        return "";
    }
    */
}