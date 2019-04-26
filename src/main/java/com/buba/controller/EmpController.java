package com.buba.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.buba.bean.Emp;
import com.buba.bean.Location;
import com.buba.service.EmpService;
import com.github.pagehelper.PageInfo;

/**   
*    
* 项目名称：Test_1217_2   
* 类名称：EmpController   
* 类描述：   
* 创建人：chen   
* 创建时间：2018年12月18日 下午2:04:24   
* @version        
*/
@RequestMapping("emp")
@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	//分页展示信息
	@ResponseBody
	@RequestMapping("query/{pn}/{row}")
	public PageInfo<Emp> query(HttpSession session,HttpServletRequest request,@PathVariable()Integer pn,Model model,@PathVariable()Integer row,String dId,String eLevel,String eSex,String queryEmpName,String wages) {
		System.out.println("dId="+dId+";eLevel="+eLevel+";eSex="+eSex+";queryEmpName="+queryEmpName+";wages="+wages);
		/*if(dId!=null&&!"".equals(dId)) {
			request.setAttribute("dId", dId);
		}*/
		PageInfo<Emp> pageInfo=empService.query(pn,row,dId,eLevel,eSex,queryEmpName,wages);
		session.setAttribute("plist",pageInfo);
		return pageInfo;
	}
	
	//查询所有地区
	@ResponseBody
	@RequestMapping("queryLocation")
	public List<Location> queryLocation(HttpSession session){
		List<Location> dNameList=empService.queryLocation();
		session.setAttribute("dNameList",dNameList);
		return dNameList;
	}
	
	//查询所有等级
	@ResponseBody
	@RequestMapping("queryLevel")
	public List<Emp> queryLevel(HttpSession session){
		List<Emp> levelList=empService.queryLevel();
		session.setAttribute("levelList", levelList);
		return levelList;
	}
}
