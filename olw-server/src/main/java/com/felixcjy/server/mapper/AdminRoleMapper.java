package com.felixcjy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.felixcjy.server.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FelixCJY
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

	/**
	 * 更新操作员角色
	 * @param adminId
	 * @param rids
	 * @return
	 */
	Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
