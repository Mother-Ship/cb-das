package top.mothership.cb.das.api.model.response.osu.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Beatmap {

    
    private String approved;
    
    private String submitDate;
    
    private String approvedDate;
    
    private String lastUpdate;
    
    private String artist;
    
    private String beatmapId;
    @JsonProperty("beatmapset_id")
    private String beatmapSetId;
    
    private String bpm;
    
    private String creator;
    
    private String creatorId;
    @JsonProperty("difficultyrating")
    private String difficultyRating;
    
    private String diffAim;
    
    private String diffSpeed;
    
    private String diffSize;
    
    private String diffOverall;
    
    private String diffApproach;
    
    private String diffDrain;
    
    private String hitLength;
    
    private String source;
    
    private String genreId;
    
    private String languageId;
    
    private String title;
    
    private String totalLength;
    
    private String version;
    
    private String fileMd5;
    
    private String mode;
    
    private String tags;
    
    private String favouriteCount;
    
    private String rating;
    
    private String playcount;
    @JsonProperty("passcount")
    private String passCount;
    
    private String countNormal;
    
    private String countSlider;
    
    private String countSpinner;
    
    private String maxCombo;
    
    private String storyboard;
    
    private String video;
    
    private String downloadUnavailable;
    
    private String audioUnavailable;
}
