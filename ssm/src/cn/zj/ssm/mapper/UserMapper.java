package cn.zj.ssm.mapper;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserMapper {
	
	//----DML 增删改-----
	int insert(User user);
	
	int deleteByPrimaryKey(Integer id);
	
	int updateByPrimaryKey(User user);
	
	
	//-----DQL 查询----
	User selectByPrimaryKey(Integer id);
	
	List<User> selectList();
}
