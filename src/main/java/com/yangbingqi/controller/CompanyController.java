package com.yangbingqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangbingqi.service.CompanyService;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	@RequestMapping("list")
	public String list(Model m,Integer type,Integer capital,@RequestParam(defaultValue = "1")Integer pageNum) {
		m.addAttribute("type", type);
		m.addAttribute("capital", capital);
		PageHelper.startPage(pageNum, 3);
		List list = service.listCompany(type,capital);
		System.out.println(list);
		m.addAttribute("list", list);
		
		PageInfo info = new PageInfo(list); m.addAttribute("info", info);
	
		return "list";
	}

}
