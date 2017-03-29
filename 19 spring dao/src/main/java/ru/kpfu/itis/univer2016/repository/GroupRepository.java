package ru.kpfu.itis.univer2016.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import models.Group;

/**
 * Created by ma on 14.04.2016.
 */
@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {


    @Query("from Group g where g.name = :name")
    Group getOneGroupByName(@Param("name") String groupName);


    Group findByName(String name);

}
