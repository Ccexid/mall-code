<template>
  <el-tab-pane
    :label="label"
    :name="keyValue"
    :disabled="disabled"
    :closable="closable"
    :lazy="lazy"
  >
    <template #label>
      <slot name="label">
        <span class="custom-tabs__label">
          <el-icon v-if="icon">
            <component :is="icon" />
          </el-icon>
          <span>{{ label }}</span>
        </span>
      </slot>
    </template>
    <slot name="default" />
  </el-tab-pane>
</template>
<script setup lang="ts">
import type { TabPaneProps } from '@/components/TabPane/tabPane.ts'

const {
  icon,
  label,
  keyValue,
  disabled = false,
  closable = false,
  lazy = false
} = defineProps<TabPaneProps>()
defineOptions({
  name: 'TabPane',
})
</script>

<style scoped lang="less">
.custom-tabs__label {
  margin: 0 8px;

  .el-icon {
    vertical-align: middle;
  }

  span {
    vertical-align: middle;
    margin-left: 4px;
  }
}
</style>
