package com.yzu.recruit.dataaccess.mapper;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yzu.recruit.dataaccess.model.UserEntityExt;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class UserEntityMapperExtTest {

    @Autowired
    private UserEntityMapperExt userEntityMapperExt;

    public UserEntityMapperExtTest() {
       // scriptBeforeClass = "com/yzu/recruit/database/mapper/UserEntityMapperExtBefore.sql";
      //  scriptAfterClass = "com/yzu/recruit/database/mapper/UserEntityMapperExtAfter.sql";
    }

    @Test
    public void testInsertUser() {
        UserEntityExt userEntityExt = new UserEntityExt();
        userEntityExt.setName("testGeorge");
        userEntityExt.setPassword("$2a$10$R2O3b/ov9OS0Ph2N99HIU.npITLDCjTi.jLmDrSMQISLEn/SX4X9y");
        userEntityExt.setRoleid(5);
        userEntityExt.setRegisterdate(new Date());

        userEntityMapperExt.insertUserEntity(userEntityExt);
        UserEntityExt userEntityExt2 = userEntityMapperExt.getBaseUserByID(userEntityExt.getUserid());
        Assert.assertEquals("testGeorge", userEntityExt2.getName());
        Assert.assertTrue(userEntityExt.getUserid() > 1);

    }

    @Test
    public void testSelectUserByName(){
        UserEntityExt userEntityExt = userEntityMapperExt.getBaseUserByName("testGeorge");
        Assert.assertTrue(userEntityExt.getUserid() > 0);
    }

    @Test
    public void testSelectUserById() {
        UserEntityExt userEntityExt = userEntityMapperExt.getUserByID(7);
        Assert.assertTrue(userEntityExt.getUserid() > 0);
    }
}
