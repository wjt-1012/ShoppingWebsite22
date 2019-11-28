package com.wjt.dao;

import com.wjt.po.Status;

import java.util.List;

public interface StatusDao {

    /**
     * 查询
     *
     * @return
     */
    List<Status> findall();

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    Status findbyid(int id);

    /**
     * 新增
     *
     * @param status
     * @return
     */
    int insert(Status status);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 修改
     *
     * @param status
     * @return
     */
    int update(Status status);

}