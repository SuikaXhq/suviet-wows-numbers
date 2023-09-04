package top.suikaxhq.wows.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicAPIManager {
    private final PublicAPIConfiguration publicAPIConfiguration;
    private final PublicAPIRequestManager publicAPIRequestManager;

    @Autowired
    public PublicAPIManager(PublicAPIConfiguration publicAPIConfiguration, PublicAPIRequestManager publicAPIRequestManager) {
        this.publicAPIConfiguration = publicAPIConfiguration;
        this.publicAPIRequestManager = publicAPIRequestManager;
    }

    public String getAccountIdByName(String name) {

    }

    private S
}