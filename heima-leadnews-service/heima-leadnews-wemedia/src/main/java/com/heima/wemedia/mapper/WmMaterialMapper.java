package com.heima.wemedia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WmMaterialMapper extends BaseMapper<WmMaterial> {
    void saveRelations(@Param("materialIds") List<Integer> materialIds, @Param("newsId") Integer newsId, @Param("type")Short type);
}