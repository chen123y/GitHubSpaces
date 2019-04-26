package com.buba.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.buba.bean.Emp;
import com.buba.bean.Location;

/**   
*    
* 项目名称：Test_1217_2   
* 类名称：EmpMapper   
* 类描述：   
* 创建人：chen   
* 创建时间：2018年12月18日 下午2:06:47   
* @version        
*/
public interface EmpMapper {
	//分页查询列表
	List<Emp> query(@Param("dId")String dId,@Param("eLevel") String eLevel, @Param("eSex")String eSex, @Param("queryEmpName")String queryEmpName,@Param("wages") String wages);
	//查询所有地区
	List<Location> queryLocation();
	//查询所有等级
	List<Emp> queryLevel();
}
