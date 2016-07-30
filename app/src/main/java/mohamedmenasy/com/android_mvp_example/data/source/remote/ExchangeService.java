package mohamedmenasy.com.android_mvp_example.data.source.remote;

import mohamedmenasy.com.android_mvp_example.data.Exchange;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by MAX on 7/29/2016.
 */
public interface ExchangeService {
  @GET("latest")
  Call<Exchange> getLatestExchanges(@Query("base") String base);
}
