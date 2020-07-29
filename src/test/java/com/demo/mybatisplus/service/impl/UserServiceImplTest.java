package com.demo.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.mybatisplus.mapper.UserMapper;
import com.demo.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void save() {
        User user = new User();
        user.setId(14L);
        user.setAge(22);
        user.setName("save");
        System.out.println(userMapper.insert(user));
        System.out.println(userMapper.selectById(14L));
        System.out.println(userMapper.deleteById(14L));
    }

    @Test
    void saveBatch() {
    }

    @Test
    void testSaveBatch() {
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void saveOrUpdateByCondition() {
    }

    @Test
    void saveOrUpdateBatch() {
    }

    @Test
    void testSaveOrUpdateBatch() {
    }

    @Test
    void remove() {
    }

    @Test
    void removeById() {
        System.out.println(userMapper.selectById(2L));
        System.out.println(userMapper.deleteById(2L));
        System.out.println(userMapper.selectById(2L));
    }

    @Test
    void removeByMap() {
    }

    @Test
    void removeByIds() {
    }

    @Test
    void update() {
    }

    @Test
    void testUpdate() {
    }

    @Test
    void updateById() {
        User user = new User();
        user.setId(10L);
        user.setAge(22);
        user.setName("update");
        userMapper.updateById(user);
        System.out.println(userMapper.selectById(10L));
        user.setName("revert");
        userMapper.updateById(user);
    }

    @Test
    void updateBatchById() {
    }

    @Test
    void testUpdateBatchById() {
    }

    @Test
    void getById() {

    }

    @Test
    void getOne() {
    }

    @Test
    void testGetOne() {
    }

    @Test
    void getMap() {
    }

    @Test
    void getObj() {
    }

    @Test
    void list() {
        /*QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("id", 13L) // =
                .ne("id", 12L) // <>
                .gt("age", 22) // >
                .ge("age", 23) // >=
                .lt("age", 11) // <
                .le("age", 24) // <=
                .between("age", 11, 33) // between 11 and 33
                .notBetween("age", 12, 13) // not between 12 and 33
                .like("name", "liu") // %liu%
                .likeLeft("name", "wang") // %wang
                .likeRight("name", "liu") // liu%
                .in("age", Arrays.asList(11, 2)) // in(11,2)
                .in("age", 1,2,3) // in(1,2,3)
                .inSql("age", "1,2,3") // in(1,2,3)
                .notInSql("id", "select id from table where id < 3") // not in(select id from table where id < 3)
                .groupBy("id", "age"); // group by id, age

        System.out.println(userMapper.selectList(qw).size());*/
    }

    @Test
    void testList() {
    }

    @Test
    void listByIds() {
    }

    @Test
    void listByMap() {
    }

    @Test
    void listMaps() {
    }

    @Test
    void testListMaps() {
    }

    @Test
    void listObjs() {
    }

    @Test
    void testListObjs() {
    }

    @Test
    void testListObjs1() {
    }

    @Test
    void testListObjs2() {
    }

    @Test
    void page() {
        Page<User> userPage = new Page<>(1, 3);
        System.out.println(userMapper.selectPageVo(userPage, "liuhuan").getRecords());
    }

    @Test
    void testPage() {
        Page<User> userPage = new Page<>(1, 3);
        System.out.println(userMapper.selectPage(userPage, null).getRecords());
    }

    @Test
    void pageMaps() {
    }

    @Test
    void testPageMaps() {
    }

    @Test
    void count() {
    }

    @Test
    void testCount() {
    }

    @Test
    void query() {
    }

    @Test
    void lambdaQuery() {
    }

    @Test
    void testUpdate1() {
    }

    @Test
    void lambdaUpdate() {
    }

    @Test
    void listUser() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "liuhuan")
        .eq("id", "1");

        System.out.println(userMapper.selectList(wrapper));
    }
}