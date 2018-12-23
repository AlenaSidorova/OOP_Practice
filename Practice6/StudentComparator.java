package Practice6;

import java.util.*;

public class StudentComparator implements Comparator<Student>{

        public int compare(Student student1, Student student2)
        {
            if( student1.getTotalMarks() > student2.getTotalMarks() )
                return -1;
            else if( student1.getTotalMarks() < student2.getTotalMarks() )
                return 1;
            else
                return 0;
        }
}
