package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="groups")
public class Group {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @OneToMany(mappedBy = "group")
    private List<Student> students;

    @Column
    private String name;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", students=" + students +
                ", name='" + name + '\'' +
                '}';
    }
}

