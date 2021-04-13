package icu.bitgo.dbProduct.pojo.Do;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_product")
public class Product {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String title;
    @TableField("sell_price")
    private float sellPrice;
    private float discount;
    private int status;
    private float freight;
    private int click;
    private int sell;
    private String seller;
}
