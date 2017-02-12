/**
 * Created by ma on 09.02.2017.
 */
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    private String name;
    private int year;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
