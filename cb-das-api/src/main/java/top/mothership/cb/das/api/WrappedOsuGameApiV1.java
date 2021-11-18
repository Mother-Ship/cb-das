package top.mothership.cb.das.api;

import org.springframework.web.bind.annotation.RequestMapping;
import top.mothership.cb.das.api.model.response.osu.api.v1.Beatmap;
import top.mothership.cb.das.api.model.response.osu.api.v1.OsuPlayer;
import top.mothership.cb.das.api.model.response.osu.api.v1.Score;

import java.util.List;

@RequestMapping("/rpc/osu/official/v1")
public class WrappedOsuGameApiV1 {
    @RequestMapping("/osuPlayer")
    public OsuPlayer osuPlayer(){
        return null;
    }

    @RequestMapping("/beatmap")
    public List<Beatmap> beatmap(){
        return null;
    }

    @RequestMapping("/bestPerformance")
    public List<Score> bestPerformance(){
        return null;
    }

    @RequestMapping("/recent")
    public List<Score> recent(){
        return null;
    }

    @RequestMapping("/multiplaying")
    public List<Score> multiplaying(){
        return null;
    }
}
