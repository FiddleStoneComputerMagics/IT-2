import java.util.ArrayDeque;

public class Nachos_10 {
    public static void main(String[] args) {
        ArrayDeque<Integer> nachos = new ArrayDeque<>();
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        nachos.addFirst(a);
        nachos.add(b);
        nachos.add(c);
        nachos.addLast(d);
        System.out.println(nachos);
        int sum = a+b+c+d;
        nachos.clear();
        nachos.addFirst(a);
        nachos.add(sum);
        nachos.add(b);
        nachos.add(sum);
        nachos.add(c);
        nachos.add(sum);
        nachos.add(d);
        nachos.addLast(sum);
        System.out.println(nachos);
    }
}
