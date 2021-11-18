package top.mothership.cb.das.api.model.response.osu.thirdparty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class OsuSearchResultDTO {

    private Integer resultCount;
    
    private List<BeatmapDTO> beatmaps;

    @Data
    public static class BeatmapDTO {
        
        private Integer difficultyAr;
        
        private Integer difficultyHp;
        
        private String source;
        
        private Integer bpm;
        
        private Integer playLength;
        
        private Integer difficultyOd;
        
        private Integer favorites;

        @JsonProperty("gamemode")
        private Integer gameMode;
        
        private String date;
        
        private String mapper;
        
        private String genre;
        
        private Double difficulty;
        
        private Integer difficultyCs;
        
        private String difficultyName;
        
        private Integer passCount;
        
        private Integer beatmapId;
        
        private String artist;

        @JsonProperty("beatmapset_id")
        private Integer beatmapSetId;
        
        private String language;
        
        private Integer totalLength;
        
        private Integer beatmapStatus;
        
        private String title;
        
        private Integer mapCount;
        
        private Integer playCount;

    }
}
