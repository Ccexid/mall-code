<!-- eslint-disable @typescript-eslint/no-explicit-any -->
<template>
  <el-tabs v-model="activeTab">
    <tab-pane label="用户手册" :key-value="1" icon="StarFilled">
      <tab-body :fieldList="exampleForm.base" :model="model" @submit="handleBaseSubmit"
        >111</tab-body
      >
    </tab-pane>
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
import TabBody from '@/components/TabBody/index.vue'

const activeTab = ref(1)

// eslint-disable-next-line @typescript-eslint/no-explicit-any
const model = ref<Record<string, any>>({
  name: '张三',
  gender: 1,
  hobbies: [1],
  job: 3,
  readonly: '只读输入框',
  summary: '尤雨溪懂个锤子vue是什么梗',
})
/**
 * 注意： model数据模型非必填项，如果仅仅是用于数据收集，model参数可以不用填，表单的submit事件会返回所有搜集的数据对象
 *       如果是编辑的情况下，页面需要回显数据，则model数据模型必须要填写
 */
// eslint-disable-next-line @typescript-eslint/no-explicit-any
const handleBaseSubmit = (model: Record<string, any>) => {
  console.log(model)
}
// // 自定义验证表单配置数据
// 表单配置示例
const exampleForm: Record<string, Form.FieldItem[]> = {
  base: [
    { label: '姓名', field: 'name', disabled: true },
    {
      label: '性别',
      field: 'gender',
      type: 'radio',
      options: {
        data: [
          { label: '男', value: 1 },
          { label: '女', value: 0 },
        ],
      },
    },
    {
      label: '爱好',
      field: 'hobbies',
      type: 'checkbox',
      options: {
        data: [
          { label: '吃饭', value: 1 },
          { label: '睡觉', value: 2 },
          { label: '写代码', value: 3 },
        ],
      },
    },
    {
      label: '工作',
      field: 'job',
      type: 'select',
      options: {
        data: [
          { label: '吃饭', value: 1 },
          { label: '睡觉', value: 2 },
          { label: '写代码', value: 3 },
        ],
      },
    },
    { label: '密码', field: 'password', type: 'password', placeholder: '这是一个密码输入框' },
    { label: '只读', field: 'readonly', readonly: true, placeholder: '这是一个只读输入框' },
    { label: '留言板', field: 'summary', type: 'textarea', placeholder: '留言板' },
  ],
}
</script>

<style scoped></style>
