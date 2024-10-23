package com.entity.model;

import com.entity.GuoshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 果蔬百科
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GuoshuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 果蔬名称
     */
    private String guoshuName;


    /**
     * 果蔬编号
     */
    private String guoshuUuidNumber;


    /**
     * 果蔬照片
     */
    private String guoshuPhoto;


    /**
     * 果蔬类型
     */
    private Integer guoshuTypes;


    /**
     * 二级类型
     */
    private Integer guoshuErjiTypes;


    /**
     * 果蔬产地
     */
    private String guoshuChandi;


    /**
     * 气候
     */
    private String guoshuQihou;


    /**
     * 季节
     */
    private String guoshuJijie;


    /**
     * 果蔬热度
     */
    private Integer guoshuClicknum;


    /**
     * 果蔬介绍
     */
    private String guoshuContent;


    /**
     * 常见病虫害
     */
    private String guoshuBingchonghaiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer guoshuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
