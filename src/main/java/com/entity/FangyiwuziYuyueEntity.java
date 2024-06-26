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
 * 物资申请
 *
 * @author 
 * @email
 */
@TableName("fangyiwuzi_yuyue")
public class FangyiwuziYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangyiwuziYuyueEntity() {

	}

	public FangyiwuziYuyueEntity(T t) {
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
     * 物资
     */
    @ColumnInfo(comment="物资",type="int(11)")
    @TableField(value = "fangyiwuzi_id")

    private Integer fangyiwuziId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请数量
     */
    @ColumnInfo(comment="申请数量",type="int(11)")
    @TableField(value = "fangyiwuzi_yuyue_number")

    private Integer fangyiwuziYuyueNumber;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "fangyiwuzi_yuyue_yesno_types")

    private Integer fangyiwuziYuyueYesnoTypes;


    /**
     * 申请结果
     */
    @ColumnInfo(comment="申请结果",type="text")
    @TableField(value = "fangyiwuzi_yuyue_yesno_text")

    private String fangyiwuziYuyueYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
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
	 * 获取：物资
	 */
    public Integer getFangyiwuziId() {
        return fangyiwuziId;
    }
    /**
	 * 设置：物资
	 */

    public void setFangyiwuziId(Integer fangyiwuziId) {
        this.fangyiwuziId = fangyiwuziId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请数量
	 */
    public Integer getFangyiwuziYuyueNumber() {
        return fangyiwuziYuyueNumber;
    }
    /**
	 * 设置：申请数量
	 */

    public void setFangyiwuziYuyueNumber(Integer fangyiwuziYuyueNumber) {
        this.fangyiwuziYuyueNumber = fangyiwuziYuyueNumber;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getFangyiwuziYuyueYesnoTypes() {
        return fangyiwuziYuyueYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setFangyiwuziYuyueYesnoTypes(Integer fangyiwuziYuyueYesnoTypes) {
        this.fangyiwuziYuyueYesnoTypes = fangyiwuziYuyueYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getFangyiwuziYuyueYesnoText() {
        return fangyiwuziYuyueYesnoText;
    }
    /**
	 * 设置：申请结果
	 */

    public void setFangyiwuziYuyueYesnoText(String fangyiwuziYuyueYesnoText) {
        this.fangyiwuziYuyueYesnoText = fangyiwuziYuyueYesnoText;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FangyiwuziYuyue{" +
            ", id=" + id +
            ", fangyiwuziId=" + fangyiwuziId +
            ", yonghuId=" + yonghuId +
            ", fangyiwuziYuyueNumber=" + fangyiwuziYuyueNumber +
            ", fangyiwuziYuyueYesnoTypes=" + fangyiwuziYuyueYesnoTypes +
            ", fangyiwuziYuyueYesnoText=" + fangyiwuziYuyueYesnoText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
