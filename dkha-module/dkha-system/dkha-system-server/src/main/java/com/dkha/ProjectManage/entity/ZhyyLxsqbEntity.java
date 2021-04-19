/**
 * Copyright 2020 人人开源 https://www.renren.io
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.dkha.ProjectManage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;


import com.dkha.commons.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 立项申请表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("zhyy_lxsqb")
public class ZhyyLxsqbEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * 立项申请ID
     */
    @TableId
	private Long lxsqid;
    /**
     * 项目名称
     */
	private String xmmc;
    /**
     * 申请人
     */
	private String sqr;
    /**
     * 申请单位
     */
	private String sqdw;
    /**
     * 项目开始时间
     */
	private Date xmkssj;
    /**
     * 项目结束时间
     */
	private Date smjssj;
    /**
     * 项目类型
     */
	private String xmlx;
    /**
     * 项目描述
     */
	private String xmms;
    /**
     * 项目状态
     */
	private String xmzt;
}