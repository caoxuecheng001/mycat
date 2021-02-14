package com.test.bean;

import lombok.Data;

/**
 * @ClassName : Tb_user
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-02-14 19:20
 */
@Data
public class Tb_user {
    public Long user_id;

    public String user_name;

    public Integer seq;

    //properties配置文件
    public RouteBean routeBean;
}
