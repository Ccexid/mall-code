package com.ccexid.core.configuration;

import com.mybatisflex.core.audit.AuditManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;

@Slf4j
@AutoConfiguration
public class MyBatisFlexConfiguration {

        public MyBatisFlexConfiguration() {
        log.info("MyBatisFlexConfiguration.customize");
        // 开启审计功能
        AuditManager.setAuditEnable(true);
        AuditManager.setMessageCollector(auditMessage -> {
            log.info("{},{}ms", auditMessage.getFullSql(), auditMessage.getElapsedTime());
        });
    }
}
