<template>
  <div class="sort-bar">
    <ul>
      <li>综合</li>
      <li>销量</li>
      <li>价格</li>
    </ul>
    <ul>
      <li><input placeholder="¥"></li>
      <li class="line">-</li>
      <li><input placeholder="¥"></li>
      <li><button type="button" class="sort-bar-button">确定</button></li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "SortBar"
}
</script>

<style scoped>
.sort-bar{
  background-color: #F5F5F5;
  overflow: hidden;
  height: 41px;
  border: 2px solid #E8E8E8;
}
.sort-bar ul{
  float: left;
  display: block;
  height: 100%;
}
.sort-bar li{
  list-style: none;
  float: left;
  height: 100%;
  text-align: center;
  line-height: 41px;
  width: 63px;
}
.sort-bar input{
  width: 50px;
  border: 0px;
  outline: none;
  height: 25px;
  border: 2px solid #E8E8E8;
}
.sort-bar .line{
  width: 6px;
}
.sort-bar-button{
  background-color: white;
  border: 1px solid #C3C4C5;
  height: 30px;
  width: 40px;
  outline: none;
  cursor:pointer;
}
</style>