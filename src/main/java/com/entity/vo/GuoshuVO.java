package com.entity.vo;

import com.entity.GuoshuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 果蔬百科
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guoshu")
public class GuoshuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 果蔬名称
     */

    @TableField(value = "guoshu_name")
    private String guoshuName;


    /**
     * 果蔬编号
     */

    @TableField(value = "guoshu_uuid_number")
    private String guoshuUuidNumber;


    /**
     * 果蔬照片
     */

    @TableField(value = "guoshu_photo")
    private String guoshuPhoto;


    /**
     * 果蔬类型
     */

    @TableField(value = "guoshu_types")
    private Integer guoshuTypes;


    /**
     * 二级类型
     */

    @TableField(value = "guoshu_erji_types")
    private Integer guoshuErjiTypes;


    /**
     * 果蔬产地
     */

    @TableField(value = "guoshu_chandi")
    private String guoshuChandi;


    /**
     * 气候
     */

    @TableField(value = "guoshu_qihou")
    private String guoshuQihou;


    /**
     * 季节
     */

    @TableField(value = "guoshu_jijie")
    private String guoshuJijie;


    /**
     * 果蔬热度
     */

    @TableField(value = "guoshu_clicknum")
    private Integer guoshuClicknum;


    /**
     * 果蔬介绍
     */

    @TableField(value = "guoshu_content")
    private String guoshuContent;


    /**
     * 常见病虫害
     */

    @TableField(value = "guoshu_bingchonghai_content")
    private String guoshuBingchonghaiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "guoshu_delete")
    private Integer guoshuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：果蔬名称
	 */
    public String getGuoshuName() {
        return guoshuName;
    }


    /**
	 * 获取：果蔬名称
	 */

    public void setGuoshuName(String guoshuName) {
        this.guoshuName = guoshuName;
    }
    /**
	 * 设置：果蔬编号
	 */
    public String getGuoshuUuidNumber() {
        return guoshuUuidNumber;
    }


    /**
	 * 获取：果蔬编号
	 */

    public void setGuoshuUuidNumber(String guoshuUuidNumber) {
        this.guoshuUuidNumber = guoshuUuidNumber;
    }
    /**
	 * 设置：果蔬照片
	 */
    public String getGuoshuPhoto() {
        return guoshuPhoto;
    }


    /**
	 * 获取：果蔬照片
	 */

    public void setGuoshuPhoto(String guoshuPhoto) {
        this.guoshuPhoto = guoshuPhoto;
    }
    /**
	 * 设置：果蔬类型
	 */
    public Integer getGuoshuTypes() {
        return guoshuTypes;
    }


    /**
	 * 获取：果蔬类型
	 */

    public void setGuoshuTypes(Integer guoshuTypes) {
        this.guoshuTypes = guoshuTypes;
    }
    /**
	 * 设置：二级类型
	 */
    public Integer getGuoshuErjiTypes() {
        return guoshuErjiTypes;
    }


    /**
	 * 获取：二级类型
	 */

    public void setGuoshuErjiTypes(Integer guoshuErjiTypes) {
        this.guoshuErjiTypes = guoshuErjiTypes;
    }
    /**
	 * 设置：果蔬产地
	 */
    public String getGuoshuChandi() {
        return guoshuChandi;
    }


    /**
	 * 获取：果蔬产地
	 */

    public void setGuoshuChandi(String guoshuChandi) {
        this.guoshuChandi = guoshuChandi;
    }
    /**
	 * 设置：气候
	 */
    public String getGuoshuQihou() {
        return guoshuQihou;
    }


    /**
	 * 获取：气候
	 */

    public void setGuoshuQihou(String guoshuQihou) {
        this.guoshuQihou = guoshuQihou;
    }
    /**
	 * 设置：季节
	 */
    public String getGuoshuJijie() {
        return guoshuJijie;
    }


    /**
	 * 获取：季节
	 */

    public void setGuoshuJijie(String guoshuJijie) {
        this.guoshuJijie = guoshuJijie;
    }
    /**
	 * 设置：果蔬热度
	 */
    public Integer getGuoshuClicknum() {
        return guoshuClicknum;
    }


    /**
	 * 获取：果蔬热度
	 */

    public void setGuoshuClicknum(Integer guoshuClicknum) {
        this.guoshuClicknum = guoshuClicknum;
    }
    /**
	 * 设置：果蔬介绍
	 */
    public String getGuoshuContent() {
        return guoshuContent;
    }


    /**
	 * 获取：果蔬介绍
	 */

    public void setGuoshuContent(String guoshuContent) {
        this.guoshuContent = guoshuContent;
    }
    /**
	 * 设置：常见病虫害
	 */
    public String getGuoshuBingchonghaiContent() {
        return guoshuBingchonghaiContent;
    }


    /**
	 * 获取：常见病虫害
	 */

    public void setGuoshuBingchonghaiContent(String guoshuBingchonghaiContent) {
        this.guoshuBingchonghaiContent = guoshuBingchonghaiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGuoshuDelete() {
        return guoshuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGuoshuDelete(Integer guoshuDelete) {
        this.guoshuDelete = guoshuDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
