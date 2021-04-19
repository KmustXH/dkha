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

package com.dkha.peoplemanage.dao;


import com.dkha.commons.mybatis.dao.BaseDao;
import com.dkha.dto.ZhyyBasicInfoDTO;
import com.dkha.peoplemanage.entity.ZhyyBasicInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-16
 */
@Mapper
public interface ZhyyBasicInfoDao extends BaseDao<ZhyyBasicInfoEntity> {

    @Select("select * from zhyy_basic_info where xm = #{name}")
    public ZhyyBasicInfoEntity findUserByName(String name);

}