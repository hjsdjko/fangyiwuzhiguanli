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
 * 出入库详情
 *
 * @author 
 * @email
 */
@TableName("fangyiwuzi_churu_inout_list")
public class FangyiwuziChuruInoutListEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangyiwuziChuruInoutListEntity() {

	}

	public FangyiwuziChuruInoutListEntity(T t) {
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
     * 出入库
     */
    @ColumnInfo(comment="出入库",type="int(11)")
    @TableField(value = "fangyiwuzi_churu_inout_id")

    private Integer fangyiwuziChuruInoutId;


    /**
     * 物资
     */
    @ColumnInfo(comment="物资",type="int(11)")
    @TableField(value = "fangyiwuzi_id")

    private Integer fangyiwuziId;


    /**
     * 操作数量
     */
    @ColumnInfo(comment="操作数量",type="int(11)")
    @TableField(value = "fangyiwuzi_churu_inout_list_number")

    private Integer fangyiwuziChuruInoutListNumber;


    /**
     * 操作时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="操作时间",type="timestamp")
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
	 * 获取：出入库
	 */
    public Integer getFangyiwuziChuruInoutId() {
        return fangyiwuziChuruInoutId;
    }
    /**
	 * 设置：出入库
	 */

    public void setFangyiwuziChuruInoutId(Integer fangyiwuziChuruInoutId) {
        this.fangyiwuziChuruInoutId = fangyiwuziChuruInoutId;
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
	 * 获取：操作数量
	 */
    public Integer getFangyiwuziChuruInoutListNumber() {
        return fangyiwuziChuruInoutListNumber;
    }
    /**
	 * 设置：操作数量
	 */

    public void setFangyiwuziChuruInoutListNumber(Integer fangyiwuziChuruInoutListNumber) {
        this.fangyiwuziChuruInoutListNumber = fangyiwuziChuruInoutListNumber;
    }
    /**
	 * 获取：操作时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：操作时间
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
        return "FangyiwuziChuruInoutList{" +
            ", id=" + id +
            ", fangyiwuziChuruInoutId=" + fangyiwuziChuruInoutId +
            ", fangyiwuziId=" + fangyiwuziId +
            ", fangyiwuziChuruInoutListNumber=" + fangyiwuziChuruInoutListNumber +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
