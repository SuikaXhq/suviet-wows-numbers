package top.suikaxhq.wows.api.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public record EncyclopediaWarshipsQuery(
        String applicationId, // application_id
        Language language,
        List<Nation> nation,
        List<String> fields,
        List<String> extra,
        List<String> shipId, // ship_id
        int limit,
        int pageNumber, // page_no
        List<TypeOfWarships> type // type (of warships)
) implements ToQueryAble {
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("application_id", applicationId);
        map.put("ship_id", shipId);
        map.put("language", language.getName());
        map.put("fields", fields);
        map.put("extra", extra);
        map.put("limit", limit);
        map.put("page_no", pageNumber);

        List<String> nationNameList = new ArrayList<String>();
        for (Nation nationElement: nation) {
            nationNameList.add(nationElement.getName());
        }
        map.put("nation", nationNameList);

        List<String> typeNameList = new ArrayList<String>();
        for (TypeOfWarships typeElement: type) {
            typeNameList.add(typeElement.getName());
        }
        map.put("type", typeNameList);
        return map;
    }

}
