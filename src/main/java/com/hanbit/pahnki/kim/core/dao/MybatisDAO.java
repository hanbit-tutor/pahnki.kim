package com.hanbit.pahnki.kim.core.dao;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisDAO.class);

	@Autowired
	private SqlSession sqlSession;

	public void test() {
		String result = sqlSession.selectOne("dual.dual");

		LOGGER.debug(result);
	}

}
