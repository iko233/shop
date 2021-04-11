package icu.bitgo.dbProduct.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.bitgo.dbProduct.domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CategoryMapper extends BaseMapper<Category> {
}
