package mohamedmenasy.com.android_mvp_example.util;

import java.util.ArrayList;
import java.util.List;
import mohamedmenasy.com.android_mvp_example.data.Exchange;
import mohamedmenasy.com.android_mvp_example.data.RateItem;

/**
 * Created by MAX on 7/30/2016.
 */
public class ExchangeUtil {

  public static List<RateItem> getListOfRatesFronExchangeObj(Exchange exchange) {
    List<RateItem> rateItems = new ArrayList<>();
    RateItem rateItem = new RateItem();

    rateItem.setCurrencyName("AUD");
    rateItem.setRate(exchange.getRates().getAUD());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("BGN");
    rateItem.setRate(exchange.getRates().getBGN());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("BRL");
    rateItem.setRate(exchange.getRates().getBRL());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("CAD");
    rateItem.setRate(exchange.getRates().getCAD());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("CHF");
    rateItem.setRate(exchange.getRates().getCHF());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("CNY");
    rateItem.setRate(exchange.getRates().getCNY());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("CZK");
    rateItem.setRate(exchange.getRates().getCZK());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("DKK");
    rateItem.setRate(exchange.getRates().getDKK());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("GBP");
    rateItem.setRate(exchange.getRates().getGBP());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("HKD");
    rateItem.setRate(exchange.getRates().getHKD());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("HRK");
    rateItem.setRate(exchange.getRates().getHRK());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("HUF");
    rateItem.setRate(exchange.getRates().getHUF());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("IDR");
    rateItem.setRate(exchange.getRates().getIDR());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("ILS");
    rateItem.setRate(exchange.getRates().getILS());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("INR");
    rateItem.setRate(exchange.getRates().getINR());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("JPY");
    rateItem.setRate(exchange.getRates().getJPY());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("KRW");
    rateItem.setRate(exchange.getRates().getKRW());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("MXN");
    rateItem.setRate(exchange.getRates().getMXN());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("MYR");
    rateItem.setRate(exchange.getRates().getMYR());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("NOK");
    rateItem.setRate(exchange.getRates().getNOK());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("NZD");
    rateItem.setRate(exchange.getRates().getNZD());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("PHP");
    rateItem.setRate(exchange.getRates().getPHP());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("PLN");
    rateItem.setRate(exchange.getRates().getPLN());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("RON");
    rateItem.setRate(exchange.getRates().getRON());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("RUB");
    rateItem.setRate(exchange.getRates().getRUB());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("SEK");
    rateItem.setRate(exchange.getRates().getSEK());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("SGD");
    rateItem.setRate(exchange.getRates().getSGD());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("THB");
    rateItem.setRate(exchange.getRates().getTHB());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("TRY");
    rateItem.setRate(exchange.getRates().getTRY());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("ZAR");
    rateItem.setRate(exchange.getRates().getZAR());
    rateItems.add(rateItem);

    rateItem = new RateItem();
    rateItem.setCurrencyName("EUR");
    rateItem.setRate(exchange.getRates().getEUR());
    rateItems.add(rateItem);

    return rateItems;
  }
}
