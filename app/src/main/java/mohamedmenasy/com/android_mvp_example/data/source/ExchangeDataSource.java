package mohamedmenasy.com.android_mvp_example.data.source;

import android.support.annotation.NonNull;
import java.util.List;
import mohamedmenasy.com.android_mvp_example.data.RateItem;

/**
 * Created by MAX on 7/29/2016.
 */
public interface ExchangeDataSource {

  interface GetExchangeCallback {

    void onTaskLoaded(List<RateItem> rateItems);

    void onDataNotAvailable();
  }

  void getExchanges(@NonNull String baseCurrency, @NonNull GetExchangeCallback callback);

}
