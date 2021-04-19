

package com.dkha.commons.mybatis.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类，所有实体都需要继承
 * @since 1.0.0
 */
@Data
public abstract class BaseEntity implements Serializable {
    /**


     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

}
