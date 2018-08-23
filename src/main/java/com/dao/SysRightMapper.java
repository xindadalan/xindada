package com.dao;

import com.bean.SysRight;
import java.util.List;

public interface SysRightMapper {
    int deleteByPrimaryKey(String rightcode);

    int insert(SysRight record);

    SysRight selectByPrimaryKey(String rightcode);

    List<SysRight> selectAll();

    int updateByPrimaryKey(SysRight record);
}