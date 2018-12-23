package Practice1;

import java.lang.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Test Book class\n");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The Picture of Dorian Gray", "Oscar Wilde"));
        books.add(new Book("The Devil Wears Prada", "Lauren Weisberger"));
        books.add(new Book("1984", "George Orwell"));

        for(Book it : books)
            System.out.println("Book #" + (books.indexOf(it)+1) + "\n" + it);

        System.out.println("Test Ball class\n");

        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball("Grey",13));
        balls.add(new Ball("Red",50));
        balls.add(new Ball("Black",100));

        for(Ball it : balls)
            System.out.println("Ball #" + (balls.indexOf(it)+1) + "\n" + it);
    }
}
