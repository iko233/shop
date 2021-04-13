package icu.bitgo.dbProduct.pojo.Do;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_categoory_map")
public class CategoryMap {
    private String id;
    private String productId;
    private int categoryId;
}
