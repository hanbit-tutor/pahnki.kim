package com.hanbit.pahnki.kim.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleDAO.class);

	public void test() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"hanbit", "hanbit");

		ResultSet resultSet = connection.prepareStatement("SELECT SYSDATE FROM DUAL").executeQuery();

		if (resultSet.next()) {
			String result = resultSet.getString(1);

			LOGGER.debug(result);
		}

		resultSet.close();
		connection.close();
	}

}
