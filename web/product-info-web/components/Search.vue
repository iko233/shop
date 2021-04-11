<template>
  <div class="search-logout">
    <a class="logo" href="/">
      <img src="../assets/logo.png">
    </a>
    <div class="search-wraper">
      <div class="classify">
        <ul>
          <li class="selected">商品</li>
        </ul>
      </div>
      <div class="input">
        <input placeholder="请输入要搜索的词">
      </div>
      <a>
        <div class="submit"><strong>提交</strong></div>
      </a>
    </div>

  </div>
</template>

<script>
export default {
  name: "Search"
}
</script>

<style scoped>
.search-logout {
  width: 1190px;
  margin-top: 10px;
  overflow: hidden;
  margin-bottom: 5px;
}

.search-wraper {
  margin-top: 13px;
  float: right;
  border: 2px solid red;
  display: inline-block;
  height: 35px;
}

.search-wraper .classify {
  float: left;
  height: 35px;
  width: 67px;
  color: #6B6B6B;
  text-align: center;
}

.search-wraper .classify li {
  list-style: none;
  display: block;
  height: 35px;
  width: 100%;
  line-height: 35px;
}

.search-wraper .classify .selected {
  background: #F5F5F5;
}

.search-wraper .input {
  float: left;
  width: 660px;
}

.search-wraper .input input {
  width: 100%;
  border: 0px;
  height: 35px;
  outline: none;
}

.search-wraper .submit {
  float: left;
  background: red;
  color: white;
  width: 80px;
  height: 35px;
  text-align: center;
  line-height: 35px;

}
.search-wraper .submit:hover{
  background: #FF4400;
}


</style>