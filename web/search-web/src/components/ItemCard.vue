<template>
  <div class="item-card">
    <a>
      <img src="../assets/logo.png" width="270" height="270">
    </a>
    <div class="row">
      <div class="price">
        <strong>¥23.33</strong>
      </div>
      <div class="sales">
        233人已购买
      </div>
    </div>
    <div class="row">
      <div class="title">
        <a>标题sdasdasda asdasfdfs asdasd hdfgnmnkujafmsadasdasfdasfsssk;dlfm;</a>
      </div>
    </div>
    <div class="row">
      <div class="seller">
        <a>商家名</a>
      </div>
      <div class="talk">
        <svg t="1617593882600" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2102" width="15" height="15"><path d="M512 64c264.8 0 480 200.288 480 448 0 247.68-215.2 448-479.904 448a504.416 504.416 0 0 1-238.528-59.104l-16.832-9.024-103.04 43.936a32 32 0 0 1-44.288-33.536l0.64-3.488 26.144-107.552-11.2-14.208-6.4-8.256C62.208 693.6 32 604.608 32 512 32 264.32 247.2 64 512 64z m0 64C281.568 128 96 300.704 96 512c0 78.624 25.6 154.176 73.504 217.984l5.952 7.68 20.672 26.208a32 32 0 0 1 5.952 27.36l-14.752 60.64 58.432-24.896a32 32 0 0 1 23.904-0.48l3.776 1.728 30.304 16.224A440.416 440.416 0 0 0 512 896c230.432 0 416-172.704 416-384S742.432 128 512 128z m-176 320a48 48 0 0 1 4.608 95.776L336 544a48 48 0 0 1-4.608-95.776L336 448z m384 0a48 48 0 0 1 4.608 95.776L720 544a48 48 0 0 1-4.608-95.776L720 448z m-192 0a48 48 0 0 1 4.608 95.776L528 544a48 48 0 0 1-4.608-95.776L528 448z" p-id="2103" fill="#1C9EFF"></path></svg>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ItemCard"
}
</script>

<style scoped>
.item-card {
  width: 270px;
  height: 385px;
  border: 2px solid #EDEDED;
  float: left;
  margin: 11px;
}
.item-card:hover{
  box-shadow: 1px 1px 3px #6C6C6C;
}


.price {
  color: red;
  float: left;
  font-size: x-large;
  margin-left: 5px;
}

.sales {
  float: right;
  font-size: small;
  margin-top: 9px;
  color: #978888;
  margin-right: 5px;
}

.title {
  float: left;
  margin-left: 5px;
  margin-top: 7px;
  overflow: hidden;
  width: 100%;
  height: 35px;
  font-size: smaller;
}

.seller {
  float: left;
  margin-left: 5px;
  margin-top: 10px;
  font-size: smaller;
}

.talk{
  float: right;
  margin-top: 10px;
  margin-right: 5px;
}

img{
  border: 0px;
  outline: none;
}
</style>