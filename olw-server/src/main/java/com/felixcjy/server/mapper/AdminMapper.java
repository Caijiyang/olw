package com.felixcjy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.felixcjy.server.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author FelixCJY
 */
public interface AdminMapper extends BaseMapper<Admin> {


	/**
	 * 获取所有操作员
	 * @param keywords
	 * @return
	 */
	List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
