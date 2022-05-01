package com.syq.service;

import com.syq.model.Test;

import java.util.List;

/**
 * @author syq
 * @date 2022/4/8 22:32
 * @info：
 * @modified：
 */
public interface TestService {

    String hello(Integer id);

    Test getTest(Integer id);

    Test saveTest();

    List<Test> getAll();

    List<Test> getAllById(Integer id);

    List<Test> getAllByName(String name);
}
