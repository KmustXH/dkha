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

package com.dkha.BusinessPro.controller;


import com.dkha.BusinessPro.excel.ZhyyQjsqbExcel;
import com.dkha.BusinessPro.service.ZhyyQjsqbService;
import com.dkha.commons.tools.constant.Constant;
import com.dkha.commons.tools.excel.ExcelUtils;
import com.dkha.commons.tools.page.PageData;
import com.dkha.commons.tools.utils.Result;
import com.dkha.commons.tools.validator.AssertUtils;
import com.dkha.commons.tools.validator.ValidatorUtils;
import com.dkha.commons.tools.validator.group.AddGroup;
import com.dkha.commons.tools.validator.group.DefaultGroup;
import com.dkha.commons.tools.validator.group.UpdateGroup;
import com.dkha.dto.ZhyyQjsqbDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 请休假申请表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@RestController
@RequestMapping("qjsq")
@Api(tags="请休假申请表")
public class ZhyyQjsqbController {
    @Autowired
    private ZhyyQjsqbService zhyyQjsqbService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    public Result<PageData<ZhyyQjsqbDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<ZhyyQjsqbDTO> page = zhyyQjsqbService.page(params);

        return new Result<PageData<ZhyyQjsqbDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    public Result<ZhyyQjsqbDTO> get(@PathVariable("id") String id){
        ZhyyQjsqbDTO data = zhyyQjsqbService.get(id);

        return new Result<ZhyyQjsqbDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    public Result save(@RequestBody ZhyyQjsqbDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        zhyyQjsqbService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    public Result update(@RequestBody ZhyyQjsqbDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        zhyyQjsqbService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    public Result delete(@RequestBody String[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        zhyyQjsqbService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<ZhyyQjsqbDTO> list = zhyyQjsqbService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, ZhyyQjsqbExcel.class);
    }

}