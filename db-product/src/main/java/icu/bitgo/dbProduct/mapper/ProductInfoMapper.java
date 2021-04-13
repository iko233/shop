package icu.bitgo.dbProduct.mapper;


import icu.bitgo.dbProduct.pojo.Do.ProductInfo;

public interface ProductInfoMapper {
    void addProductInfo(ProductInfo productInfo);
    ProductInfo getProductInfo(String id);
}
