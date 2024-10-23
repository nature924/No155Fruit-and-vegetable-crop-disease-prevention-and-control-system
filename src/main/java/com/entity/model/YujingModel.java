package com.entity.model;

import com.entity.YujingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 预警
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YujingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预警名称
     */
    private String yujingName;


    /**
     * 预警图片
     */
    private String yujingPhoto;


    /**
     * 预警类型
     */
    private Integer yujingTypes;


    /**
     * 预警发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 预警内容
     */
    private String yujingContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
