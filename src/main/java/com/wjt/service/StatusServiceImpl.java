package com.wjt.service;

import com.wjt.dao.StatusDao;
import com.wjt.po.Produck;
import com.wjt.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 30239
 * @create 2019-11-21-15:13
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Resource
    private StatusDao sd;


    public List<Status> findall() {
        return sd.findall();
    }

    public Status findbyid(int id) {
        return sd.findbyid(id);
    }

    public int insert(Status status) {
        return sd.insert(status);
    }

    public int delete(int id) {
        return sd.delete(id);
    }

    public int update(Status status) {
        return sd.update(status);
    }
}
