package top.suikaxhq.wows.api.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public record AccountPlayerByDateQuery(
        String applicationId, // application_id
        String accountId, // account_id
        Language language,
        List<String> fields,
        List<String> extra,
        List<String> dates
) implements ToQueryAble {
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("application_id", applicationId);
        map.put("account_id", accountId);
        map.put("language", language.getName());
        map.put("fields", fields);
        map.put("extra", extra);
        map.put("dates", dates);
        return map;
    }

}
