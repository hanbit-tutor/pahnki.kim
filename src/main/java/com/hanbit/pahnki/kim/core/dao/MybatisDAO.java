package com.hanbit.pahnki.kim.core.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.pahnki.kim.core.vo.SampleVO;

@Repository
public class MybatisDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisDAO.class);

	@Autowired
	private SqlSession sqlSession;

	public void test() {
		SampleVO sampleVO = sqlSession.selectOne("dual.selectSysdate");

		LOGGER.debug(sampleVO.getSysDate());
	}

}
