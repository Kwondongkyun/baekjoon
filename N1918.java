import java.util.*;
public class N1918 {
    public static int arith(char c){
        if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Stack<Character> stk = new Stack<>();
        char[] arr = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                sb.append(arr[i]);
            }
            else{
                if(arr[i]=='('){
                    stk.push(arr[i]);
                }
                else if(arr[i]==')'){
                    while(!stk.isEmpty() && stk.peek()!='('){
                        sb.append(stk.pop());
                    }
                    if(!stk.isEmpty()) {
                        stk.pop();
                    }
                }
                else {
                    while(!stk.isEmpty() && arith(stk.peek()) >= arith(arr[i])) {
                        sb.append(stk.pop());
                    }
                    stk.push(arr[i]);
                }
            }
        }
        while(!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        System.out.println(sb);
    }
}
