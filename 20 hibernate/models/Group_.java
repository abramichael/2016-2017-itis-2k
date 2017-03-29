package models;

import models.Group;
import models.Student;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Group.class)
public abstract class Group_ {

	public static volatile SingularAttribute<Group, String> name;
	public static volatile ListAttribute<Group, Student> students;
	public static volatile SingularAttribute<Group, Long> id;

}

