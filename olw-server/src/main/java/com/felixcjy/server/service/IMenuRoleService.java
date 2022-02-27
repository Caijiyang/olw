package com.felixcjy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.felixcjy.server.pojo.MenuRole;
import com.felixcjy.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author FelixCJY
 */
public interface IMenuRoleService extends IService<MenuRole> {

	/**
	 * 更新角色菜单
	 * @param rid
	 * @param mids
	 * @return
	 */
	RespBean updateMenuRole(Integer rid, Integer[] mids);
}
