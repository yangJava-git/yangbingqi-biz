package com.yangbingqi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yangbingqi.bean.Company;

public interface CompanyMapper {

	List listCompany(@Param("type")Integer type, @Param("capital")Integer capital);

	void addCom(Company co);

}
