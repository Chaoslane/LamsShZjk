package com.bwzk.dao.i;

import com.bwzk.dao.BaseDao;
import com.bwzk.pojo.SQzh;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SQzhMapper extends BaseDao{
    int deleteByPrimaryKey(Integer did);

    int insert(SQzh record);

    int insertSelective(SQzh record);

    SQzh selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(SQzh record);

    int updateByPrimaryKey(SQzh record);
    
    @Select("SELECT * FROM S_QZH WHERE primaryKey = '${PRIMARYKEY}'")
   	SQzh getSQzhByPrimarkKey(@Param("PRIMARYKEY") String primaryKey);
}