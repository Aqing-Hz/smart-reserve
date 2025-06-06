package com.aqinghz.smartreserve.mapper;

import com.aqinghz.smartreserve.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
    //继承basemapper，有了crud的方法
}
