package com.entity.model;

import com.entity.ZhuanjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 专家
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuanjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 专家姓名
     */
    private String zhuanjiaName;


    /**
     * 专家手机号
     */
    private String zhuanjiaPhone;


    /**
     * 专家身份证号
     */
    private String zhuanjiaIdNumber;


    /**
     * 专家头像
     */
    private String zhuanjiaPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 研究方向
     */
    private Integer yanjiufangxiangTypes;


    /**
     * 专家邮箱
     */
    private String zhuanjiaEmail;


    /**
     * 专家介绍
     */
    private String zhuanjiaContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：专家姓名
	 */
    public String getZhuanjiaName() {
        return zhuanjiaName;
    }


    /**
	 * 设置：专家姓名
	 */
    public void setZhuanjiaName(String zhuanjiaName) {
        this.zhuanjiaName = zhuanjiaName;
    }
    /**
	 * 获取：专家手机号
	 */
    public String getZhuanjiaPhone() {
        return zhuanjiaPhone;
    }


    /**
	 * 设置：专家手机号
	 */
    public void setZhuanjiaPhone(String zhuanjiaPhone) {
        this.zhuanjiaPhone = zhuanjiaPhone;
    }
    /**
	 * 获取：专家身份证号
	 */
    public String getZhuanjiaIdNumber() {
        return zhuanjiaIdNumber;
    }


    /**
	 * 设置：专家身份证号
	 */
    public void setZhuanjiaIdNumber(String zhuanjiaIdNumber) {
        this.zhuanjiaIdNumber = zhuanjiaIdNumber;
    }
    /**
	 * 获取：专家头像
	 */
    public String getZhuanjiaPhoto() {
        return zhuanjiaPhoto;
    }


    /**
	 * 设置：专家头像
	 */
    public void setZhuanjiaPhoto(String zhuanjiaPhoto) {
        this.zhuanjiaPhoto = zhuanjiaPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：研究方向
	 */
    public Integer getYanjiufangxiangTypes() {
        return yanjiufangxiangTypes;
    }


    /**
	 * 设置：研究方向
	 */
    public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
        this.yanjiufangxiangTypes = yanjiufangxiangTypes;
    }
    /**
	 * 获取：专家邮箱
	 */
    public String getZhuanjiaEmail() {
        return zhuanjiaEmail;
    }


    /**
	 * 设置：专家邮箱
	 */
    public void setZhuanjiaEmail(String zhuanjiaEmail) {
        this.zhuanjiaEmail = zhuanjiaEmail;
    }
    /**
	 * 获取：专家介绍
	 */
    public String getZhuanjiaContent() {
        return zhuanjiaContent;
    }


    /**
	 * 设置：专家介绍
	 */
    public void setZhuanjiaContent(String zhuanjiaContent) {
        this.zhuanjiaContent = zhuanjiaContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
