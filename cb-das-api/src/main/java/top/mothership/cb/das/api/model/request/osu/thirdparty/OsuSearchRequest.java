package top.mothership.cb.das.api.model.request.osu.thirdparty;

import lombok.Data;

@Data
public class OsuSearchRequest {
    private String artist;
    private String title;
    private String diffName;
    private String mapper;
    private String ar;
    private String od;
    private String cs;
    private String hp;
}
