package com.felixcjy.server.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mybaits分页配置
 *
 * @author FelixCJY
 * @since 1.0.0
 */
@Configuration
public class MyBatisPlusConfig {

	@Bean
	public PaginationInterceptor paginationInterceptor(){
		return new PaginationInterceptor();
	}

}