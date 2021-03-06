package com.han.o2o.dto;

import java.util.List;

import com.han.o2o.entity.ProductCategory;
import com.han.o2o.enums.ProductCategoryStateEnum;

public class ProductCategoryExecution {
	// 结果状态
	private int state;
	// 状态标示
	private String stateInfo;
	private List<ProductCategory> productCategoryList;
	public ProductCategoryExecution() {
		
	}
	//操作失败时构造器
	public ProductCategoryExecution(ProductCategoryStateEnum pcse) {
		super();
		this.state = pcse.getState();
		this.stateInfo = pcse.getStateInfo();
	}
	//操作成功时返回的构造器
	public ProductCategoryExecution(ProductCategoryStateEnum pcse, List<ProductCategory> productCategoryList) {
		super();
		this.state = pcse.getState();
		this.stateInfo = pcse.getStateInfo();
		this.productCategoryList = productCategoryList;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public List<ProductCategory> getProductCategoryList() {
		return productCategoryList;
	}
	public void setProductCategoryList(List<ProductCategory> productCategoryList) {
		this.productCategoryList = productCategoryList;
	}
	

	
	

}
