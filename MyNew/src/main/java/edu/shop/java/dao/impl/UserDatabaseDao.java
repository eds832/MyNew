package edu.shop.java.dao.impl;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.UserDao;
import edu.shop.java.model.User;

@Repository
public class UserDatabaseDao extends HibernateAbstractDao<User> implements UserDao {

	public UserDatabaseDao() {
	}

}
