package icu.bitgo.api.product.pojo.To;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProductInfoTransport implements Serializable {
    private String id;
    private String title;
    private float sellPrice;
    private float discount;
    private int status;
    private float freight;
    private int click;
    private int sell;
    private String seller;
    private List<String> bigPic;
    private Map<String,String> parameter;
    private String infoBody;
}
