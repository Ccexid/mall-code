<template>
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

<script setup lang="ts"></script>

<style scoped lang="less"></style>
