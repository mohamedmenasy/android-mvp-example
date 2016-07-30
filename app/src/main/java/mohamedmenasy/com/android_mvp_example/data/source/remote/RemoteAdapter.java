package mohamedmenasy.com.android_mvp_example.data.source.remote;

import mohamedmenasy.com.android_mvp_example.util.Const;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MAX on 7/29/2016.
 */
public class RemoteAdapter {
  private static Retrofit INSTANCE;

  private RemoteAdapter() {

  }

  public static Retrofit getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Retrofit.Builder()
          .baseUrl(Const.BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build();
    }
    return INSTANCE;
  }
}
