<template>
  <div id="app">
    <Nav/>
    <main>
      <Search/>
      <product-title/>
      <SortBar/>
      <div class="item row">
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
        <ItemCard/>
      </div>
      <Paging/>
    </main>
  </div>
</template>

<script>
import Nav from '@/components/Nav.vue'
import Search from '@/components/Search.vue'
import ProductTitle from "@/components/ProductTitle";
import SortBar from "@/components/SortBar";
import ItemCard from "@/components/ItemCard";
import Paging from "@/components/Paging";

export default {
  name: 'App',
  components: {
    Paging,
    ItemCard,
    SortBar,
    ProductTitle,
    Nav,
    Search
  }
}
</script>

<style>
main {
  margin: auto;
  width: 1190px;
}
.item{
  margin-top: 5px;
}
* {
  padding: 0px;
  margin: 0px;
}
.row {
  overflow: hidden;
}
</style>
