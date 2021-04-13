package icu.bitgo.api.product.service;

import icu.bitgo.api.product.pojo.To.ProductInfoTransport;
import icu.bitgo.entity.common.BaseResponse;

public interface ProductDBService {
    BaseResponse<ProductInfoTransport> getProductInfo(String id);
}
