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

package com.dkha.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;


/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-16
 */
@Data
@ApiModel(value = "")
public class ZhyyBasicInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "姓名")
	private String xm;

	@ApiModelProperty(value = "学号")
	private String xh;

	@ApiModelProperty(value = "密码")
	private String mm;

	@ApiModelProperty(value = "性别")
	private String xb;

	@ApiModelProperty(value = "出生日期")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date csrq;

	@ApiModelProperty(value = "身份证号")
	private String sfzh;

	@ApiModelProperty(value = "手机号码")
	private String sjhm;

	@ApiModelProperty(value = "电子邮件")
	private String dzyj;

	@ApiModelProperty(value = "院系")
	private String yx;

	@ApiModelProperty(value = "年级")
	private String nj;

	@ApiModelProperty(value = "班级")
	private String bj;

	@ApiModelProperty(value = "权限等级")
	private String qxdj;


	@ApiModelProperty(value = "最后修改时间")
	private Date zhxgsj;

	@ApiModelProperty(value = "记录创建时间")
	private Date createDate;

}