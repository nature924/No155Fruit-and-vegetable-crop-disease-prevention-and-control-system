package com.entity.vo;

import com.entity.ZhuanjiaChatEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 专家咨询
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuanjia_chat")
public class ZhuanjiaChatVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 提问人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 回答人
     */

    @TableField(value = "zhuanjia_id")
    private Integer zhuanjiaId;


    /**
     * 问题
     */

    @TableField(value = "zhuanjia_chat_issue_text")
    private String zhuanjiaChatIssueText;


    /**
     * 问题图片
     */

    @TableField(value = "zhuanjia_chat_issue_photo")
    private String zhuanjiaChatIssuePhoto;


    /**
     * 问题时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "issue_time")
    private Date issueTime;


    /**
     * 回复
     */

    @TableField(value = "zhuanjia_chat_reply_text")
    private String zhuanjiaChatReplyText;


    /**
     * 回复图片
     */

    @TableField(value = "zhuanjia_chat_reply_photo")
    private String zhuanjiaChatReplyPhoto;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "reply_time")
    private Date replyTime;


    /**
     * 状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 数据类型
     */

    @TableField(value = "zhuanjia_chat_types")
    private Integer zhuanjiaChatTypes;


    /**
     * 提问时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：提问人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：提问人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：回答人
	 */
    public Integer getZhuanjiaId() {
        return zhuanjiaId;
    }


    /**
	 * 获取：回答人
	 */

    public void setZhuanjiaId(Integer zhuanjiaId) {
        this.zhuanjiaId = zhuanjiaId;
    }
    /**
	 * 设置：问题
	 */
    public String getZhuanjiaChatIssueText() {
        return zhuanjiaChatIssueText;
    }


    /**
	 * 获取：问题
	 */

    public void setZhuanjiaChatIssueText(String zhuanjiaChatIssueText) {
        this.zhuanjiaChatIssueText = zhuanjiaChatIssueText;
    }
    /**
	 * 设置：问题图片
	 */
    public String getZhuanjiaChatIssuePhoto() {
        return zhuanjiaChatIssuePhoto;
    }


    /**
	 * 获取：问题图片
	 */

    public void setZhuanjiaChatIssuePhoto(String zhuanjiaChatIssuePhoto) {
        this.zhuanjiaChatIssuePhoto = zhuanjiaChatIssuePhoto;
    }
    /**
	 * 设置：问题时间
	 */
    public Date getIssueTime() {
        return issueTime;
    }


    /**
	 * 获取：问题时间
	 */

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }
    /**
	 * 设置：回复
	 */
    public String getZhuanjiaChatReplyText() {
        return zhuanjiaChatReplyText;
    }


    /**
	 * 获取：回复
	 */

    public void setZhuanjiaChatReplyText(String zhuanjiaChatReplyText) {
        this.zhuanjiaChatReplyText = zhuanjiaChatReplyText;
    }
    /**
	 * 设置：回复图片
	 */
    public String getZhuanjiaChatReplyPhoto() {
        return zhuanjiaChatReplyPhoto;
    }


    /**
	 * 获取：回复图片
	 */

    public void setZhuanjiaChatReplyPhoto(String zhuanjiaChatReplyPhoto) {
        this.zhuanjiaChatReplyPhoto = zhuanjiaChatReplyPhoto;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getReplyTime() {
        return replyTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
    /**
	 * 设置：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：数据类型
	 */
    public Integer getZhuanjiaChatTypes() {
        return zhuanjiaChatTypes;
    }


    /**
	 * 获取：数据类型
	 */

    public void setZhuanjiaChatTypes(Integer zhuanjiaChatTypes) {
        this.zhuanjiaChatTypes = zhuanjiaChatTypes;
    }
    /**
	 * 设置：提问时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：提问时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
