package com.bwzk.dao.i;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bwzk.dao.BaseDao;
import com.bwzk.pojo.SGroup;
import com.bwzk.pojo.SGroupExample;
import com.bwzk.pojo.SQzh;

public interface SGroupMapper   extends BaseDao{
    int countByExample(SGroupExample example);

    int deleteByExample(SGroupExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(SGroup record);

    int insertSelective(SGroup record);

    List<SGroup> selectByExample(SGroupExample example);

    SGroup selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") SGroup record, @Param("example") SGroupExample example);

    int updateByExample(@Param("record") SGroup record, @Param("example") SGroupExample example);

    int updateByPrimaryKeySelective(SGroup record);

    int updateByPrimaryKey(SGroup record);
    
    int updateByKey(SGroup record);
    
    /**
     * <p>Title: 根据xml里面的mdCode来查询s_group中的depid</p>
     * <p>Description: </p>
     * @param depid
     * @return
     * 
     * @date 2014年2月21日
    */
    @Select("SELECT * FROM S_GROUP WHERE DEPID = '${depid}'")
    SGroup getGroupByDepID(@Param("depid") String depid);
    /**
     * <p>Title: 根据xml里面的orgCode来查询s_group中的depCode</p>
     * <p>Description: </p>
     * @param depCode
     * @return
     * 
     * @date 2014年2月21日
     */
    @Select("SELECT * FROM S_GROUP WHERE DEPCODE = '${depCode}'")
    SGroup getGroupByDepCode(@Param("depCode") String depCode);
   
    @Select("SELECT * FROM S_GROUP WHERE bz = '${bz}'")
    SGroup getGroupByBz(@Param("bz") String bz);
    
    @Select("SELECT * FROM S_GROUP WHERE GFZJ = '${gfzj}'")
    SGroup getGroupByGfzj(@Param("gfzj") String gfzj);
    
    @Select("SELECT * FROM S_QZH WHERE primarykey = '${primarykey}'")
    SQzh getQzhByQzzj(@Param("primarykey") String primarykey);
    
    @Select("SELECT * FROM S_GROUP WHERE BH = '${bh}'")
    SGroup getGroupByBh(@Param("bh") String bh);

    
    
}