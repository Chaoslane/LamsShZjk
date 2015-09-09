package com.bwzk.dao.i;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwzk.dao.BaseDao;
import com.bwzk.pojo.SRole;
import com.bwzk.pojo.SRoleExample;

public interface SRoleMapper  extends BaseDao{
    int countByExample(SRoleExample example);
    int deleteByExample(SRoleExample example);
    int deleteByPrimaryKey(Integer did);
    int insert(SRole record);
    int insertSelective(SRole record);
    List<SRole> selectByExample(SRoleExample example);
    SRole selectByPrimaryKey(Integer did);
    int updateByExampleSelective(@Param("record") SRole record, @Param("example") SRoleExample example);
    int updateByExample(@Param("record") SRole record, @Param("example") SRoleExample example);
    int updateByPrimaryKeySelective(SRole record);
    int updateByPrimaryKey(SRole record);
}