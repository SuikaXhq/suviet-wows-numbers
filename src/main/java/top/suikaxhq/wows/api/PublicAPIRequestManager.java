package top.suikaxhq.wows.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;
import top.suikaxhq.wows.api.bean.PublicAPIQueryBean;
import top.suikaxhq.wows.api.bean.PublicAPIResultBean;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * top.suikaxhq.wows.api.PublicAPIRequestManager
 * 组织毛子Public API URL，查询并返回原始json
 */

@Service
public class PublicAPIRequestManager {
    private final PublicAPIConfiguration apiConfig;
    private final HttpClient httpClient;


    @Autowired
    public PublicAPIRequestManager(PublicAPIConfiguration apiConfig, HttpClient httpClient) {
        this.apiConfig = apiConfig;
        this.httpClient = httpClient;
    }

    public PublicAPIResultBean sendRequest(String relativeUrl, PublicAPIQueryBean queryBean) {
        String uri = UriComponentsBuilder.fromUriString(apiConfig.getUrl() + relativeUrl)
                .build().encode().toString();
        HttpRequest request = HttpRequest.newBuilder()
                .timeout(Duration.ofSeconds(5))
                .uri(URI.create(uri))
                .build();


        HttpResponse<String> response = httpClient.send(request);
    }
}
