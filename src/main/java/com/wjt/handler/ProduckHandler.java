package com.wjt.handler;

import com.wjt.po.Produck;
import com.wjt.service.ProduckService;
import com.wjt.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 30239
 * @create 2019-11-21-15:16
 */
@Controller
@RequestMapping("/pro")
public class ProduckHandler {
    @Autowired
    private ProduckService ps;
    @Autowired
    private StatusService ss;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        model.addAttribute("proList", ps.findall());
        return "findAll";
    }

    @RequestMapping("findById")
    public String findById(int proId, Model model) {
        model.addAttribute("pro", ps.findbyid(proId));
        model.addAttribute("staList", ss.findall());
        return "update";
    }

    @RequestMapping("update")
    public String update(Produck produck) {
        ps.update(produck);
        return "redirect:/pro/findAll";
    }

    @RequestMapping("toInsert")
    public String toInsert(Model model) {
        model.addAttribute("staList",ss.findall());
        return "insert";
    }

    @RequestMapping("insert")
    public String insert(Produck produck) {
        ps.insert(produck);
        return "redirect:/pro/findAll";
    }

    @RequestMapping("delete")
    public String delete(int proId) {
        ps.delete(proId);
        return "redirect:/pro/findAll";
    }


}
