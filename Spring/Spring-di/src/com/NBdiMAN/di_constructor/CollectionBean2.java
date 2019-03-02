package com.NBdiMAN.di_constructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean2 {
	private Set<String> set;
	private List<String> list;
	private String[] array;
	private Map<String,String> map;
	private Properties prop;
	
	

	public CollectionBean2(Set<String> set, List<String> list, String[] array, Map<String, String> map,
			Properties prop) {
		this.set = set;
		this.list = list;
		this.array = array;
		this.map = map;
		this.prop = prop;
	}



	@Override
	public String toString() {
		return "CollectionBean1 [set=" + set + ", list=" + list + ", array=" + Arrays.toString(array) + ", map=" + map
				+ ", prop=" + prop + "]";
	}
	
	
}
