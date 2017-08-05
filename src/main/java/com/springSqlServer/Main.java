package com.springSqlServer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zsj on 2017/8/5.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Dao dao = (Dao) applicationContext.getBean("dao");
        String picUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1501950086307&di=274b604f0c9d44ec299fd5eb99d2bd7c&imgtype=0&src=http%3A%2F%2Fpic18.nipic.com%2F20120106%2F8935561_161257915000_2.jpg";
        dao.insertPic(PicUtil.getImageFromNetByUrl(picUrl));
    }
}
