<template>
  <nav-bar v-if="!hiddenNavBar" :title="title" :left="back" @left-click="handleClickLeft" />
  <section>
    <router-view>
      <template #default="{ Component, route }">
        <keep-alive v-if="route.meta.keepAlive">
          <component :is="Component" :key="route.fullPath" />
        </keep-alive>
        <component v-else :is="Component" :key="route.fullPath" />
      </template>
    </router-view>
  </section>
  <van-tabbar v-model="active">
    <van-tabbar-item name="home" icon="home-o">标签</van-tabbar-item>
    <van-tabbar-item name="search" icon="search">标签</van-tabbar-item>
    <van-tabbar-item name="friends" icon="friends-o">标签</van-tabbar-item>
    <van-tabbar-item name="setting" icon="setting-o">标签</van-tabbar-item>
  </van-tabbar>
</template>

<script setup lang="ts">
import NavBar from '@/components/navBar/NavBar.vue'
import { useRoute, useRouter } from 'vue-router'

const router = useRouter()
const route = useRoute()
const title = ref<string>('')
const back = ref<boolean>(false)
const hiddenNavBar = ref<boolean>(false)
const active = ref('home')

watchEffect(() => {
  title.value = route.meta.title || ''
  back.value = route.meta?.back || false
  hiddenNavBar.value = route.meta?.hidden || false
})

const handleClickLeft = () => {
  router.back()
}
</script>

<style scoped lang="less"></style>
