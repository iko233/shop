<template>
  <div>
    <Nav/>
    <main>
      <Search/>
      <ClassifyNav/>
      <product-info/>
    </main>
  </div>
</template>

<script>
import Nav from "@/components/Nav";
import Search from "@/components/Search";
import ClassifyNav from "@/components/ClassifyNav";
import ProductInfo from "@/components/ProductInfo";
export default {
  name: "index",
  components: {ProductInfo, ClassifyNav, Search, Nav}
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