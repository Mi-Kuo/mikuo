package Mik.test;

import Mik.mapper.TbMsgMapper;

import Mik.pojo.TbMsg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: 米阔
 * @Date: 2019/7/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMapper {

    @Resource
    TbMsgMapper tbMsgMapper;

    @Test
    public  void   test(){


        TbMsg m = new TbMsg();
         m.setMsg("华为5g手机");
         m.setName("hello");

         tbMsgMapper.save(m);

        System.out.println(tbMsgMapper.findAl());

    }

}
