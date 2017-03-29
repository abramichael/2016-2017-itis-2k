package models;

import models.Group;
import models.Student;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, String> name;
	public static volatile SingularAttribute<Student, Long> id;
	public static volatile SingularAttribute<Student, Group> group;

}

