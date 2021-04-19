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

package com.dkha.BusinessPro.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 请休假申请表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@Data
public class ZhyyQjsqbExcel {
    @Excel(name = "请休假申请ID")
    private Long zjid;
    @Excel(name = "人员ID")
    private Long ryid;
    @Excel(name = "请假开始时间")
    private Date qjkssj;
    @Excel(name = "请假结束时间")
    private Date qjjssj;
    @Excel(name = "请假事由")
    private String qjsy;
    @Excel(name = "请假类型")
    private String qjlx;
    @Excel(name = "外出联系人")
    private String wclxr;
    @Excel(name = "家庭联系人")
    private String jtlxr;
    @Excel(name = "离校去向")
    private String lxqx;
    @Excel(name = "行程信息")
    private String xcxx;
    @Excel(name = "审核状态")
    private String shzt;
    @Excel(name = "审核时间")
    private Date sqsj;
    @Excel(name = "记录创建时间")
    private Date createDate;

}