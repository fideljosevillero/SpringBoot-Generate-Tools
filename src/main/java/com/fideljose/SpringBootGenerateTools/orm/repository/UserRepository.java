package com.fideljose.SpringBootGenerateTools.orm.repository;

import com.fideljose.SpringBootGenerateTools.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
