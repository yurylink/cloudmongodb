package com.yurylink.cloudmongodb.repositories;

import com.yurylink.cloudmongodb.interfaces.Todolist;
import org.springframework.data.repository.CrudRepository;

public interface todolistRepository extends CrudRepository<Todolist, Integer> {
}
