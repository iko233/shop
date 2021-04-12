package icu.bitgo.dbProduct.service;

import icu.bitgo.api.product.service.StatisticsService;
import org.apache.dubbo.config.annotation.DubboService;



@DubboService(version = "0.0.1")
public class StatisticsImpl implements StatisticsService {
    @Override
    public Integer getSellerCount() {
        return 1;
    }
}
