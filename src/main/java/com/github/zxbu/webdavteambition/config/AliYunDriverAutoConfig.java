package com.github.zxbu.webdavteambition.config;

import com.github.zxbu.webdavteambition.client.AliYunDriverClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AliYunDriveProperties.class)
public class AliYunDriverAutoConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(AliYunDriverAutoConfig.class);

    @Autowired
    private AliYunDriveProperties aliYunDriveProperties;

    @Bean
    public AliYunDriverClient teambitionClient(ApplicationContext applicationContext) throws Exception {
        return new AliYunDriverClient(aliYunDriveProperties);
    }



}
