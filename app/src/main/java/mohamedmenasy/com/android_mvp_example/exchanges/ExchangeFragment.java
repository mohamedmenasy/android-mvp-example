package mohamedmenasy.com.android_mvp_example.exchanges;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import mohamedmenasy.com.android_mvp_example.R;
import mohamedmenasy.com.android_mvp_example.data.RateItem;

public class ExchangeFragment extends Fragment implements ExchangesContract.View {
  private MyItemRecyclerViewAdapter myItemRecyclerViewAdapter;
  private RecyclerView recyclerView;
  private ExchangesContract.Presenter mPresenter;

  public ExchangeFragment() {
  }

  public static ExchangeFragment newInstance() {
    ExchangeFragment fragment = new ExchangeFragment();
    return fragment;
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_item_list, container, false);

    // Set the adapter
    if (view instanceof RecyclerView) {
      Context context = view.getContext();
      recyclerView = (RecyclerView) view;

      recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
    return view;
  }

  @Override public void onResume() {
    super.onResume();
    mPresenter.start();
  }

  @Override public void showExchanges(List<RateItem> rateItems) {
    myItemRecyclerViewAdapter = new MyItemRecyclerViewAdapter(rateItems);

    recyclerView.setAdapter(myItemRecyclerViewAdapter);
  }

  @Override public void setPresenter(ExchangesContract.Presenter presenter) {
    mPresenter = presenter;
  }
}
