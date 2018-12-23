package Practice7;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> queue1 = new ArrayDeque<>();
        ArrayDeque<Integer> queue2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            queue1.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            queue2.add(scan.nextInt());
        }
        play(queue1, queue2);
    }

    static void play(ArrayDeque<Integer> queue1, ArrayDeque<Integer> queue2) {
        int step = 0;
        while (!(queue1.isEmpty() || queue2.isEmpty()))
        {
            if (step >= 106)
                break;
            if (queue1.peek() == 0 && queue2.peek() == 9) {
                queue1.add(queue1.pop());
                queue1.add(queue2.pop());
            }
            else if (queue1.peek() == 9 && queue2.peek() == 0) {
                queue2.add(queue1.pop());
                queue2.add(queue2.pop());
            }
            else if (queue1.peek() < queue2.peek()) {
                queue2.add(queue1.pop());
                queue2.add(queue2.pop());
            }
            else if (queue1.peek() > queue2.peek()) {
                queue1.add(queue1.pop());
                queue1.add(queue2.pop());
            }
            step++;
            System.out.println("Шаг №" + step + "\nИгрок 1: " + queue1 + "\nИгрок 2:" + queue2);
        }
        if(queue1.isEmpty())
            System.out.println("Игрок 2 победил");
        else if(queue2.isEmpty())
            System.out.println("Игрок 1 победил");
        else
            System.out.println("botva");
    }
}
