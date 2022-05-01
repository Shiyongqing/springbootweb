package com.syq.service.impl;

import com.syq.dao.TestDao;
import com.syq.model.Test;
import com.syq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author syq
 * @date 2022/4/8 22:33
 * @info：
 * @modified：
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;


    @Override
    public String hello(Integer id) {
        Optional<Test> test = testDao.findById(id);
        if ( !test.isPresent()){
            return "未找到数据";
        }
        return "hello word : "+test.get().getCountryCode();
    }

    @Override
    public Test getTest(Integer id) {
        Optional<Test> test = testDao.findById(id);
        if ( test.isPresent()){
            return test.get();
        }
        return null;
    }


    @Override
    @Transactional(rollbackOn = Exception.class) //异常事务进行回滚
    public Test saveTest(){

        Test test = new Test();
        test.setName("saveTest");
        test.setCountryCode("0001");
        test.setCreateTime(new Date());
        test = testDao.save(test);

        return test;
    }

    @Override
    public List<Test> getAll() {
        Iterable<Test> all = testDao.findAll();
        return (List<Test>) all;
    }


    @Override
    public List<Test> getAllById(Integer id) {
        Iterable<Test> all = testDao.finallByIdP(id);
        return (List<Test>) all;
    }



    @Override
    public List<Test> getAllByName(String  name) {
        Iterable<Test> all = testDao.finallByName(name);
        return (List<Test>) all;
    }
}
