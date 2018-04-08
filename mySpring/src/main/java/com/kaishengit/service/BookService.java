package com.kaishengit.service;

import com.kaishengit.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

    public class  {

        private  String bookName;
        private  Integer num;
        private List<String> lists;
        private Set<String> sets;
        private Map<String,Object> maps;
        private Properties properties;
        private UserDao userDao;

        public void setNum(Integer num) {
            this.num = num;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        public void setSets(Set<String> sets) {
            this.sets = sets;
        }

        public void setLists(List<String> lists) {
            this.lists = lists;
        }

        public void setMaps(Map<String, Object> maps) {
            this.maps = maps;
        }

        public void setUserDao(UserDao userDao) {
            this.userDao = userDao;
        }


        public void shoeBook() {
            System.out.println("BookService{" +
                    "bookName='" + bookName + '\'' +
                    ", num=" + num +
                    ", lists=" + lists +
                    ", sets=" + sets +
                    ", maps=" + maps +
                    ", properties=" + properties +
                    '}');
        }
    }


}
