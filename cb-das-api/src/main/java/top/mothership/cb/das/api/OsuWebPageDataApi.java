package top.mothership.cb.das.api;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rpc/osu/webpage")
public class OsuWebPageDataApi {
    @RequestMapping("/avater")
    public byte[] avater(){

    }

    @RequestMapping("/backgroundImage")
    public byte[] backgroundImage(){

    }

    @RequestMapping("/replayWatched")
    public byte[] replayWatched(){

    }

    @RequestMapping("scoreRanking")
    public Integer scoreRanking(){

    }

    @RequestMapping("lastActive")
    public Long lastActive(){

    }
}
