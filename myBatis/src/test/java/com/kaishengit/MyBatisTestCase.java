package com.kaishengit;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;

public class MyBatisTestCase {

    private Logger logger = LoggerFactory.getLogger(MyBatisTestCase.class);


    @Test
    public void testLoadXml() {

        try {
            //从classpath中读取mybatis.xml配置文件
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            //根据SqlSessionFactoryBuilder对象构建SqlSessionFactory
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //根据SqlSessionFactory对象创建SqlSession对象
            SqlSession sqlSession = sessionFactory.openSession();

            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
