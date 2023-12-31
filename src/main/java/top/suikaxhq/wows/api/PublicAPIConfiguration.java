package top.suikaxhq.wows.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * top.suikaxhq.wows.api.PublicAPIConfiguration
 * 读取application.yml中的配置并保存
 */

@Configuration
@ConfigurationProperties("public-api")
public class PublicAPIConfiguration {
    private String url;
    private String applicationId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
