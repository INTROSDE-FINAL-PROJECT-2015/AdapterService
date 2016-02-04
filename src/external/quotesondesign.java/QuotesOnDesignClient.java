package introsde.external.quotesondesign;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.json.*;

import introsde.external.helpers.RequestHelper;

import org.apache.commons.lang.StringEscapeUtils;



public class QuotesOnDesignClient{

      static final String URI = "http://quotesondesign.com/wp-json/posts?filter[orderby]=rand&filter[posts_per_page]=1";

      public static String[] getQuote() throws ClientProtocolException, IOException {
          String result = RequestHelper.getRequest(URI);
          JSONArray arr = new JSONArray(result);
          JSONObject jso = arr.getJSONObject(0);
          System.out.println(jso.getString("title") + "\n " + jso.getString("content").replaceAll("\\<[^>]*>",""));
          String[] resArr = {(jso.getString("content").replaceAll("\\<[^>]*>","")).replaceAll("^&#8217;","\'"),jso.getString("title")};
          return resArr; //Response.status(204).build();
      }
}
