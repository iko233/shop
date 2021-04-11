<template>
  <div class="product-info-container">
    <div class="product-info-img">
      <img src="../assets/logo.png" width="400" height="400">
    </div>
    <div class="product-info">
      <div class="product-info-title">
        <strong>
          商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题 商品标题
        </strong>
      </div>
      <div class="product-info-warning">
        活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动活动
      </div>
      <div class="product-info-price-warp">
        <div class="product-info-price">
          <span class="product-info-price-discount-title">盗&nbsp;宝&nbsp;价</span>
          <span class="product-info-price-discount-icon">
            ¥
            <span class="product-info-price-discount">
              <strong>233.33</strong>
            </span>
          </span>
          <span class="product-info-price-count">[<del>¥<span>23.33</span></del>]</span>
        </div>
      </div>
      <div class="product-info-color-warp">
        商品颜色
        <colorCard/>
      </div>
    </div>
  </div>
</template>

<script>
import ColorCard from "@/components/ColorCard";

export default {
  name: "productInfo",
  components: {ColorCard}
}
</script>

<style scoped>
.product-info-container {
  height: 550px;
  margin-top: 5px;
}

.product-info-img {
  float: left;
  width: 400px;
}

.product-info-img img {
  border: #E7E7E7 solid 1px;
}

.product-info {
  float: left;
  margin-left: 30px;
  margin-right: 20px;
  width: 740px;
}

.product-info-title {
  color: #666666;
  width: 100%;
  height: 1.5rem;
  overflow: hidden;
  font-size: larger;
}

.product-info-warning {
  color: red;
  overflow: hidden;
  width: 100%;
  height: 1.5rem;
}

.product-info-price-warp {
  width: 100%;

  background-color: #F3F3F3;
  padding: 10px;
  display: inline-block;
}

.product-info-price-discount {
  color: red;
  font-size: x-large;
}

.product-info-price-discount-title {
  color: #999999;

}

.product-info-price-discount-icon {
  color: red;
}

.product-info-price-count {
  font-size: smaller;
}
</style>
