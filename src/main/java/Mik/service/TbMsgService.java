package Mik.service;

import Mik.pojo.TbMsg;

import java.util.List;

/**
 * @Author: 米阔
 * @Date: 2019/7/19
 */
public interface TbMsgService {//  alt+/ +enter


    public List<TbMsg> findAll();

    public boolean save(TbMsg msg);


}
