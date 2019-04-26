package com.buba.bean;

/**   
*    
* 项目名称：Test_1217_2   
* 类名称：Emp   
* 类描述：   
* 创建人：chen   
* 创建时间：2018年12月18日 下午2:00:26   
* @version        
*/
public class Emp {

	private Integer eId;//员工id
	private String eName;//员工姓名
	private Integer eSex;//员工性别
	private Integer eWages;//员工薪资
	private String eLevel;//等级
	private Integer dId;//地区id
	private String dName;//地区名称
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteSex() {
		return eSex;
	}
	public void seteSex(Integer eSex) {
		this.eSex = eSex;
	}
	public Integer geteWages() {
		return eWages;
	}
	public void seteWages(Integer eWages) {
		this.eWages = eWages;
	}
	public String geteLevel() {
		return eLevel;
	}
	public void seteLevel(String eLevel) {
		this.eLevel = eLevel;
	}
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eSex=" + eSex + ", eWages=" + eWages + ", eLevel=" + eLevel
				+ ", dId=" + dId + ", dName=" + dName + "]";
	}
	
}
