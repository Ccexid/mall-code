package com.ccexid.core.configuration;

import com.mybatisflex.core.FlexGlobalConfig;
import com.mybatisflex.core.audit.AuditManager;
import com.mybatisflex.spring.boot.MyBatisFlexCustomizer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@Slf4j
@AutoConfiguration
public class MyBatisFlexConfiguration implements MyBatisFlexCustomizer {
        /**
     * 自定义Flex全局配置
     *
     * @param flexGlobalConfig Flex全局配置对象，用于配置Flex相关的全局参数
     */
    @Override
    public void customize(FlexGlobalConfig flexGlobalConfig) {
        log.info("MyBatisFlexConfiguration.customize");
        // 开启审计功能
        AuditManager.setAuditEnable(true);
        AuditManager.setMessageCollector(auditMessage -> {
            log.info("{},{}ms", auditMessage.getFullSql(), auditMessage.getElapsedTime());
        });
    }

}
