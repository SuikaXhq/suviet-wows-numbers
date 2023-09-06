package top.suikaxhq.wows.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import top.suikaxhq.wows.api.bean.ToQueryAble;
import top.suikaxhq.wows.api.bean.PublicAPIResultBean;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/**
 * 组织毛子Public API URL，查询并返回json构造的JavaBean对象
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

    public PublicAPIResultBean sendRequest(String relativeUrl, ToQueryAble query) {
        Map<String, Object> queryMap = query.toMap();
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(apiConfig.getUrl()).path(relativeUrl);
        for (Map.Entry<String, Object> queryPair: queryMap.entrySet()) {
            if (queryPair.getValue() != null) {
                if (queryPair.getValue() instanceof List valueList) {
                    for (Object item: valueList) {
                        uriBuilder.queryParam(queryPair.getKey(), item);
                    }
                }
            }
        }
        String uri = uriBuilder.encode().toString();
        HttpRequest request = HttpRequest.newBuilder()
                .timeout(Duration.ofSeconds(5))
                .uri(URI.create(uri))
                .build();


        HttpResponse<String> response = httpClient.send(request);
    }
}
