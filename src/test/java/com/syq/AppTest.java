package com.syq;

import com.syq.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Autowired
    private TestService testService;
   @Test
    public void shouldAnswerWithTrue()
    {
        List<com.syq.model.Test> allById = testService.getAllByName("test");
        System.out.println(allById);
    }
}
