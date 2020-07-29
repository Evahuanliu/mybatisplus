package com.demo.mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.demo.mybatisplus.pojo.User;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface UserService {
    // 插入一条记录（选择字段，策略插入）
    boolean save(User user);

    // 插入（批量）
    boolean saveBatch(Collection<User> entityList);

    // 插入（批量）
    boolean saveBatch(Collection<User> entityList, int batchSize);

    // TableId 注解存在更新记录，否插入一条记录
    boolean saveOrUpdate(User user);

    // 根据updateWrapper尝试更新，否继续执行saveOrUpdate(T)方法
    boolean saveOrUpdateByCondition(User user, Map<String, Object> paramMap);

    // 批量修改插入
    boolean saveOrUpdateBatch(Collection<User> entityList);

    // 批量修改插入
    boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize);

    // 根据 entity 条件，删除记录
    boolean remove(Map<String, Object> paramMap);

    // 根据 ID 删除
    boolean removeById(Long id);

    // 根据 columnMap 条件，删除记录
    boolean removeByMap(Map<String, Object> paramMap);

    // 删除（根据ID 批量删除）
    boolean removeByIds(Collection<Long> idList);

    // 根据 UpdateWrapper 条件，更新记录 需要设置sqlset
    boolean update(Map<String, Object> paramMap);

    // 根据 whereEntity 条件，更新记录
    boolean update(User user, Map<String, Object> paramMap);

    // 根据 ID 选择修改
    boolean updateById(User user);

    // 根据ID 批量更新
    boolean updateBatchById(Collection<User> entityList);

    // 根据ID 批量更新
    boolean updateBatchById(Collection<User> entityList, int batchSize);

    // 根据 ID 查询
    User getById(Long id);

    // 根据 Wrapper，查询一条记录。结果集，如果是多个会抛出异常，随机取一条加上限制条件 wrapper.last("LIMIT 1")
    User getOne(Map<String, Object> paramMap);

    // 根据 Wrapper，查询一条记录
    User getOne(Map<String, Object> paramMap, boolean throwEx);

    // 根据 Wrapper，查询一条记录
    Map<String, Object> getMap(Map<String, Object> paramMap);

    // 根据 Wrapper，查询一条记录
    <V> V getObj(Map<String, Object> paramMap, Function<User, V> mapper);

    // 查询所有
    List<User> list();

    // 查询列表
    List<User> list(Map<String, Object> paramMap);

    // 查询（根据ID 批量查询）
    Collection<User> listByIds(Collection<Long> idList);

    // 查询（根据 columnMap 条件）
    Collection<User> listByMap(Map<String, Object> columnMap);

    // 查询所有列表
    List<Map<String, Object>> listMaps();

    // 查询列表
    List<Map<String, Object>> listMaps(Map<String, Object> paramMap);

    // 查询全部记录
    List<Object> listObjs();

    // 查询全部记录
    <V> List<V> listObjs(Function<? super Object, V> mapper);

    // 根据 Wrapper 条件，查询全部记录
    List<Object> listObjs(Map<String, Object> paramMap);

    // 根据 Wrapper 条件，查询全部记录
    <V> List<V> listObjs(Map<String, Object> paramMap, Function<? super Object, V> mapper);

    // 无条件分页查询
    IPage<User> page(IPage<User> page);

    // 条件分页查询
    IPage<User> page(IPage<User> page, Map<String, Object> paramMap);

    // 无条件分页查询
    IPage<Map<String, Object>> pageMaps(IPage<User> page);

    // 条件分页查询
    IPage<Map<String, Object>> pageMaps(IPage<User> page, Map<String, Object> paramMap);

    // 查询总记录数
    int count();

    // 根据 Wrapper 条件，查询总记录数
    int count(Map<String, Object> paramMap);

    // 链式查询 普通
    QueryChainWrapper<User> query();

    // 链式查询 lambda 式。注意：不支持 Kotlin
    LambdaQueryChainWrapper<User> lambdaQuery();

    // 链式更改 普通
    UpdateChainWrapper<User> update();

    // 链式更改 lambda 式。注意：不支持 Kotlin
    LambdaUpdateChainWrapper<User> lambdaUpdate();

    List<User> listUser();
}
