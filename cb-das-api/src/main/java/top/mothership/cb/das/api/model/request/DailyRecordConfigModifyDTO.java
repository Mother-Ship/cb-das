package top.mothership.cb.das.api.model.request;

import lombok.Data;

import java.util.List;

@Data
public class DailyRecordConfigModifyDTO {
    private List<Integer> osuPlayerUid;
    private String operationType;
}
