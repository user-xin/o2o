package com.wu.han.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.han.o2o.BaseTest;
import com.han.o2o.entity.Area;
import com.han.o2o.service.AreaService;

public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;
	
	@Test
	public void  getAreaService() {
		List<Area> list = areaService.getAreaList();
		assertEquals("西苑", list.get(0).getAreaName());
	}
	  
}
