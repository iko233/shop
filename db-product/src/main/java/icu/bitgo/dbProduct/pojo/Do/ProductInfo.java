package icu.bitgo.dbProduct.pojo.Do;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "product_info_collection")
public class ProductInfo {
    @Id
    private String id;

    private List<String> bigPic;

    private Map<String,String> parameter;

    private String infoBody;
}
