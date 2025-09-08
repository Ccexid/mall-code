import { createRouter, createWebHistory, type RouteRecordRaw } from 'vue-router'

const AppLayout = () => import('@/layout/AppLayout.vue')

export const constantRoutes: RouteRecordRaw[] = [
  {
    path: '/',
    name: 'Home',
    redirect: '/dashboard',
    component: AppLayout,
    children: [
      {
        path: '/dashboard',
        name: 'Dashboard',
        component: () => import('@/views/dashboard/DashboardViews.vue'),
        meta: {
          title: 'Dashboard',
          icon: 'HomeFilled',
        },
      },
    ],
  },
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: constantRoutes,
})

export default router
