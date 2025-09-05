package com.ccexid.core.configuration;

import com.mybatisflex.core.FlexGlobalConfig;
import com.mybatisflex.core.audit.AuditManager;
import com.mybatisflex.spring.boot.MyBatisFlexCustomizer;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.Configuration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@Slf4j
@AutoConfiguration
public class MyBatisFlexConfiguration implements MyBatisFlexCustomizer {
    /**
     * 自定义Flex全局配置
     *
     * @param configuration Flex全局配置对象，用于配置Flex相关的全局参数
     */
    @Override
    public void customize(FlexGlobalConfig configuration) {
        log.info("MyBatisFlexConfiguration.customize");
        // 开启审计功能
        AuditManager.setAuditEnable(true);
        AuditManager.setMessageCollector(auditMessage -> {
            log.info("{},{}ms", auditMessage.getFullSql(), auditMessage.getElapsedTime());
        });
        configuration.setPrintBanner(true);
        Configuration config = configuration.getConfiguration();
        config.setLogImpl(StdOutImpl.class);
    }

    @Bean
    public FlexGlobalConfig getFlexGlobalConfig() {
        log.info("MyBatisFlexConfiguration.getFlexGlobalConfig");
        FlexGlobalConfig globalConfig = FlexGlobalConfig.getDefaultConfig();
        customize(globalConfig);
        return globalConfig;
    }
}
