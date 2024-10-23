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
 * 预警
 *
 * @author 
 * @email
 */
@TableName("yujing")
public class YujingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YujingEntity() {

	}

	public YujingEntity(T t) {
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
     * 预警名称
     */
    @ColumnInfo(comment="预警名称",type="varchar(200)")
    @TableField(value = "yujing_name")

    private String yujingName;


    /**
     * 预警图片
     */
    @ColumnInfo(comment="预警图片",type="varchar(200)")
    @TableField(value = "yujing_photo")

    private String yujingPhoto;


    /**
     * 预警类型
     */
    @ColumnInfo(comment="预警类型",type="int(11)")
    @TableField(value = "yujing_types")

    private Integer yujingTypes;


    /**
     * 预警发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="预警发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 预警内容
     */
    @ColumnInfo(comment="预警内容",type="text")
    @TableField(value = "yujing_content")

    private String yujingContent;


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
	 * 获取：预警名称
	 */
    public String getYujingName() {
        return yujingName;
    }
    /**
	 * 设置：预警名称
	 */

    public void setYujingName(String yujingName) {
        this.yujingName = yujingName;
    }
    /**
	 * 获取：预警图片
	 */
    public String getYujingPhoto() {
        return yujingPhoto;
    }
    /**
	 * 设置：预警图片
	 */

    public void setYujingPhoto(String yujingPhoto) {
        this.yujingPhoto = yujingPhoto;
    }
    /**
	 * 获取：预警类型
	 */
    public Integer getYujingTypes() {
        return yujingTypes;
    }
    /**
	 * 设置：预警类型
	 */

    public void setYujingTypes(Integer yujingTypes) {
        this.yujingTypes = yujingTypes;
    }
    /**
	 * 获取：预警发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：预警发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：预警内容
	 */
    public String getYujingContent() {
        return yujingContent;
    }
    /**
	 * 设置：预警内容
	 */

    public void setYujingContent(String yujingContent) {
        this.yujingContent = yujingContent;
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
        return "Yujing{" +
            ", id=" + id +
            ", yujingName=" + yujingName +
            ", yujingPhoto=" + yujingPhoto +
            ", yujingTypes=" + yujingTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", yujingContent=" + yujingContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
