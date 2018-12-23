package Practice2;

import java.lang.*;
import java.util.ArrayList;

public class TestAuthor {

    public static void main(String[] args)
    {
        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(new Author("Name", "email@email.com", 'M'));

        for(Author it : authors)
            System.out.println(it);
    }
}
