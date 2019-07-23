package Mik.mapper;

import Mik.pojo.TbMsg;


import java.util.List;

/**
 * @Author: 米阔
 * @Date: 2019/7/19
 */

public interface TbMsgMapper {

    List<TbMsg>  findAl();


   int  save(TbMsg msg);




}
