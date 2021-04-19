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

package com.dkha.peoplemanage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dkha.commons.mybatis.service.impl.BaseServiceImpl;
import com.dkha.commons.tools.constant.Constant;
import com.dkha.commons.tools.page.PageData;
import com.dkha.commons.tools.utils.ConvertUtils;
import com.dkha.dto.ZhyyBasicInfoDTO;
import com.dkha.peoplemanage.dao.ZhyyBasicInfoDao;
import com.dkha.peoplemanage.entity.ZhyyBasicInfoEntity;
import com.dkha.peoplemanage.service.ZhyyBasicInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-16
 */
@Service
public class ZhyyBasicInfoServiceImpl extends BaseServiceImpl<ZhyyBasicInfoDao, ZhyyBasicInfoEntity> implements ZhyyBasicInfoService {
    @Override
    public PageData<ZhyyBasicInfoDTO> page(Map<String, Object> params) {
        IPage<ZhyyBasicInfoEntity> page = baseDao.selectPage(
                getPage(params, Constant.CREATE_DATE, false),
                getWrapper(params)
        );

        return getPageData(page, ZhyyBasicInfoDTO.class);
    }

    @Override
    public List<ZhyyBasicInfoDTO> list(Map<String, Object> params) {
        List<ZhyyBasicInfoEntity> entityList = baseDao.selectList(getWrapper(params));

        return ConvertUtils.sourceToTarget(entityList, ZhyyBasicInfoDTO.class);
    }

    private QueryWrapper<ZhyyBasicInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ZhyyBasicInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);
        //wrapper.eq(Constant.DEL_FLAG, DelFlagEnum.NORMAL.value());

        return wrapper;
    }

    @Override
    public ZhyyBasicInfoDTO get(String id) {
        ZhyyBasicInfoEntity entity = baseDao.selectById(id);

        return ConvertUtils.sourceToTarget(entity, ZhyyBasicInfoDTO.class);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(ZhyyBasicInfoDTO dto) {
        ZhyyBasicInfoEntity entity = ConvertUtils.sourceToTarget(dto, ZhyyBasicInfoEntity.class);

        insert(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(ZhyyBasicInfoDTO dto) {
        ZhyyBasicInfoEntity entity = ConvertUtils.sourceToTarget(dto, ZhyyBasicInfoEntity.class);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String[] ids) {
        //逻辑删除
        //logicDelete(ids, ZhyyBasicInfoEntity.class);

        //物理删除
        baseDao.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public ZhyyBasicInfoDTO findUserByName(String name) {
        ZhyyBasicInfoEntity entity = baseDao.findUserByName(name);
        return ConvertUtils.sourceToTarget(entity, ZhyyBasicInfoDTO.class);
    }
}