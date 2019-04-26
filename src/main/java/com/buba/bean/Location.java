package com.buba.bean;

/**   
*    
* 项目名称：Test_1217_2   
* 类名称：Location   
* 类描述：   
* 创建人：chen   
* 创建时间：2018年12月18日 下午2:00:32   
* @version        
*/
public class Location {

	private Integer dId;//地区id
	private String dName;//地区名称
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Location [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
}
