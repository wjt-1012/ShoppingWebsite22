package com.wjt.po;

import com.wjt.dao.ProduckDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 30239
 * @create 2019-11-21-14:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produck {

    private int proid;
    private String proname;
    private int prosum;
    private int proprice;
    private Status status;

    @Autowired
    private ProduckDao produckDao;

    public List<Produck> findall() {
        return produckDao.findall();
    }
}
