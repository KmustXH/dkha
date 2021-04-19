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
 * 立项申请表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@Data
@ApiModel(value = "立项申请表")
public class ZhyyLxsqbDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "立项申请ID")
	private Long lxsqid;

	@ApiModelProperty(value = "项目名称")
	private String xmmc;

	@ApiModelProperty(value = "申请人")
	private String sqr;

	@ApiModelProperty(value = "申请单位")
	private String sqdw;

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@ApiModelProperty(value = "项目开始时间")
	private Date xmkssj;

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@ApiModelProperty(value = "项目结束时间")
	private Date smjssj;

	@ApiModelProperty(value = "项目类型")
	private String xmlx;

	@ApiModelProperty(value = "项目描述")
	private String xmms;

	@ApiModelProperty(value = "项目状态")
	private String xmzt;

	@ApiModelProperty(value = "记录创建时间")
	private Date createDate;

}