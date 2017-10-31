package com.train.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;         //用户名
	
	
	@Override
	public String toString(){
		String s="[id:"+id+",name:"+name+"]";
		System.out.println(s);
		return s;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
