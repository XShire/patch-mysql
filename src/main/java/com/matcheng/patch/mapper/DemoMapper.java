package com.matcheng.patch.mapper;

import com.matcheng.patch.model.Demo;

public interface DemoMapper {
    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}