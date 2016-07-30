package mohamedmenasy.com.android_mvp_example.exchanges;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import mohamedmenasy.com.android_mvp_example.R;
import mohamedmenasy.com.android_mvp_example.data.source.ExchangeRepository;
import mohamedmenasy.com.android_mvp_example.data.source.remote.ExchangeRemoteDataSource;
import mohamedmenasy.com.android_mvp_example.util.ActivityUtils;

public class ExchangeActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ExchangeFragment exchangeFragment =
        (ExchangeFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
    if (exchangeFragment == null) {
      exchangeFragment = ExchangeFragment.newInstance();
      ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), exchangeFragment,
          R.id.contentFrame);
    }
    new ExchangesPresenter(ExchangeRepository.getInstance(new ExchangeRemoteDataSource()),
        exchangeFragment);
  }
}
