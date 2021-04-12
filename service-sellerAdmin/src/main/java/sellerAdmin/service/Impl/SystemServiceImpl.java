package sellerAdmin.service.Impl;

import icu.bitgo.api.product.service.StatisticsService;
import icu.bitgo.entity.common.BaseResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import sellerAdmin.service.SystemService;

@DubboService(version = "0.0.1")
@Service
public class SystemServiceImpl implements SystemService {
    @DubboReference(version = "0.0.1")
    private StatisticsService statisticsService;

    @Override
    public BaseResponse<Integer> getCount() {
        BaseResponse<Integer> integerBaseResponse = new BaseResponse<>();
        integerBaseResponse.setBody(statisticsService.getSellerCount());
        return integerBaseResponse;
    }
}
