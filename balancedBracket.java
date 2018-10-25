
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
    // Write your code here. DO NOT use an access modifier in your class declaration.
class  Parser{
    
    char[] stack = null;
    int top = 0;
    String isBalanced(String str){
        top = 0;
        stack = new char[str.length()];
        char current;
        int i = 0;
        char popped;
        while(i<str.length()){
            current = str.charAt(str.length()-1-i);
            //System.out.println("current:" + current);
            //System.out.println("top is: "+ top);
            popped = pop();
           // System.out.println("popped:" + popped);
            if(popped==0){
                push(current);
            }else{
                switch(popped){
                case '{':
                    if(current != '}'){
                        push(popped);
                        push(current);
                    }
                    break;    
                case '}':
                        if(current != '{'){
                            push(popped);
                            push(current);
                        }
                    break;
                case '(':
                        if(current != ')'){
                            push(popped);
                            push(current);
                        }
                    break;  
                case ')':
                        if(current != '('){
                            push(popped);
                         push(current)  ; 
                        }
                    break;  
                case ']':
                        if(current != '['){
                            push(popped);
                         push(current); 
                        }
                    break;
                case '[':
                        if(current != '['){
                            push(popped);
                         push(current); 
                        }
                break;
                }
            }
            i++;
        }
        if(top!=0){
            return "NO";
        }else{
            return "YES";
        }
    }
    
    char pop(){
        if(top<=0)
            return 0;
        else
            return stack[--top];
    }
    
    void push(char c){
        stack[top++]=c;
    }
}

public class balancedBracket {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        Parser p = new Parser();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
            System.out.println(p.isBalanced(expression));
        }

        scanner.close();
    }
}

