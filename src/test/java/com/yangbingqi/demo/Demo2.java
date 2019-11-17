package com.yangbingqi.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.yangbingqi.bean.Company;
import com.yangbingqi.dao.CompanyMapper;
import com.yangbingqi.utils.StringUtils;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class Demo2 {
	
	@Autowired
	public CompanyMapper mapper;
	
	@Test
	public void demo() {
		
	for (int j = 0; j < 10; j++) {					
	String before = "北京";
	String last = "有限公司";		
	String city = "北京市";
	
	//(1)公司名称：以“北京”开头，以“有限公司”或“股份有限公司”或“集团有限公司”结尾，中间使用StringUtil.randomChineseString()方法创建2-4个随机汉字（4分）
	String name = StringUtils.getRandomCn(3);
	System.out.println(name);
	
	//(2)法人代表姓名：调用StringUtil.generateChineseName()创建（4分）
	String corporation = StringUtils.getRandomCn(2);
	System.out.println(corporation);
	
	//(3)注册地址：以“北京市”开头，后面调用StringUtil.randomChineseString()创建20-40个汉字（4分）
	String address = StringUtils.getRandomCn(25);
	System.out.println(address);
	//(4)注册资本：调用RandomUtil随机数工具方法生成，值在10万元-10亿元之间（4分）
	int capital = StringUtils.addNum(1000000000,100000 );
	System.out.println(capital);
	//营业执照号：调用RandomUtil随机数工具方法生成，以1101开头，加上11位随机数，总共15位。（4分）
		String regist_no = "1101";
		for (int i = 0; i < 11; i++) {
			int random = (int) (Math.random()*10.0);
			String valueOf = String.valueOf(random);
			regist_no+=valueOf;
		}
		System.out.println(regist_no);			
	//公司经济类型：调用RandomUtil随机数工具方法，在公司类型表中的所有id中随机抽
		int type = StringUtils.addNum(11,1);
		System.out.println(type);
		Company co = new Company(null, name, corporation, address, capital, regist_no, type, null, null);
		mapper.addCom(co);
		}
	
	
	}
	//(4)用junit测试第二周的工具类,验证手机号,邮箱,分别成功一次失败一次（8分）
	@Test
	public void isPhone() {
		boolean email = StringUtils.isEmail("472772150@qq.com");
		System.out.println(email);
		boolean mobile = StringUtils.isMobile("13475012653");
		System.out.println(mobile);
		
		
		boolean email1 = StringUtils.isEmail("ugewuneie");
		System.out.println(email1);
		boolean mobile2 = StringUtils.isMobile("1515151");
		System.out.println(mobile2);
	}
}
