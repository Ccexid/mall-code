import { createApp } from 'vue'
import { createPinia } from 'pinia'
import './assets/styles/index.css'
import 'vant/es/toast/style'
import 'vant/es/dialog/style'
import 'vant/es/dialog/style'
import 'vant/es/image-preview/style'
import App from './App.vue'
import router from './router/index.ts'
import { ConfigProvider } from 'vant'
import { Icon } from 'vant';

const app = createApp(App)
app.use(createPinia())
app.use(ConfigProvider)
app.use(Icon)
app.use(router)
app.mount('#app')
