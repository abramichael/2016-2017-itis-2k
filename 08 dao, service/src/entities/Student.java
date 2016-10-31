package entities;

/**
 * Created by ma on 31.10.2016.
 */
public class Student {
    private long id;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public long getGroup_id() {
        return group_id;
    }

    public long getId() {
        return id;
    }

    private String name;
    private int year;
    private long group_id;
    private Group group;

    public Student(int id, String name, int year, int group_id) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.group_id = group_id;
    }
}
