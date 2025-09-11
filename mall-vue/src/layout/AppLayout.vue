<template>
  <nav-bar :title="title" @left-click="handleClickLeft" />
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
</template>

<script setup lang="ts">
import NavBar from '@/components/navBar/NavBar.vue'
import { useRoute, useRouter } from 'vue-router'

const router = useRouter()
const route = useRoute()
const title = ref<string>('')

watchEffect(() => {
  title.value = route.meta.title || ''
})

const handleClickLeft = () => {
  router.back()
}
</script>

<style scoped lang="less"></style>
