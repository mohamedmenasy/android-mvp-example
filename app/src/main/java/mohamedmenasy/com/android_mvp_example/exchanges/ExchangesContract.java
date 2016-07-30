package mohamedmenasy.com.android_mvp_example.exchanges;

import java.util.List;
import mohamedmenasy.com.android_mvp_example.BasePresenter;
import mohamedmenasy.com.android_mvp_example.BaseView;
import mohamedmenasy.com.android_mvp_example.data.RateItem;

/**
 * Created by MAX on 7/30/2016.
 */
public interface ExchangesContract {

  interface View extends BaseView<Presenter> {
    void showExchanges(List<RateItem> rateItems);
  }

  interface Presenter extends BasePresenter {

  }
}
