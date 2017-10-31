package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.train.entity.UserEntity;


@Service("userService")
public class UserService {

	
	@Cacheable(value="common")
    public UserEntity get(Integer id) {
		System.out.println("测试缓存=================");
		UserEntity user=new UserEntity();
		return user;
       /* return userMapper.get(id);*/
    }

	/*public UserEntity login(String account,String password) {
		UserEntity user=new UserEntity();
		user.setAccount(account);
		user.setPassword(password);
		return userMapper.login(user);
	}

	public List<UserEntity> findAll() {
		return userMapper.findAll();
	}

	public void update(UserEntity user) {
		userMapper.update(user);
	}*/

	@CachePut(value="common",key="#user.getId()")
	public UserEntity save(UserEntity user) {
		/*userMapper.save(user);*/
		
		return user;
	}

   
	
}
