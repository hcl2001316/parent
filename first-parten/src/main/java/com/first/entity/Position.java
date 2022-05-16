package com.first.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.io.Serializable;

/**
 * 职位表(Position)实体类
 *
 * @author makejava
 * @since 2022-05-01 21:22:49
 */
@Repository
public class Position implements Serializable {
    private static final long serialVersionUID = -61963164382121997L;
    /**
     * 职位表id
     */

    private Integer positionId;
    /**
     * 职位名
     */

    private String positionName;
    /**
     * 创建时间
     */

    private Date createTime;
    /**
     * 状态 1:有效 0:无效
     */

    private Integer status;


    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

