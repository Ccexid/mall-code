<template>
  <van-nav-bar
    :title="title"
    :left-arrow="left"
    @click-left="handleClickLeft"
    @click-right="handleClickRight"
    :safe-area-inset-top="true"
  >
    <template #left>
      <van-icon name="arrow-left" />
    </template>
    <template #right>
      <slot name="right"></slot>
    </template>
  </van-nav-bar>
</template>

<script setup lang="ts">
defineOptions({ name: 'NavBar' })
const { title, left } = defineProps({
  title: {
    type: String,
    default: '',
  },
  left: {
    type: Boolean,
    default: true,
  },
})
const emit = defineEmits(['left-click', 'right-click'])

const handleClickLeft = (e: MouseEvent) => {
  emit('left-click', e)
}
const handleClickRight = (e: MouseEvent) => {
  emit('right-click', e)
}
</script>

<style scoped lang="less"></style>
