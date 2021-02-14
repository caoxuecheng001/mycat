package com.test.mapper;

import com.test.bean.Tb_user;
import org.apache.ibatis.annotations.Insert;

public interface CommMapper {
    @Insert("insert into t_user${seq}(user_id,user_name) values(#{user_id},#{user_name})")
    int addT_user(Tb_user user);

    @Insert("insert into t_user(user_id,user_name) values(#{user_id},#{user_name})")
    int addT_user1(Tb_user user);
}
