package top.suikaxhq.wows.api.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public record AccountPlayersQuery(
        String applicationId, // application_id
        Language language,
        List<String> fields,
        String search,
        int limit,
        String type // type (for search)
) implements ToQueryAble {

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("application_id", applicationId);
        map.put("language", language.getName());
        map.put("fields", fields);
        map.put("search", search);
        map.put("limit", limit);
        map.put("type", type);
        return map;
    }
}
