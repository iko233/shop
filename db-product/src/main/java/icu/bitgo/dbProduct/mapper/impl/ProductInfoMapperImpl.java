package icu.bitgo.dbProduct.mapper.impl;


import icu.bitgo.dbProduct.pojo.Do.ProductInfo;
import icu.bitgo.dbProduct.mapper.ProductInfoMapper;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ProductInfoMapperImpl implements ProductInfoMapper {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void addProductInfo(ProductInfo productInfo) {
        mongoTemplate.save(productInfo);
    }

    @Override
    public ProductInfo getProductInfo(String id) {
        return  mongoTemplate.findById(id, ProductInfo.class);
    }
}
