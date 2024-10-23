package com.entity.vo;

import com.entity.ZhuanjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 专家
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuanjia")
public class ZhuanjiaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 专家姓名
     */

    @TableField(value = "zhuanjia_name")
    private String zhuanjiaName;


    /**
     * 专家手机号
     */

    @TableField(value = "zhuanjia_phone")
    private String zhuanjiaPhone;


    /**
     * 专家身份证号
     */

    @TableField(value = "zhuanjia_id_number")
    private String zhuanjiaIdNumber;


    /**
     * 专家头像
     */

    @TableField(value = "zhuanjia_photo")
    private String zhuanjiaPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 研究方向
     */

    @TableField(value = "yanjiufangxiang_types")
    private Integer yanjiufangxiangTypes;


    /**
     * 专家邮箱
     */

    @TableField(value = "zhuanjia_email")
    private String zhuanjiaEmail;


    /**
     * 专家介绍
     */

    @TableField(value = "zhuanjia_content")
    private String zhuanjiaContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：专家姓名
	 */
    public String getZhuanjiaName() {
        return zhuanjiaName;
    }


    /**
	 * 获取：专家姓名
	 */

    public void setZhuanjiaName(String zhuanjiaName) {
        this.zhuanjiaName = zhuanjiaName;
    }
    /**
	 * 设置：专家手机号
	 */
    public String getZhuanjiaPhone() {
        return zhuanjiaPhone;
    }


    /**
	 * 获取：专家手机号
	 */

    public void setZhuanjiaPhone(String zhuanjiaPhone) {
        this.zhuanjiaPhone = zhuanjiaPhone;
    }
    /**
	 * 设置：专家身份证号
	 */
    public String getZhuanjiaIdNumber() {
        return zhuanjiaIdNumber;
    }


    /**
	 * 获取：专家身份证号
	 */

    public void setZhuanjiaIdNumber(String zhuanjiaIdNumber) {
        this.zhuanjiaIdNumber = zhuanjiaIdNumber;
    }
    /**
	 * 设置：专家头像
	 */
    public String getZhuanjiaPhoto() {
        return zhuanjiaPhoto;
    }


    /**
	 * 获取：专家头像
	 */

    public void setZhuanjiaPhoto(String zhuanjiaPhoto) {
        this.zhuanjiaPhoto = zhuanjiaPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：研究方向
	 */
    public Integer getYanjiufangxiangTypes() {
        return yanjiufangxiangTypes;
    }


    /**
	 * 获取：研究方向
	 */

    public void setYanjiufangxiangTypes(Integer yanjiufangxiangTypes) {
        this.yanjiufangxiangTypes = yanjiufangxiangTypes;
    }
    /**
	 * 设置：专家邮箱
	 */
    public String getZhuanjiaEmail() {
        return zhuanjiaEmail;
    }


    /**
	 * 获取：专家邮箱
	 */

    public void setZhuanjiaEmail(String zhuanjiaEmail) {
        this.zhuanjiaEmail = zhuanjiaEmail;
    }
    /**
	 * 设置：专家介绍
	 */
    public String getZhuanjiaContent() {
        return zhuanjiaContent;
    }


    /**
	 * 获取：专家介绍
	 */

    public void setZhuanjiaContent(String zhuanjiaContent) {
        this.zhuanjiaContent = zhuanjiaContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
