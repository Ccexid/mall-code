<template>
  <el-tabs v-model="activeTab">
    <tab-pane label="用户手册" :key-value="1" icon="StarFilled">1111</tab-pane>
    <tab-pane label="实用联系人" :key-value="2" icon="StarFilled">2222</tab-pane>
    <tab-pane label="会议纪要" :key-value="3" icon="StarFilled">3333</tab-pane>
    <tab-pane label="管理处联系人" :key-value="4" icon="StarFilled">4444</tab-pane>
    <tab-pane label="房屋规则" :key-value="5" icon="StarFilled">5555</tab-pane>
    <tab-pane label="在线表格" :key-value="6" icon="StarFilled">6666</tab-pane>
    <tab-pane label="装修标准" :key-value="7" icon="StarFilled">7777</tab-pane>
  </el-tabs>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import TabPane from '@/components/TabPane/index.vue'

const activeTab = ref(1)
</script>

<style scoped></style>
