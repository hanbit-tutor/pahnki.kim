package com.hanbit.pahnki.kim.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.pahnki.kim.core.dao.DbcpDAO;
import com.hanbit.pahnki.kim.core.dao.MybatisDAO;
import com.hanbit.pahnki.kim.core.dao.SimpleDAO;

@Service
public class SampleService {

	@Autowired
	private SimpleDAO simpleDAO;

	@Autowired
	private DbcpDAO dbcpDAO;

	@Autowired
	private MybatisDAO mybatisDAO;

	public void showDate() throws Exception {
		simpleDAO.test();
		dbcpDAO.test();
		mybatisDAO.test();
	}

}
