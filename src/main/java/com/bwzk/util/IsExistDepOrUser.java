package com.bwzk.util;

import java.util.List;

import com.bwzk.pojo.SGroup;
import com.bwzk.pojo.SQzh;
import com.bwzk.pojo.SUser;
import com.bwzk.service.BaseService;

public class IsExistDepOrUser extends BaseService {

	/**
	 * 部门不存在时异常
	 * @param group
	 * @throws ExceptionThrows
	 */
	public void isDepNotExist(SGroup group) throws ExceptionThrows

	{
		if (group == null) {
			throw new ExceptionThrows("部门不存在");
		}
	}
	/**
	 * 用户不存时异常
	 * @param user
	 * @throws ExceptionThrows
	 */
	public void isUserNotExist(SUser user) throws ExceptionThrows

	{
		if (user == null) {
			throw new ExceptionThrows("用户不存在！");
		}
	}
	/**
	 * 用户存在时异常
	 * @param user
	 * @throws ExceptionThrows
	 */
	public void isUserExist(SUser user) throws ExceptionThrows

	{
		if (user != null) {
			throw new ExceptionThrows("用户已存在！");
		}
	}
	/**
	 * 部门存在时异常
	 * @param group
	 * @throws ExceptionThrows
	 */
	public void isDeptExist(SGroup group) throws ExceptionThrows

	{
		if (group != null) {
			throw new ExceptionThrows("部门已存在！");
		}
	}
	/**
	 * 全宗存在时异常
	 * @param sqh
	 * @throws ExceptionThrows
	 */
	public void isQzhExist(SQzh sqh) throws ExceptionThrows

	{
		if (sqh != null) {
			throw new ExceptionThrows("全宗已存在！");
		}
	}
	/**
	 * 全宗不存在时异常
	 * @param sqh
	 * @throws ExceptionThrows
	 */
	public void isQzhNotExist(SQzh sqh) throws ExceptionThrows

	{
		if (sqh == null) {
			throw new ExceptionThrows("全宗不存在！");
		}
	}
}
