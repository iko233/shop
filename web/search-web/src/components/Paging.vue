<template>

    <div class="paging">
      <div :class="[{'page-button':(current!=1)},{'page-button page-forbidden':(current==1)}]"
           @click="setPage(current-1)">
        <svg t="1617724174715" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg"
             p-id="4124" width="30" height="30">
          <path
              d="M612.8 784c-8 0-16-3.2-22.4-9.6l-240-240c-12.8-12.8-12.8-32 0-44.8l240-240c12.8-12.8 32-12.8 44.8 0 12.8 12.8 12.8 32 0 44.8L417.6 512l217.6 217.6c12.8 12.8 12.8 32 0 44.8-6.4 6.4-14.4 9.6-22.4 9.6z"
              p-id="4125"></path>
        </svg>
      </div>
      <div class="page-button" v-if="current>6" @click="setPage(1)">
        1
      </div>
      <div class="page-button" v-if="current>6" @click="setPage(2)">
        2
      </div>
      <div class="page-slicer" v-show="current>6">…</div>
      <div :class="[{'page-button page-current page-forbidden':(current===page)},{'page-button':(current!==page)}]"
           v-for="page in pages"
           :key="page" @click="setPage(page)">
        {{ page }}
      </div>
      <div :class="[{'page-button':(current!=count)},{'page-button page-forbidden':(current==count)}]"
           @click="setPage(current+1)">
        <svg t="1617724241787" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg"
             p-id="4350" width="30" height="30">
          <path
              d="M412.8 784c-8 0-16-3.2-22.4-9.6-12.8-12.8-12.8-32 0-44.8l216-217.6-217.6-217.6c-12.8-12.8-12.8-32 0-44.8 12.8-12.8 32-12.8 44.8 0l240 240c12.8 12.8 12.8 32 0 44.8l-240 240c-4.8 6.4-12.8 9.6-20.8 9.6z"
              p-id="4351"></path>
        </svg>
      </div>
      <div class="page-info">
        共{{ count }}页,到第
        <input :placeholder="current" type="text" v-model="input" size="1" class="page-info-input">
        页
        <button @click="setPage(input)" type="button" class="page-info-button">确定</button>
      </div>
    </div>

</template>

<script>
export default {
  name: "Paging",
  data() {
    return {
      current: 9,
      total: 2800,
      count: 10,
      pages: [],
      input: undefined
    }
  },
  mounted() {
    this.initPage();
  },
  methods: {
    initPage() {
      this.count = this.total / 40;
      this.count = this.total % 40 > 0 ? this.count + 1 : this.count;
      let arr = new Array();
      if (this.count < 7) {
        for (let i = 1; i <= this.count; i++) {
          arr[i - 1] = i;
        }
      } else if (this.current < 7) {
        for (let i = 1; i <= 7; i++) {
          arr[i - 1] = i;
        }
      } else if (this.current >= this.count - 5) {
        for (let i = this.count - 5, j = 0; i <= this.count; i++, j++) {
          arr[j] = i;
        }
      } else {
        for (let i = this.current - 2, j = 0; i <= this.current + 2; i++, j++) {
          arr[j] = i;
        }
      }
      this.pages = arr;
    },
    setPage(page) {
      page = page - 0;
      if (page <= 0 || page > this.count || !page) return;
      this.current = page;
      this.initPage();
    }
  }
}


</script>

<style scoped>
.paging {
  display: inline-block;
  user-select: none;
  margin: auto;
  position: absolute;
  left: 50%;
  transform: translate(-50%,0);
}

.page-button {
  width: 30px;
  height: 30px;
  float: left;
  border: 2px solid #c3c4c5;
  margin-left: 5px;
  text-align: center;
  line-height: 30px;
  color: #6C6C6C;
  cursor: pointer;
  stroke: #6C6C6C;
  fill: #6C6C6C;

}

.page-button:hover {
  border: 2px solid red;
  color: red;
  stroke: red;
  fill: red;
}

.page-forbidden {
  color: #CCCCCC;
  stroke: #CCCCCC;
  fill: #CCCCCC;
}

.page-forbidden:hover {
  border: 2px solid #c3c4c5;
  color: #CCCCCC;
  cursor: default;
  stroke: #CCCCCC;
  fill: #CCCCCC;
}

.page-current {
  background-color: red;
  color: white;
  border: 2px solid red;
}

.page-slicer {
  height: 30px;
  float: left;
  text-align: center;
  line-height: 30px;
  margin-left: 5px;
}

.page-info {
  float: left;
  line-height: 35px;
  color: #999999;
  margin-left: 4px;
}

.page-info-input {
  border: 1px solid #C3C4C5;
  outline: none;
}

.page-info-button {
  background-color: white;
  border: 1px solid #C3C4C5;
  cursor:pointer;
  outline: none;
}
</style>