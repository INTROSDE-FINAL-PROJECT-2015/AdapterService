package introsde.adapter;

import org.apache.http.client.ClientProtocolException;
import java.io.IOException;
import introsde.external.soundcloud.SoundCloudClient;
import introsde.external.quotesondesign.QuotesOnDesignClient;


public class AdaperMain{
  public static void main(String[] args) throws ClientProtocolException, IOException  {
    SoundCloudClient.getSong();
    QuotesOnDesignClient.getQuote();
  }
}
