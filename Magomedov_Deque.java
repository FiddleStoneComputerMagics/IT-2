import java.util.ArrayDeque;
import java.util.Scanner;

public class Nachos_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> nachos = new ArrayDeque<>();
        System.out.println("Введите 4 целых числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
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
