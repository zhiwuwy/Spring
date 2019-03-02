package com.NBdiMAN.di_setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean1 {
	private Set<String> set;
	private List<String> list;
	private String[] array;
	private Map<String,String> map;
	private Properties prop;
	
	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	public void setArray(String[] array) {
		this.array = array;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "CollectionBean1 [set=" + set + ", list=" + list + ", array=" + Arrays.toString(array) + ", map=" + map
				+ ", prop=" + prop + "]";
	}
	
	
}
