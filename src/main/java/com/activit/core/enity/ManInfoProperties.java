package com.activit.core.enity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties( prefix = "manInfo" )
public class ManInfoProperties {
}
