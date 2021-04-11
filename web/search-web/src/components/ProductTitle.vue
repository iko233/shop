<template>
  <div>
    <div class="all-product">所有商品</div>
    <div class="bar"/>
  </div>
</template>

<script>
export default {
  name: "ProductTitle"
}
</script>

<style scoped>
.all-product {
  background: red;
  width: 104px;
  height: 38px;
  color: white;
  text-align: center;
  line-height: 38px;
}

.bar {
  background: red;
  height: 3px;
  width: 100%;
}
</style>