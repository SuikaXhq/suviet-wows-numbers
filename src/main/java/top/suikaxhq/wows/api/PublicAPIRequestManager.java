package top.suikaxhq.wows.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.suikaxhq.wows.api.bean.PublicAPIQueryBean;
import top.suikaxhq.wows.api.bean.PublicAPIResultBean;

import java.net.http.HttpClient;

/**
 * top.suikaxhq.wows.api.PublicAPIRequestManager
 * 组织毛子Public API URL，查询并返回原始json
 */

@Service
public class PublicAPIRequestManager {
    private final PublicAPIConfiguration apiConfig;
    private final HttpClient = HttpClient.newBuilder().build();


    @Autowired
    public PublicAPIRequestManager(PublicAPIConfiguration apiConfig) {
        this.apiConfig = apiConfig;
    }

    public PublicAPIResultBean getResult(String url, PublicAPIQueryBean queryBean) {

    }
}
