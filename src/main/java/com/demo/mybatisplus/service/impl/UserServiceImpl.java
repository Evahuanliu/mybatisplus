package com.demo.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.demo.mybatisplus.mapper.UserMapper;
import com.demo.mybatisplus.pojo.User;
import com.demo.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean saveBatch(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(User user) {
        return false;
    }

    @Override
    public boolean saveOrUpdateByCondition(User user, Map<String, Object> paramMap) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean remove(Map<String, Object> paramMap) {
        return false;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> paramMap) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<Long> idList) {
        return false;
    }

    @Override
    public boolean update(Map<String, Object> paramMap) {
        return false;
    }

    @Override
    public boolean update(User user, Map<String, Object> paramMap) {
        return false;
    }

    @Override
    public boolean updateById(User user) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<User> entityList, int batchSize) {
        return false;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getOne(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public User getOne(Map<String, Object> paramMap, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public <V> V getObj(Map<String, Object> paramMap, Function<User, V> mapper) {
        return null;
    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public List<User> list(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public Collection<User> listByIds(Collection<Long> idList) {
        return null;
    }

    @Override
    public Collection<User> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public List<Object> listObjs() {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public List<Object> listObjs(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Map<String, Object> paramMap, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<User> page(IPage<User> page) {
        return null;
    }

    @Override
    public IPage<User> page(IPage<User> page, Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<User> page) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<User> page, Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int count(Map<String, Object> paramMap) {
        return 0;
    }

    @Override
    public QueryChainWrapper<User> query() {
        return null;
    }

    @Override
    public LambdaQueryChainWrapper<User> lambdaQuery() {
        return null;
    }

    @Override
    public UpdateChainWrapper<User> update() {
        return null;
    }

    @Override
    public LambdaUpdateChainWrapper<User> lambdaUpdate() {
        return null;
    }

    @Override
    public List<User> listUser() {

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "liuhuan");
        wrapper.eq("id", "1");

        return userMapper.selectList(wrapper);
    }
}
