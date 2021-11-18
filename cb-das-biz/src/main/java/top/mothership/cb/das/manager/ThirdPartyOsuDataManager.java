package top.mothership.cb.das.manager;

import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.mothership.cb.das.api.model.request.osu.thirdparty.OsuSearchRequest;
import top.mothership.cb.das.api.model.response.osu.thirdparty.OsuSearchResultDTO;

@Service
public class ThirdPartyOsuDataManager {
    @Autowired
    private OkHttpClient okHttpClient;

    public OsuSearchResultDTO searchBeatmap(OsuSearchRequest request){

        return null;
    }
}
