import { defineStore } from 'pinia'

interface AppState {
  sidebarCollapsed: boolean
  device: 'desktop' | 'tablet' | 'mobile'
}

export const useAppStore = defineStore('app', {
  state: (): AppState => {
    return {
      sidebarCollapsed: false,
      device: 'desktop',
    }
  },
  getters: {
    getSidebarCollapsed: (state) => state.sidebarCollapsed,
    getDevice: (state) => state.device,
  },
  actions: {
    setSidebarCollapsed(collapsed: boolean) {
      this.sidebarCollapsed = collapsed
    },
    setDevice(device: 'desktop' | 'tablet' | 'mobile') {
      this.device = device
    },
  },
})
