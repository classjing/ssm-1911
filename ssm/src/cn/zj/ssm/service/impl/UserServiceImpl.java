package cn.zj.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zj.ssm.mapper.UserMapper;
import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	/*
	 * 问题：UserMapper需要注入，如何创建？
	 * 
	 * 一，使用Spring集成之前
	 * 1，读取mybatis-config.xml 创建 SqlSessionFacotry工厂对象
	 * 2，创建SqlSession对象
	 * 3，创建UserMapper接口的代理对象
	 * 
	 * -------------------------------
	 * 
	 * 二，使用Spring集成之后
	 * 上面的三个操作全部交给Spring完成
	 * 
	 * 1，创建 SqlSessionFacotry工厂对象
	 * 	MyBatis和Spring集成已经将创建SqlSessionFactory的代码编写好了，在桥梁包中
	 * 	 mybatis-spring-1.3.1.jar
	 *  
	 *   org.mybatis.spring.SqlSessionFactoryBean
	 * 2，创建SqlSession对象
	 * 	SqlSession对象不同创建，在第三步创建Mapper映射文件接口代理对象时候底层会自动创建SqlSession对象
	 * 
	 * 3，创建UserMapper接口的代理对象
	 * 	方式一：创建单个映射接口的代理对象
	 * 		桥梁包中 ： org.mybatis.spring.mapper.MapperFactoryBean<T>
	 * 
	 *  方式二 ：使用包扫描创建映射接口的代理对象（推荐使用）
	 * 
	 * 
	 */
	
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectList() {
		return userMapper.selectList();
	}

}
