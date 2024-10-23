package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhuanjiaChatEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 专家咨询
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhuanjia_chat")
public class ZhuanjiaChatView extends ZhuanjiaChatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 状态的值
	*/
	@ColumnInfo(comment="状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;
	/**
	* 数据类型的值
	*/
	@ColumnInfo(comment="数据类型的字典表值",type="varchar(200)")
	private String zhuanjiaChatValue;

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
	//级联表 专家
		/**
		* 专家姓名
		*/

		@ColumnInfo(comment="专家姓名",type="varchar(200)")
		private String zhuanjiaName;
		/**
		* 专家手机号
		*/

		@ColumnInfo(comment="专家手机号",type="varchar(200)")
		private String zhuanjiaPhone;
		/**
		* 专家身份证号
		*/

		@ColumnInfo(comment="专家身份证号",type="varchar(200)")
		private String zhuanjiaIdNumber;
		/**
		* 专家头像
		*/

		@ColumnInfo(comment="专家头像",type="varchar(200)")
		private String zhuanjiaPhoto;
		/**
		* 研究方向
		*/
		@ColumnInfo(comment="研究方向",type="int(11)")
		private Integer yanjiufangxiangTypes;
			/**
			* 研究方向的值
			*/
			@ColumnInfo(comment="研究方向的字典表值",type="varchar(200)")
			private String yanjiufangxiangValue;
		/**
		* 专家邮箱
		*/

		@ColumnInfo(comment="专家邮箱",type="varchar(200)")
		private String zhuanjiaEmail;
		/**
		* 专家介绍
		*/

		@ColumnInfo(comment="专家介绍",type="text")
		private String zhuanjiaContent;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public ZhuanjiaChatView() {

	}

	public ZhuanjiaChatView(ZhuanjiaChatEntity zhuanjiaChatEntity) {
		try {
			BeanUtils.copyProperties(this, zhuanjiaChatEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 状态的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 状态的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}
	//当前表的
	/**
	* 获取： 数据类型的值
	*/
	public String getZhuanjiaChatValue() {
		return zhuanjiaChatValue;
	}
	/**
	* 设置： 数据类型的值
	*/
	public void setZhuanjiaChatValue(String zhuanjiaChatValue) {
		this.zhuanjiaChatValue = zhuanjiaChatValue;
	}


	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
	//级联表的get和set 专家

		/**
		* 获取： 专家姓名
		*/
		public String getZhuanjiaName() {
			return zhuanjiaName;
		}
		/**
		* 设置： 专家姓名
		*/
		public void setZhuanjiaName(String zhuanjiaName) {
			this.zhuanjiaName = zhuanjiaName;
		}

		/**
		* 获取： 专家手机号
		*/
		public String getZhuanjiaPhone() {
			return zhuanjiaPhone;
		}
		/**
		* 设置： 专家手机号
		*/
		public void setZhuanjiaPhone(String zhuanjiaPhone) {
			this.zhuanjiaPhone = zhuanjiaPhone;
		}

		/**
		* 获取： 专家身份证号
		*/
		public String getZhuanjiaIdNumber() {
			return zhuanjiaIdNumber;
		}
		/**
		* 设置： 专家身份证号
		*/
		public void setZhuanjiaIdNumber(String zhuanjiaIdNumber) {
			this.zhuanjiaIdNumber = zhuanjiaIdNumber;
		}

		/**
		* 获取： 专家头像
		*/
		public String getZhuanjiaPhoto() {
			return zhuanjiaPhoto;
		}
		/**
		* 设置： 专家头像
		*/
		public void setZhuanjiaPhoto(String zhuanjiaPhoto) {
			this.zhuanjiaPhoto = zhuanjiaPhoto;
		}
		/**
		* 获取： 研究方向
		*/
		public Integer getYanjiufangxiangTypes() {
			return yanjiufangxiangTypes;
		}
		/**
		* 设置： 研究方向
		*/
		public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
			this.yanjiufangxiangTypes = yanjiufangxiangTypes;
		}


			/**
			* 获取： 研究方向的值
			*/
			public String getYanjiufangxiangValue() {
				return yanjiufangxiangValue;
			}
			/**
			* 设置： 研究方向的值
			*/
			public void setYanjiufangxiangValue(String yanjiufangxiangValue) {
				this.yanjiufangxiangValue = yanjiufangxiangValue;
			}

		/**
		* 获取： 专家邮箱
		*/
		public String getZhuanjiaEmail() {
			return zhuanjiaEmail;
		}
		/**
		* 设置： 专家邮箱
		*/
		public void setZhuanjiaEmail(String zhuanjiaEmail) {
			this.zhuanjiaEmail = zhuanjiaEmail;
		}

		/**
		* 获取： 专家介绍
		*/
		public String getZhuanjiaContent() {
			return zhuanjiaContent;
		}
		/**
		* 设置： 专家介绍
		*/
		public void setZhuanjiaContent(String zhuanjiaContent) {
			this.zhuanjiaContent = zhuanjiaContent;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "ZhuanjiaChatView{" +
			", zhuangtaiValue=" + zhuangtaiValue +
			", zhuanjiaChatValue=" + zhuanjiaChatValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", zhuanjiaName=" + zhuanjiaName +
			", zhuanjiaPhone=" + zhuanjiaPhone +
			", zhuanjiaIdNumber=" + zhuanjiaIdNumber +
			", zhuanjiaPhoto=" + zhuanjiaPhoto +
			", zhuanjiaEmail=" + zhuanjiaEmail +
			", zhuanjiaContent=" + zhuanjiaContent +
			"} " + super.toString();
	}
}
