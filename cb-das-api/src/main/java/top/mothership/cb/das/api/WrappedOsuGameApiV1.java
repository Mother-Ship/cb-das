package top.mothership.cb.das.api;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rpc/osu/official/v1")
public class WrappedOsuGameApiV1 {
    @RequestMapping("/osuPlayer")
    public OsuPlayer osuPlayer(){

    }

    @RequestMapping("/beatmap")
    public List<Beatmap> beatmap(){

    }

    @RequestMapping("/bestPerformance")
    public List<Score> bestPerformance(){

    }

    @RequestMapping("/recent")
    public List<Score> recent(){

    }

    @RequestMapping("/multiplaying")
    public List<Score> recent(){

    }
}
