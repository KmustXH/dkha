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

package com.dkha.kaoqin.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 考勤统计表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@Data
public class ZhyyKqtjbExcel {
    @Excel(name = "考勤统计表ID")
    private Integer kqtjbid;
    @Excel(name = "人员ID")
    private Long ryid;
    @Excel(name = "应出勤天数")
    private String ycqts;
    @Excel(name = "实际出勤天数")
    private String sjcqts;
    @Excel(name = "漏打卡次数")
    private String ldkcs;
    @Excel(name = "请假天数")
    private String qjts;
    @Excel(name = "出差天数")
    private String ccts;
    @Excel(name = "记录创建时间")
    private Date createDate;

}