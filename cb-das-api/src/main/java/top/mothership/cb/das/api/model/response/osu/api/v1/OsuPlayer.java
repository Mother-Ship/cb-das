package top.mothership.cb.das.api.model.response.osu.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class OsuPlayer {


    private String userId;

    private String username;

    private String joinDate;

    private String count300;

    private String count100;

    private String count50;
    @JsonProperty("playcount")
    private String playCount;

    private String rankedScore;

    private String totalScore;

    private String ppRank;

    private String level;

    private String ppRaw;

    private String accuracy;

    private String countRankSs;

    private String countRankSsh;

    private String countRankS;

    private String countRankSh;

    private String countRankA;

    private String country;

    private String totalSecondsPlayed;

    private String ppCountryRank;



}
