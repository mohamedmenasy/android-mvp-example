package mohamedmenasy.com.android_mvp_example.data.source;

import android.support.annotation.NonNull;
import java.util.List;
import mohamedmenasy.com.android_mvp_example.data.RateItem;

/**
 * Created by MAX on 7/29/2016.
 */
public class ExchangeRepository implements ExchangeDataSource {
  private static ExchangeRepository INSTANCE = null;

  private final ExchangeDataSource mRemoteExchangeDataSource;

  private ExchangeRepository(ExchangeDataSource mRemoteExchangeDataSource) {
    this.mRemoteExchangeDataSource = mRemoteExchangeDataSource;
  }

  public static ExchangeRepository getInstance(ExchangeDataSource remoteExchangeDataSource) {
    if (INSTANCE == null) {
      INSTANCE = new ExchangeRepository(remoteExchangeDataSource);
    }
    return INSTANCE;
  }

  public static void destroyInstance() {
    INSTANCE = null;
  }

  @Override public void getExchanges(@NonNull String baseCurrency,
      @NonNull final GetExchangeCallback callback) {
    mRemoteExchangeDataSource.getExchanges("USD", new GetExchangeCallback() {
      @Override public void onTaskLoaded(List<RateItem> rateItems) {
        callback.onTaskLoaded(rateItems);
      }

      @Override public void onDataNotAvailable() {
        callback.onDataNotAvailable();
      }
    });
  }
}
