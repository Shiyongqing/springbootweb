package com.syq.dao;

import com.syq.model.Test;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author syq
 * @date 2022/4/9 8:23
 * @info：
 * @modified：
 */
public interface TestDao extends CrudRepository<Test, Integer> {

       @Query(value = "select * from test a where a.id < ?1", nativeQuery = true)
       List<Test>  finallByIdP(Integer id);

       @Query(value = "select * from test a where a.name like concat('%',?1,'%') ", nativeQuery = true)
       List<Test>  finallByName(String name);
}
