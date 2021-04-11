package icu.bitgo.dbProduct.service.impl;

import icu.bitgo.dbProduct.domain.Product;
import icu.bitgo.dbProduct.domain.ProductInfo;
import icu.bitgo.dbProduct.mapper.ProductInfoMapper;
import icu.bitgo.dbProduct.mapper.ProductMapper;
import icu.bitgo.dbProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductInfoMapper productInfoMapper;
    private ProductMapper productMapper;

    @Autowired
    public void  setProductInfoMapper(ProductInfoMapper productInfoMapper){
        this.productInfoMapper=productInfoMapper;
    }

    @Autowired
    public void  setProductMapper(ProductMapper productMapper){
        this.productMapper=productMapper;
    }

    @Override
    @Transactional
    public String addProduct() {
        Product product = new Product();
        product.setClick(1)
                .setDiscount(1)
                .setFreight(1)
                .setSell(1)
                .setSellPrice(1)
                .setSeller("1")
                .setStatus(1)
                .setTitle("1");
        productMapper.insert(product);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        productInfoMapper.addProductInfo(
                new ProductInfo()
                    .setInfoBody("1")
                    .setBigPic(strings)
                    .setParameter(new HashMap<>())
                    .setId(product.getId())
        );
        return "233";
    }
}
