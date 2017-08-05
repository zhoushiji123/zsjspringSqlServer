package com.springSqlServer;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Types;

/**
 * Created by zsj on 2017/8/5.
 */
@Repository
public class Dao {

    @Resource
    private JdbcTemplate sqlServerTemplate;

    public void insert(){
        String sql = "insert into student(xh,names,password,descrip) values(?,?,?,?)";
        Object[] params = new Object[]{"111","111","111","111"};
        int[] types = new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
        sqlServerTemplate.update(sql,params,types);
    }


    //插入图片，字段类型为VARBINARY，写入图片的byte[]
    //主键自增 不用在sql语句中写
    public void insertPic(byte[] picBytes){
        String sql = "insert into pic(picInfo) values(?)";
        Object[] params = new Object[]{picBytes};
        int[] types = new int[]{Types.VARBINARY};
        sqlServerTemplate.update(sql,params,types);
    }

}
