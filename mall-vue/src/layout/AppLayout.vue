<template>
  <section>
    <router-view>
      <template #default="{ Component, route }">
        <component :is="Component" :key="route.fullPath" />
      </template>
    </router-view>
  </section>
</template>

<script setup lang="ts"></script>

<style scoped></style>
