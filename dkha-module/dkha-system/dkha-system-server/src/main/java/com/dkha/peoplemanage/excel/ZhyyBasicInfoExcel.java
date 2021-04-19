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

package com.dkha.peoplemanage.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-16
 */
@Data
public class ZhyyBasicInfoExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "姓名")
    private String xm;
    @Excel(name = "学号")
    private String xh;
    @Excel(name = "密码")
    private String mm;
    @Excel(name = "性别")
    private String xb;
    @Excel(name = "出生日期")
    private Date csrq;
    @Excel(name = "身份证号")
    private String sfzh;
    @Excel(name = "手机号码")
    private String sjhm;
    @Excel(name = "电子邮件")
    private String dzyj;
    @Excel(name = "院系")
    private String yx;
    @Excel(name = "年级")
    private String nj;
    @Excel(name = "班级")
    private String bj;
    @Excel(name = "权限等级")
    private String qxdj;
    @Excel(name = "创建时间")
    private Date cjsj;
    @Excel(name = "最后修改时间")
    private Date zhxgsj;

}