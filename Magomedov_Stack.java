import java.util.Stack;

public class Nachos_1 {
    Stack<Integer> st = new Stack<>();
    static void PUSH (Stack st) {
        int a= 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = Math.abs(a)+ Math.abs(b) + Math.abs(c) + Math.abs(d);
        st.push(a);
        st.push(b);
        st.push(c);
        st.push(d);
        st.push(e);
        System.out.println("Стек:" +st);
    }
}
