package com.hanbit.pahnki.kim.core.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbcpDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(DbcpDAO.class);

	@Autowired
	private DataSource dataSource;

	public void test() throws Exception {
		Connection connection = dataSource.getConnection();

		ResultSet resultSet = connection.prepareStatement("SELECT SYSDATE FROM DUAL").executeQuery();

		if (resultSet.next()) {
			String result = resultSet.getString(1);

			LOGGER.debug(result);
		}

		resultSet.close();
		connection.close();
	}

}
