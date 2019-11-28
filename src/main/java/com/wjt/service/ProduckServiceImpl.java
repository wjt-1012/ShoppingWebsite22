package com.wjt.service;

import com.wjt.dao.ProduckDao;
import com.wjt.po.Produck;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 30239
 * @create 2019-11-21-15:09
 */
@Service
public class ProduckServiceImpl implements ProduckService {

    @Resource
    private ProduckDao ss;

    public List<Produck> findall() {
        return ss.findall();
    }

    public Produck findbyid(int id) {
        return ss.findbyid(id);
    }

    public int insert(Produck produck) {
        return ss.insert(produck);
    }

    public int delete(int id) {
        return ss.delete(id);
    }

    public int update(Produck produck) {
        return ss.update(produck);
    }
}
