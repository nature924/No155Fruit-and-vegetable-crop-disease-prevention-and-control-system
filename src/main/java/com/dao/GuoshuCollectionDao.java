package com.dao;

import com.entity.GuoshuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuoshuCollectionView;

/**
 * 果蔬百科收藏 Dao 接口
 *
 * @author 
 */
public interface GuoshuCollectionDao extends BaseMapper<GuoshuCollectionEntity> {

   List<GuoshuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
