<template>
  <nav>
    <div class="header-logout">
      <div>
        left
      </div>
      <div>
        <ul>
          <li>我的盗宝</li>
          <li>购物车</li>
          <li>收藏夹</li>
          <li>商品分类</li>
          <li>免费开店</li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  name: "Nav"
}
</script>

<style scoped>
nav {
  background-color: #F5F5F5;
  height: 36px;
  width: 100%;
  z-index: 10000000000;
}

.header-logout {
  width: 1190px;
  margin: auto;
  padding: 0px;
  height: 100%;
}

.header-logout > :nth-child(1) {
  float: left;
}

.header-logout > :nth-child(2) {
  float: right;
  padding: 0px;
  height: 100%;
  margin: 0px;
}

.header-logout ul {
  margin: 0px;
  height: 100%;
}

.header-logout li {
  list-style: none;
  margin-left: 3px;
  margin-top: 0px;
  margin-right: 0px;
  display: inline-block;
  height: 100%;
  line-height: 36px;
  font-family: "Arial", "Microsoft YaHei", "黑体", "宋体", sans-serif;
  color: #6C6C6C;
}
</style>