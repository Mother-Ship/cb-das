package top.mothership.cb.das.api.model.response.osu.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Score {

    private String scoreId;

    private String score;

    private String username;

    private String count300;

    private String count100;

    private String count50;

    @JsonProperty("countmiss")
    private String countMiss;

    @JsonProperty("maxcombo")
    private String maxCombo;

    @JsonProperty("countkatu")
    private String countKatu;

    @JsonProperty("countgeki")
    private String countGeki;

    private String perfect;

    private String enabledMods;

    private String userId;

    private String date;

    private String rank;

    private String pp;

    @JsonProperty("replay_available")
    private String replayAvailable;
}
