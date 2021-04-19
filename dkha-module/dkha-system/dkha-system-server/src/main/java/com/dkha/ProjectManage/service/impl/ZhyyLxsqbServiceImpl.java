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

package com.dkha.ProjectManage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import com.dkha.ProjectManage.dao.ZhyyLxsqbDao;
import com.dkha.ProjectManage.entity.ZhyyLxsqbEntity;
import com.dkha.ProjectManage.redis.ZhyyLxsqbRedis;
import com.dkha.ProjectManage.service.ZhyyLxsqbService;
import com.dkha.commons.mybatis.service.impl.BaseServiceImpl;
import com.dkha.commons.tools.constant.Constant;
import com.dkha.commons.tools.page.PageData;
import com.dkha.commons.tools.utils.ConvertUtils;
import com.dkha.dto.ZhyyLxsqbDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 立项申请表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
@Service
public class ZhyyLxsqbServiceImpl extends BaseServiceImpl<ZhyyLxsqbDao, ZhyyLxsqbEntity> implements ZhyyLxsqbService {
    @Autowired
    private ZhyyLxsqbRedis zhyyLxsqbRedis;

    @Override
    public PageData<ZhyyLxsqbDTO> page(Map<String, Object> params) {
        IPage<ZhyyLxsqbEntity> page = baseDao.selectPage(
                getPage(params, Constant.CREATE_DATE, false),
                getWrapper(params)
        );

        return getPageData(page, ZhyyLxsqbDTO.class);
    }

    @Override
    public List<ZhyyLxsqbDTO> list(Map<String, Object> params) {
        List<ZhyyLxsqbEntity> entityList = baseDao.selectList(getWrapper(params));

        return ConvertUtils.sourceToTarget(entityList, ZhyyLxsqbDTO.class);
    }

    private QueryWrapper<ZhyyLxsqbEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ZhyyLxsqbEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);
        //wrapper.eq(Constant.DEL_FLAG, DelFlagEnum.NORMAL.value());

        return wrapper;
    }

    @Override
    public ZhyyLxsqbDTO get(String id) {
        ZhyyLxsqbEntity entity = baseDao.selectById(id);

        return ConvertUtils.sourceToTarget(entity, ZhyyLxsqbDTO.class);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(ZhyyLxsqbDTO dto) {
        ZhyyLxsqbEntity entity = ConvertUtils.sourceToTarget(dto, ZhyyLxsqbEntity.class);

        insert(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(ZhyyLxsqbDTO dto) {
        ZhyyLxsqbEntity entity = ConvertUtils.sourceToTarget(dto, ZhyyLxsqbEntity.class);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String[] ids) {
        //逻辑删除
        //logicDelete(ids, ZhyyLxsqbEntity.class);

        //物理删除
        baseDao.deleteBatchIds(Arrays.asList(ids));
    }

}