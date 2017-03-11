/**
 * Created by ma on 09.02.2017.
 */
public class Student {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String name, int year) {
        this.year = year;
        this.name = name;
    }
}
