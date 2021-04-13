package icu.bitgo.dbProduct.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.bitgo.dbProduct.pojo.Do.CategoryMap;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CategoryMapMapper extends BaseMapper<CategoryMap> {
}
