package com.entity.vo;

import com.entity.YujingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 预警
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yujing")
public class YujingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 预警名称
     */

    @TableField(value = "yujing_name")
    private String yujingName;


    /**
     * 预警图片
     */

    @TableField(value = "yujing_photo")
    private String yujingPhoto;


    /**
     * 预警类型
     */

    @TableField(value = "yujing_types")
    private Integer yujingTypes;


    /**
     * 预警发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 预警内容
     */

    @TableField(value = "yujing_content")
    private String yujingContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：预警名称
	 */
    public String getYujingName() {
        return yujingName;
    }


    /**
	 * 获取：预警名称
	 */

    public void setYujingName(String yujingName) {
        this.yujingName = yujingName;
    }
    /**
	 * 设置：预警图片
	 */
    public String getYujingPhoto() {
        return yujingPhoto;
    }


    /**
	 * 获取：预警图片
	 */

    public void setYujingPhoto(String yujingPhoto) {
        this.yujingPhoto = yujingPhoto;
    }
    /**
	 * 设置：预警类型
	 */
    public Integer getYujingTypes() {
        return yujingTypes;
    }


    /**
	 * 获取：预警类型
	 */

    public void setYujingTypes(Integer yujingTypes) {
        this.yujingTypes = yujingTypes;
    }
    /**
	 * 设置：预警发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：预警发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：预警内容
	 */
    public String getYujingContent() {
        return yujingContent;
    }


    /**
	 * 获取：预警内容
	 */

    public void setYujingContent(String yujingContent) {
        this.yujingContent = yujingContent;
    }
    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
