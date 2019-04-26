package com.buba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buba.bean.Emp;
import com.buba.bean.Location;
import com.buba.dao.EmpMapper;
import com.buba.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**   
*    
* 项目名称：Test_1217_2   
* 类名称：EmpServiceImpl   
* 类描述：   
* 创建人：chen   
* 创建时间：2018年12月18日 下午2:05:59   
* @version        
*/
@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpMapper empMapper;

	//分页
	public PageInfo<Emp> query(Integer pn, Integer row, String dId, String eLevel, String eSex, String queryEmpName,
			String wages) {
		PageHelper.startPage(pn, row);
		List<Emp> list=empMapper.query(dId,eLevel,eSex,queryEmpName,wages);
		PageInfo<Emp> p=new PageInfo<Emp>(list);
		return p;
	}

	public List<Location> queryLocation() {
		// TODO Auto-generated method stub
		return empMapper.queryLocation();
	}

	public List<Emp> queryLevel() {
		// TODO Auto-generated method stub
		return empMapper.queryLevel();
	}

	
}
