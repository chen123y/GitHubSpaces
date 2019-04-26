package com.buba.service;

import java.util.List;

import com.buba.bean.Emp;
import com.buba.bean.Location;
import com.github.pagehelper.PageInfo;

/**   
*    
* 项目名称：Test_1217_2   
* 类名称：EmpService   
* 类描述：   
* 创建人：chen   
* 创建时间：2018年12月18日 下午2:06:51   
* @version        
*/
public interface EmpService {
	//分页展示信息
	PageInfo<Emp> query(Integer pn, Integer row, String dId, String eLevel, String eSex, String queryEmpName, String wages);
	//查询所有地区
	List<Location> queryLocation();
	//查询所有等级
	List<Emp> queryLevel();

}
