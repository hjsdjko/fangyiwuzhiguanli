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
 * 出入库
 *
 * @author 
 * @email
 */
@TableName("fangyiwuzi_churu_inout")
public class FangyiwuziChuruInoutEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangyiwuziChuruInoutEntity() {

	}

	public FangyiwuziChuruInoutEntity(T t) {
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
     * 出入库流水号
     */
    @ColumnInfo(comment="出入库流水号",type="varchar(200)")
    @TableField(value = "fangyiwuzi_churu_inout_uuid_number")

    private String fangyiwuziChuruInoutUuidNumber;


    /**
     * 出入库名称
     */
    @ColumnInfo(comment="出入库名称",type="varchar(200)")
    @TableField(value = "fangyiwuzi_churu_inout_name")

    private String fangyiwuziChuruInoutName;


    /**
     * 出入库类型
     */
    @ColumnInfo(comment="出入库类型",type="int(11)")
    @TableField(value = "fangyiwuzi_churu_inout_types")

    private Integer fangyiwuziChuruInoutTypes;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "fangyiwuzi_churu_inout_content")

    private String fangyiwuziChuruInoutContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
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
	 * 获取：出入库流水号
	 */
    public String getFangyiwuziChuruInoutUuidNumber() {
        return fangyiwuziChuruInoutUuidNumber;
    }
    /**
	 * 设置：出入库流水号
	 */

    public void setFangyiwuziChuruInoutUuidNumber(String fangyiwuziChuruInoutUuidNumber) {
        this.fangyiwuziChuruInoutUuidNumber = fangyiwuziChuruInoutUuidNumber;
    }
    /**
	 * 获取：出入库名称
	 */
    public String getFangyiwuziChuruInoutName() {
        return fangyiwuziChuruInoutName;
    }
    /**
	 * 设置：出入库名称
	 */

    public void setFangyiwuziChuruInoutName(String fangyiwuziChuruInoutName) {
        this.fangyiwuziChuruInoutName = fangyiwuziChuruInoutName;
    }
    /**
	 * 获取：出入库类型
	 */
    public Integer getFangyiwuziChuruInoutTypes() {
        return fangyiwuziChuruInoutTypes;
    }
    /**
	 * 设置：出入库类型
	 */

    public void setFangyiwuziChuruInoutTypes(Integer fangyiwuziChuruInoutTypes) {
        this.fangyiwuziChuruInoutTypes = fangyiwuziChuruInoutTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getFangyiwuziChuruInoutContent() {
        return fangyiwuziChuruInoutContent;
    }
    /**
	 * 设置：备注
	 */

    public void setFangyiwuziChuruInoutContent(String fangyiwuziChuruInoutContent) {
        this.fangyiwuziChuruInoutContent = fangyiwuziChuruInoutContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
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
        return "FangyiwuziChuruInout{" +
            ", id=" + id +
            ", fangyiwuziChuruInoutUuidNumber=" + fangyiwuziChuruInoutUuidNumber +
            ", fangyiwuziChuruInoutName=" + fangyiwuziChuruInoutName +
            ", fangyiwuziChuruInoutTypes=" + fangyiwuziChuruInoutTypes +
            ", fangyiwuziChuruInoutContent=" + fangyiwuziChuruInoutContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
