import { createApp } from 'vue'
import { createPinia } from 'pinia'
import './assets/styles/index.css'
import 'vant/es/toast/style'
import 'vant/es/dialog/style'
import 'vant/es/dialog/style'
import 'vant/es/image-preview/style'
import App from './App.vue'
import router from './router/index.ts'

const app = createApp(App)
app.use(createPinia())
app.use(router)
app.mount('#app')
