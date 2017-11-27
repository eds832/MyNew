package edu.shop.java.dao.impl;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.model.ProductCategory;

@Repository(value="productCategoryDatabaseDao")
public class ProductCategoryDatabaseDao extends HibernateAbstractDao<ProductCategory> implements ProductCategoryDao{

	public ProductCategoryDatabaseDao() {

	}
	
}
