package com.wjt.service;

import com.wjt.po.Produck;

import java.util.List;

public interface ProduckService {

    /**
     * 查询
     *
     * @return
     */
    List<Produck> findall();

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    Produck findbyid(int id);

    /**
     * 新增
     *
     * @param produck
     * @return
     */
    int insert(Produck produck);

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
     * @param produck
     * @return
     */
    int update(Produck produck);

}