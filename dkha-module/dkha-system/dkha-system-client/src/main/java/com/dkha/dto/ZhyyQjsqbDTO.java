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
 * 请休假申请表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@Data
@ApiModel(value = "请休假申请表")
public class ZhyyQjsqbDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "请休假申请ID")
	private Long zjid;

	@ApiModelProperty(value = "人员ID")
	private Long ryid;

	@ApiModelProperty(value = "请假开始时间")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date qjkssj;

	@ApiModelProperty(value = "请假结束时间")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date qjjssj;

	@ApiModelProperty(value = "请假事由")
	private String qjsy;

	@ApiModelProperty(value = "请假类型")
	private String qjlx;

	@ApiModelProperty(value = "外出联系人")
	private String wclxr;

	@ApiModelProperty(value = "家庭联系人")
	private String jtlxr;

	@ApiModelProperty(value = "离校去向")
	private String lxqx;

	@ApiModelProperty(value = "行程信息")
	private String xcxx;

	@ApiModelProperty(value = "审核状态")
	private String shzt;

	@ApiModelProperty(value = "审核时间")
	private Date sqsj;

	@ApiModelProperty(value = "记录创建时间")
	private Date createDate;

}