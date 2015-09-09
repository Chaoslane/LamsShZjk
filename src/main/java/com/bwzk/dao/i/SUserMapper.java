package com.bwzk.dao.i;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bwzk.dao.BaseDao;
import com.bwzk.pojo.EFile;
import com.bwzk.pojo.SUser;
import com.bwzk.pojo.SUserExample;
import com.bwzk.pojo.SUserWithBLOBs;

public interface SUserMapper  extends BaseDao{
    int countByExample(SUserExample example);

    int deleteByExample(SUserExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(SUserWithBLOBs record);

    int insertSelective(SUserWithBLOBs record);

    List<SUserWithBLOBs> selectByExampleWithBLOBs(SUserExample example);

    List<SUser> selectByExample(SUserExample example);

    SUserWithBLOBs selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") SUserWithBLOBs record, @Param("example") SUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SUserWithBLOBs record, @Param("example") SUserExample example);

    int updateByExample(@Param("record") SUser record, @Param("example") SUserExample example);

    int updateByPrimaryKeySelective(SUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SUserWithBLOBs record);

    int updateByPrimaryKey(SUser record);
    
    int updateByKey(SUser record);
    
	@Select("SELECT DID,PID,USERCODE,USERNAME FROM S_USER")
    List<SUser> getAllUserList();
	
	@Select("SELECT * FROM S_USER WHERE ESBID = '${ESBID}'")
	SUser getUserByEsbid(@Param("ESBID") String ESBID);
	
	@Select("SELECT * FROM S_USER WHERE USERCODE = '${usercode}'")
	SUser getUserByUsercode(@Param("usercode") String usercode);
	
	@Delete("DELETE S_USER WHERE USERCODE = '${usercode}'")
	void delUserByUsercode(@Param("usercode") String usercode);
	@Delete("DELETE S_USER WHERE ESBID = '${ESBID}'")
	void delUserByEsbid(@Param("ESBID") String ESBID);
	
	@Select("SELECT * FROM S_USER WHERE ESBCODE = '${esbcode}'")
	SUserWithBLOBs getUserBlobByEsbCode(@Param("esbcode") String esbcode);
	
	@Select("SELECT * FROM S_USER WHERE USERCODE = '${usercode}'")
	SUserWithBLOBs getUserBlobUsercode(@Param("usercode") String usercode);
	
	@Select("SELECT QZH FROM S_GROUP WHERE DID IN (SELECT PID FROM S_USER WHERE USERCODE LIKE '${usercode}')")
	String getQzhByUserCode(@Param("usercode") String usercode);
	
	
	@Select("select PID, PATHNAME,TITLE,PZM,EFILENAME,EXT,MD5,FILESIZE,CREATETIME,STATUS,ATTR,ATTREX,CREATOR,DID from ${eTableName} where pid = (select min(did) from ${dTableName} where ${whereSql})")
	List<EFile> getDupliEfile(@Param("eTableName") String eTableName , @Param("dTableName") String dTableName ,@Param("whereSql") String whereSql);
	
	@Select("SELECT DID FROM S_USER WHERE DID NOT IN (SELECT YHID FROM S_USERROLE) AND USERCODE <> 'ROOT'")
	List<Integer> getNoRoleUserDids();
	List<Map<String, Object>> listPageMapQuery(Map para);
	
	@Select("SELECT COUNT(DID) FROM ${dTableName} WHERE ${whereSql}")
	Integer countNumByWhere(@Param("dTableName") String dTableName ,@Param("whereSql") String whereSql);

}