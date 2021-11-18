package top.mothership.cb.das.api;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rpc/osu/webpage")
public class OsuWebPageDataApi {
    @RequestMapping("/avater")
    public byte[] avater(){
        return null;
    }

    @RequestMapping("/backgroundImage")
    public byte[] backgroundImage(){
        return null;
    }

    @RequestMapping("/replayWatched")
    public byte[] replayWatched(){
        return null;
    }

    @RequestMapping("scoreRanking")
    public Integer scoreRanking(){
        return null;
    }

    @RequestMapping("lastActive")
    public Long lastActive(){
        return null;
    }
}
