package edu.shop.java.dao.impl;

import java.util.List;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.model.ProductCategory;

public class ProductCategoryFileDao extends FileAbstractDao<ProductCategory> implements ProductCategoryDao{

	public ProductCategoryFileDao() {
	}
	
	@Override
	public List<ProductCategory> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCategory getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDatasourceName() {
		// TODO Auto-generated method stub
		return null;
	}

}
