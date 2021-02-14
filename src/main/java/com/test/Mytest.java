package com.test;

import com.test.bean.Tb_user;
import com.test.mapper.CommMapper;
import com.test.util.SnowflakeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName : Mytest
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-02-14 19:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MycatApplication.class)
public class Mytest {
    @Autowired
    private CommMapper commMapper;
    //根据id路由到不同的表中，比如有三张表，用生成的id模3+1，就是表名
    @Test
    public void test1() {
        for (int i = 0; i < 1000; i++) {
            long id = SnowflakeUtil.nextId();
            //路由
            long l = id % 3;
            Tb_user user = new Tb_user();
            user.setUser_id(id);
            user.setUser_name("cxc" + i);
            user.setSeq((int)l + 1);
            commMapper.addT_user(user);
        }
    }

    //运用监听器和mybatis拦截SQL，在业务代码中不需要写表名的后缀了
    @Test
    public void test2() {
        for (int i = 0; i < 1000; i++) {
            long id = SnowflakeUtil.nextId();
            //路由
            Tb_user user = new Tb_user();
            user.setUser_id(id);
            user.setUser_name("cxc" + i);
            commMapper.addT_user(user);
        }
    }
}
