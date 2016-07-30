package mohamedmenasy.com.android_mvp_example.data.source.remote;

import android.support.annotation.NonNull;
import java.util.List;
import mohamedmenasy.com.android_mvp_example.data.Exchange;
import mohamedmenasy.com.android_mvp_example.data.RateItem;
import mohamedmenasy.com.android_mvp_example.data.source.ExchangeDataSource;
import mohamedmenasy.com.android_mvp_example.util.ExchangeUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by MAX on 7/29/2016.
 */
public class ExchangeRemoteDataSource implements ExchangeDataSource {
  @Override public void getExchanges(@NonNull String baseCurrency,
      @NonNull final GetExchangeCallback callback) {
    Retrofit retrofit = RemoteAdapter.getInstance();

    ExchangeService exchangeService = retrofit.create(ExchangeService.class);
    exchangeService.getLatestExchanges(baseCurrency).enqueue(new Callback<Exchange>() {
      @Override public void onResponse(Call<Exchange> call, Response<Exchange> response) {
        if (response.code() == 200) {
          Exchange exchange = response.body();
          List<RateItem> rateItems = ExchangeUtil.getListOfRatesFronExchangeObj(exchange);
          callback.onTaskLoaded(rateItems);
        } else {
          callback.onDataNotAvailable();
        }
      }

      @Override public void onFailure(Call<Exchange> call, Throwable t) {
        callback.onDataNotAvailable();
      }
    });
  }
}
