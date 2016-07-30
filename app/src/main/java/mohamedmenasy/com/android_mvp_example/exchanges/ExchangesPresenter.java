package mohamedmenasy.com.android_mvp_example.exchanges;

import java.util.List;
import mohamedmenasy.com.android_mvp_example.data.RateItem;
import mohamedmenasy.com.android_mvp_example.data.source.ExchangeDataSource;
import mohamedmenasy.com.android_mvp_example.data.source.ExchangeRepository;

/**
 * Created by MAX on 7/30/2016.
 */
public class ExchangesPresenter implements ExchangesContract.Presenter {
  private final ExchangeRepository mExchangeRepository;

  private final ExchangesContract.View mExchangesView;

  public ExchangesPresenter(ExchangeRepository mExchangeRepository,
      ExchangesContract.View mExchangesView) {
    this.mExchangeRepository = mExchangeRepository;
    this.mExchangesView = mExchangesView;
    mExchangesView.setPresenter(this);
  }

  @Override public void start() {
    loadExchanges();
  }

  private void loadExchanges() {
    mExchangeRepository.getExchanges("USD", new ExchangeDataSource.GetExchangeCallback() {
      @Override public void onTaskLoaded(List<RateItem> rateItems) {
        mExchangesView.showExchanges(rateItems);
      }

      @Override public void onDataNotAvailable() {

      }
    });
  }
}
