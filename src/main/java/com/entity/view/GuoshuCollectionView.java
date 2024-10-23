package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuoshuCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 果蔬百科收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guoshu_collection")
public class GuoshuCollectionView extends GuoshuCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String guoshuCollectionValue;

	//级联表 果蔬百科
		/**
		* 果蔬名称
		*/

		@ColumnInfo(comment="果蔬名称",type="varchar(200)")
		private String guoshuName;
		/**
		* 果蔬编号
		*/

		@ColumnInfo(comment="果蔬编号",type="varchar(200)")
		private String guoshuUuidNumber;
		/**
		* 果蔬照片
		*/

		@ColumnInfo(comment="果蔬照片",type="varchar(200)")
		private String guoshuPhoto;
		/**
		* 果蔬类型
		*/
		@ColumnInfo(comment="果蔬类型",type="int(11)")
		private Integer guoshuTypes;
			/**
			* 果蔬类型的值
			*/
			@ColumnInfo(comment="果蔬类型的字典表值",type="varchar(200)")
			private String guoshuValue;
		/**
		* 二级类型
		*/
		@ColumnInfo(comment="二级类型",type="int(11)")
		private Integer guoshuErjiTypes;
			/**
			* 二级类型的值
			*/
			@ColumnInfo(comment="二级类型的字典表值",type="varchar(200)")
			private String guoshuErjiValue;
		/**
		* 果蔬产地
		*/

		@ColumnInfo(comment="果蔬产地",type="varchar(200)")
		private String guoshuChandi;
		/**
		* 气候
		*/

		@ColumnInfo(comment="气候",type="varchar(200)")
		private String guoshuQihou;
		/**
		* 季节
		*/

		@ColumnInfo(comment="季节",type="varchar(200)")
		private String guoshuJijie;
		/**
		* 果蔬热度
		*/

		@ColumnInfo(comment="果蔬热度",type="int(11)")
		private Integer guoshuClicknum;
		/**
		* 果蔬介绍
		*/

		@ColumnInfo(comment="果蔬介绍",type="text")
		private String guoshuContent;
		/**
		* 常见病虫害
		*/

		@ColumnInfo(comment="常见病虫害",type="text")
		private String guoshuBingchonghaiContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer guoshuDelete;
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



	public GuoshuCollectionView() {

	}

	public GuoshuCollectionView(GuoshuCollectionEntity guoshuCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, guoshuCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getGuoshuCollectionValue() {
		return guoshuCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setGuoshuCollectionValue(String guoshuCollectionValue) {
		this.guoshuCollectionValue = guoshuCollectionValue;
	}


	//级联表的get和set 果蔬百科

		/**
		* 获取： 果蔬名称
		*/
		public String getGuoshuName() {
			return guoshuName;
		}
		/**
		* 设置： 果蔬名称
		*/
		public void setGuoshuName(String guoshuName) {
			this.guoshuName = guoshuName;
		}

		/**
		* 获取： 果蔬编号
		*/
		public String getGuoshuUuidNumber() {
			return guoshuUuidNumber;
		}
		/**
		* 设置： 果蔬编号
		*/
		public void setGuoshuUuidNumber(String guoshuUuidNumber) {
			this.guoshuUuidNumber = guoshuUuidNumber;
		}

		/**
		* 获取： 果蔬照片
		*/
		public String getGuoshuPhoto() {
			return guoshuPhoto;
		}
		/**
		* 设置： 果蔬照片
		*/
		public void setGuoshuPhoto(String guoshuPhoto) {
			this.guoshuPhoto = guoshuPhoto;
		}
		/**
		* 获取： 果蔬类型
		*/
		public Integer getGuoshuTypes() {
			return guoshuTypes;
		}
		/**
		* 设置： 果蔬类型
		*/
		public void setGuoshuTypes(Integer guoshuTypes) {
			this.guoshuTypes = guoshuTypes;
		}


			/**
			* 获取： 果蔬类型的值
			*/
			public String getGuoshuValue() {
				return guoshuValue;
			}
			/**
			* 设置： 果蔬类型的值
			*/
			public void setGuoshuValue(String guoshuValue) {
				this.guoshuValue = guoshuValue;
			}
		/**
		* 获取： 二级类型
		*/
		public Integer getGuoshuErjiTypes() {
			return guoshuErjiTypes;
		}
		/**
		* 设置： 二级类型
		*/
		public void setGuoshuErjiTypes(Integer guoshuErjiTypes) {
			this.guoshuErjiTypes = guoshuErjiTypes;
		}


			/**
			* 获取： 二级类型的值
			*/
			public String getGuoshuErjiValue() {
				return guoshuErjiValue;
			}
			/**
			* 设置： 二级类型的值
			*/
			public void setGuoshuErjiValue(String guoshuErjiValue) {
				this.guoshuErjiValue = guoshuErjiValue;
			}

		/**
		* 获取： 果蔬产地
		*/
		public String getGuoshuChandi() {
			return guoshuChandi;
		}
		/**
		* 设置： 果蔬产地
		*/
		public void setGuoshuChandi(String guoshuChandi) {
			this.guoshuChandi = guoshuChandi;
		}

		/**
		* 获取： 气候
		*/
		public String getGuoshuQihou() {
			return guoshuQihou;
		}
		/**
		* 设置： 气候
		*/
		public void setGuoshuQihou(String guoshuQihou) {
			this.guoshuQihou = guoshuQihou;
		}

		/**
		* 获取： 季节
		*/
		public String getGuoshuJijie() {
			return guoshuJijie;
		}
		/**
		* 设置： 季节
		*/
		public void setGuoshuJijie(String guoshuJijie) {
			this.guoshuJijie = guoshuJijie;
		}

		/**
		* 获取： 果蔬热度
		*/
		public Integer getGuoshuClicknum() {
			return guoshuClicknum;
		}
		/**
		* 设置： 果蔬热度
		*/
		public void setGuoshuClicknum(Integer guoshuClicknum) {
			this.guoshuClicknum = guoshuClicknum;
		}

		/**
		* 获取： 果蔬介绍
		*/
		public String getGuoshuContent() {
			return guoshuContent;
		}
		/**
		* 设置： 果蔬介绍
		*/
		public void setGuoshuContent(String guoshuContent) {
			this.guoshuContent = guoshuContent;
		}

		/**
		* 获取： 常见病虫害
		*/
		public String getGuoshuBingchonghaiContent() {
			return guoshuBingchonghaiContent;
		}
		/**
		* 设置： 常见病虫害
		*/
		public void setGuoshuBingchonghaiContent(String guoshuBingchonghaiContent) {
			this.guoshuBingchonghaiContent = guoshuBingchonghaiContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getGuoshuDelete() {
			return guoshuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setGuoshuDelete(Integer guoshuDelete) {
			this.guoshuDelete = guoshuDelete;
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


	@Override
	public String toString() {
		return "GuoshuCollectionView{" +
			", guoshuCollectionValue=" + guoshuCollectionValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", guoshuName=" + guoshuName +
			", guoshuUuidNumber=" + guoshuUuidNumber +
			", guoshuPhoto=" + guoshuPhoto +
			", guoshuChandi=" + guoshuChandi +
			", guoshuQihou=" + guoshuQihou +
			", guoshuJijie=" + guoshuJijie +
			", guoshuClicknum=" + guoshuClicknum +
			", guoshuContent=" + guoshuContent +
			", guoshuBingchonghaiContent=" + guoshuBingchonghaiContent +
			", guoshuDelete=" + guoshuDelete +
			"} " + super.toString();
	}
}
