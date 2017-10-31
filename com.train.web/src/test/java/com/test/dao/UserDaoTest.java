package com.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.train.entity.UserEntity;
import com.train.service.UserService;

import redis.clients.jedis.Jedis;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-beans.xml")
public class UserDaoTest extends AbstractJUnit4SpringContextTests  {
	@Autowired
	public UserService userService;
	@Autowired
	public JedisConnectionFactory connect;
	
/*	@Test
	public void update(){
		UserEntity user=new UserEntity();
		user.setId(12301);
		user.setAddress("");
		user.setName("胡小东");
		int num=userMapper.update(user);
		System.out.println(num+"============================");
	}*/
	
/*	@Test
	public void test02(){
		UserEntity user=new UserEntity();
		user.setId(12301);
		user.setAccount("12301");
		user.setAddress("合肥市蜀山区");
		user.setCellPhoneNum("15823467854");
		user.setName("胡小东");
		user.setPassword("123456");
		user.setPhoneNum("0551-7884235");
		int num=userMapper.save(user);
		System.out.println(num+"------------------------------");
	}*/
	
	@Test
	public void saveUser(){
		UserEntity user=new UserEntity();
		user.setId(234232);
		user.setName("zhadaoli");
		userService.save(user);
	}
	
	@Test
	public void getUser(){
		UserEntity user=userService.get(234232);
		System.out.println("-------------------------");
		System.out.println(user);
		System.out.println("-------------------------");
	}
	
	@Test  
	public void test1() {  
	    Jedis jedis = new Jedis("127.0.0.1",6379);       // 连接到Redis服务器  
	    jedis.set("greeting", "Hello, world!");     // 将字符串缓存到Redis服务器  
	    System.out.println(jedis.get("greeting") + "========");  // 从Redis缓存中获取数据  
//	    jedis.set("name", "欢迎来到Redis缓存！");  
//	    String name= jedis.get("name");  
//	    System.out.print(name+"===========");  
		
//		connect.getConnection();
		System.out.println("11111111111111111111111111111111111111111111111");
	} 
}
