<!-- eslint-disable @typescript-eslint/no-explicit-any -->
<template>
  <van-config-provider :theme="theme">
    <router-view></router-view>
  </van-config-provider>
</template>

<script setup lang="ts">
import type { ConfigProviderTheme } from 'vant/lib/config-provider/ConfigProvider'

const theme = ref<ConfigProviderTheme>('light')
</script>

<style scoped></style>
