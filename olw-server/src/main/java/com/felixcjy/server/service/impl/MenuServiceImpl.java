package com.felixcjy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.felixcjy.server.mapper.MenuMapper;
import com.felixcjy.server.pojo.Menu;
import com.felixcjy.server.service.IMenuService;
import com.felixcjy.server.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FelixCJY
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 根据用户id查询菜单列表
	 * @return
	 */
	@Override
	public List<Menu> getMenusByAdminId() {
		Integer adminId = AdminUtils.getCurrentAdmin().getId();
		List<Menu> menus = menuMapper.getMenusByAdminId(adminId);
		return menus;
	}

	/**
	 * 根据角色获取菜单列表
	 * @return
	 */
	@Override
	public List<Menu> getMenusWithRole() {
		return menuMapper.getMenusWithRole();
	}

	/**
	 * 查询所有菜单
	 * @return
	 */
	@Override
	public List<Menu> getAllMenus() {
		return menuMapper.getAllMenus();
	}
}
