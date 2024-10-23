package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 果蔬百科
 *
 * @author 
 * @email
 */
@TableName("guoshu")
public class GuoshuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuoshuEntity() {

	}

	public GuoshuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 果蔬名称
     */
    @ColumnInfo(comment="果蔬名称",type="varchar(200)")
    @TableField(value = "guoshu_name")

    private String guoshuName;


    /**
     * 果蔬编号
     */
    @ColumnInfo(comment="果蔬编号",type="varchar(200)")
    @TableField(value = "guoshu_uuid_number")

    private String guoshuUuidNumber;


    /**
     * 果蔬照片
     */
    @ColumnInfo(comment="果蔬照片",type="varchar(200)")
    @TableField(value = "guoshu_photo")

    private String guoshuPhoto;


    /**
     * 果蔬类型
     */
    @ColumnInfo(comment="果蔬类型",type="int(11)")
    @TableField(value = "guoshu_types")

    private Integer guoshuTypes;


    /**
     * 二级类型
     */
    @ColumnInfo(comment="二级类型",type="int(11)")
    @TableField(value = "guoshu_erji_types")

    private Integer guoshuErjiTypes;


    /**
     * 果蔬产地
     */
    @ColumnInfo(comment="果蔬产地",type="varchar(200)")
    @TableField(value = "guoshu_chandi")

    private String guoshuChandi;


    /**
     * 气候
     */
    @ColumnInfo(comment="气候",type="varchar(200)")
    @TableField(value = "guoshu_qihou")

    private String guoshuQihou;


    /**
     * 季节
     */
    @ColumnInfo(comment="季节",type="varchar(200)")
    @TableField(value = "guoshu_jijie")

    private String guoshuJijie;


    /**
     * 果蔬热度
     */
    @ColumnInfo(comment="果蔬热度",type="int(11)")
    @TableField(value = "guoshu_clicknum")

    private Integer guoshuClicknum;


    /**
     * 果蔬介绍
     */
    @ColumnInfo(comment="果蔬介绍",type="text")
    @TableField(value = "guoshu_content")

    private String guoshuContent;


    /**
     * 常见病虫害
     */
    @ColumnInfo(comment="常见病虫害",type="text")
    @TableField(value = "guoshu_bingchonghai_content")

    private String guoshuBingchonghaiContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "guoshu_delete")

    private Integer guoshuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：果蔬名称
	 */
    public String getGuoshuName() {
        return guoshuName;
    }
    /**
	 * 设置：果蔬名称
	 */

    public void setGuoshuName(String guoshuName) {
        this.guoshuName = guoshuName;
    }
    /**
	 * 获取：果蔬编号
	 */
    public String getGuoshuUuidNumber() {
        return guoshuUuidNumber;
    }
    /**
	 * 设置：果蔬编号
	 */

    public void setGuoshuUuidNumber(String guoshuUuidNumber) {
        this.guoshuUuidNumber = guoshuUuidNumber;
    }
    /**
	 * 获取：果蔬照片
	 */
    public String getGuoshuPhoto() {
        return guoshuPhoto;
    }
    /**
	 * 设置：果蔬照片
	 */

    public void setGuoshuPhoto(String guoshuPhoto) {
        this.guoshuPhoto = guoshuPhoto;
    }
    /**
	 * 获取：果蔬类型
	 */
    public Integer getGuoshuTypes() {
        return guoshuTypes;
    }
    /**
	 * 设置：果蔬类型
	 */

    public void setGuoshuTypes(Integer guoshuTypes) {
        this.guoshuTypes = guoshuTypes;
    }
    /**
	 * 获取：二级类型
	 */
    public Integer getGuoshuErjiTypes() {
        return guoshuErjiTypes;
    }
    /**
	 * 设置：二级类型
	 */

    public void setGuoshuErjiTypes(Integer guoshuErjiTypes) {
        this.guoshuErjiTypes = guoshuErjiTypes;
    }
    /**
	 * 获取：果蔬产地
	 */
    public String getGuoshuChandi() {
        return guoshuChandi;
    }
    /**
	 * 设置：果蔬产地
	 */

    public void setGuoshuChandi(String guoshuChandi) {
        this.guoshuChandi = guoshuChandi;
    }
    /**
	 * 获取：气候
	 */
    public String getGuoshuQihou() {
        return guoshuQihou;
    }
    /**
	 * 设置：气候
	 */

    public void setGuoshuQihou(String guoshuQihou) {
        this.guoshuQihou = guoshuQihou;
    }
    /**
	 * 获取：季节
	 */
    public String getGuoshuJijie() {
        return guoshuJijie;
    }
    /**
	 * 设置：季节
	 */

    public void setGuoshuJijie(String guoshuJijie) {
        this.guoshuJijie = guoshuJijie;
    }
    /**
	 * 获取：果蔬热度
	 */
    public Integer getGuoshuClicknum() {
        return guoshuClicknum;
    }
    /**
	 * 设置：果蔬热度
	 */

    public void setGuoshuClicknum(Integer guoshuClicknum) {
        this.guoshuClicknum = guoshuClicknum;
    }
    /**
	 * 获取：果蔬介绍
	 */
    public String getGuoshuContent() {
        return guoshuContent;
    }
    /**
	 * 设置：果蔬介绍
	 */

    public void setGuoshuContent(String guoshuContent) {
        this.guoshuContent = guoshuContent;
    }
    /**
	 * 获取：常见病虫害
	 */
    public String getGuoshuBingchonghaiContent() {
        return guoshuBingchonghaiContent;
    }
    /**
	 * 设置：常见病虫害
	 */

    public void setGuoshuBingchonghaiContent(String guoshuBingchonghaiContent) {
        this.guoshuBingchonghaiContent = guoshuBingchonghaiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getGuoshuDelete() {
        return guoshuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setGuoshuDelete(Integer guoshuDelete) {
        this.guoshuDelete = guoshuDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Guoshu{" +
            ", id=" + id +
            ", guoshuName=" + guoshuName +
            ", guoshuUuidNumber=" + guoshuUuidNumber +
            ", guoshuPhoto=" + guoshuPhoto +
            ", guoshuTypes=" + guoshuTypes +
            ", guoshuErjiTypes=" + guoshuErjiTypes +
            ", guoshuChandi=" + guoshuChandi +
            ", guoshuQihou=" + guoshuQihou +
            ", guoshuJijie=" + guoshuJijie +
            ", guoshuClicknum=" + guoshuClicknum +
            ", guoshuContent=" + guoshuContent +
            ", guoshuBingchonghaiContent=" + guoshuBingchonghaiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", guoshuDelete=" + guoshuDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
