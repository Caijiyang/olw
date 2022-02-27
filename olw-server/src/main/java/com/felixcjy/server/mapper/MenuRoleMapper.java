package com.felixcjy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.felixcjy.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FelixCJY
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

	/**
	 * 更新角色菜单
	 * @param rid
	 * @param mids
	 */
	Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
