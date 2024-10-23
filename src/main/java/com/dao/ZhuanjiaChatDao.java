package com.dao;

import com.entity.ZhuanjiaChatEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiaChatView;

/**
 * 专家咨询 Dao 接口
 *
 * @author 
 */
public interface ZhuanjiaChatDao extends BaseMapper<ZhuanjiaChatEntity> {

   List<ZhuanjiaChatView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
