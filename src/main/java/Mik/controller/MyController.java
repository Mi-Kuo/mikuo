package Mik.controller;

import Mik.pojo.TbMsg;
import Mik.service.TbMsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 米阔
 * @Date: 2019/7/19
 */
//@Controller
@RestController
public class MyController {

    @Resource
    private TbMsgService tbMsgService;


    @RequestMapping("/find")
    public List<TbMsg>  find(){
        return tbMsgService.findAll();
    }

    @RequestMapping("/save")
    public boolean  save(TbMsg tbMsg){
            return tbMsgService.save(tbMsg);
    }


}
