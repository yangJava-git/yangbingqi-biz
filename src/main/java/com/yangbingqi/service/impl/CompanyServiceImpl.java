package com.yangbingqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangbingqi.dao.CompanyMapper;
import com.yangbingqi.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyMapper dao;

	@Override
	public List listCompany(Integer type, Integer capital) {
		System.out.println("如何能如何呢");
		return dao.listCompany(type,capital);
	}

	

}
