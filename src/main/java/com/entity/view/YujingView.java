package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YujingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 预警
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yujing")
public class YujingView extends YujingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 预警类型的值
	*/
	@ColumnInfo(comment="预警类型的字典表值",type="varchar(200)")
	private String yujingValue;




	public YujingView() {

	}

	public YujingView(YujingEntity yujingEntity) {
		try {
			BeanUtils.copyProperties(this, yujingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 预警类型的值
	*/
	public String getYujingValue() {
		return yujingValue;
	}
	/**
	* 设置： 预警类型的值
	*/
	public void setYujingValue(String yujingValue) {
		this.yujingValue = yujingValue;
	}




	@Override
	public String toString() {
		return "YujingView{" +
			", yujingValue=" + yujingValue +
			"} " + super.toString();
	}
}
