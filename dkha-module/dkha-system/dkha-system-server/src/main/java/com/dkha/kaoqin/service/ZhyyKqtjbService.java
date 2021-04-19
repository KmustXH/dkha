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

package com.dkha.kaoqin.service;



import com.dkha.commons.mybatis.service.BaseService;
import com.dkha.commons.tools.page.PageData;
import com.dkha.dto.ZhyyKqtjbDTO;
import com.dkha.kaoqin.entity.ZhyyKqtjbEntity;

import java.util.List;
import java.util.Map;

/**
 * 考勤统计表
 *
 * @author Mark sunlightcs@gmail.com
 * @since v1.0.0 2021-04-19
 */
public interface ZhyyKqtjbService extends BaseService<ZhyyKqtjbEntity> {

    PageData<ZhyyKqtjbDTO> page(Map<String, Object> params);

    List<ZhyyKqtjbDTO> list(Map<String, Object> params);

    ZhyyKqtjbDTO get(String id);

    void save(ZhyyKqtjbDTO dto);

    void update(ZhyyKqtjbDTO dto);

    void delete(String[] ids);
}