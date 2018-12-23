package Practice6;

import java.util.Vector;

public class Student
{
    private int id;
    private String name;
    private int total;

    public Student(int id, int total, String name) {
        this.id = id;
        this.total = total;
        this.name = name;
    }

    public Student() {
        id = 0;
        total = 0;
        name = "";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getTotalMarks() {
        return total;
    }

    public String toString() {
        return "Student: " + name + ", id: " + id + ", total: " + total;
    }
}
