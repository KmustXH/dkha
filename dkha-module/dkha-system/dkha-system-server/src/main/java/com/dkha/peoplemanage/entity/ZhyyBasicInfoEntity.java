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

package com.dkha.peoplemanage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;


import com.dkha.commons.mybatis.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-16
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("zhyy_basic_info")
public class ZhyyBasicInfoEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@TableId("ryid")
	private Long id;

    /**
     * 姓名
     */
	private String xm;
    /**
     * 学号
     */
	private String xh;
    /**
     * 密码
     */
	private String mm;
    /**
     * 性别
     */
	private String xb;
    /**
     * 出生日期
     */
	private Date csrq;
    /**
     * 身份证号
     */
	private String sfzh;
    /**
     * 手机号码
     */
	private String sjhm;
    /**
     * 电子邮件
     */
	private String dzyj;
    /**
     * 院系
     */
	private String yx;
    /**
     * 年级
     */
	private String nj;
    /**
     * 班级
     */
	private String bj;
    /**
     * 权限等级
     */
	private String qxdj;
    /**
     * 创建时间
     */
    /**
     * 最后修改时间
     */
	private Date zhxgsj;
}