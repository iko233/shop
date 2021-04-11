<template>
  <div class="classify-nav">
    <ul>
      <li>首页</li>
      <li>全部商品</li>
      <li>商品分类</li>
    </ul>
    <div class="classify-nav-search">
      <div class="classify-nav-search-click">
        <strong>确定</strong>
      </div>
      <input type="text" placeholder="在本店搜索">
    </div>
  </div>
</template>

<script>
export default {
  name: "ClassifyNav"
}
</script>

<style scoped>
.classify-nav {
  height: 40px;
  text-align: center;
  line-height: 40px;
  background-color: #F2F2F2;
}

.classify-nav ul {
  float: left;
}

.classify-nav li {
  float: left;
  list-style: none;
  margin-left: 5px;
}

.classify-nav-search {
  float: right;
  margin-right: 10px;
}

.classify-nav-search-click {
  float: right;
  width: 50px;
  height: 30px;
  line-height: 30px;
  margin-top: 5px;
  background-color: red;
  color: white;
  cursor: pointer;
}

.classify-nav input {
  float: right;
  height: 28px;
  margin-top: 5px;
  border: #E7E7E7 solid 1px;
  outline: none;
}
</style>