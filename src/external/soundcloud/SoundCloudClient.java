package introsde.external.soundcloud;


import java.io.BufferedReader;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;


import org.json.*;

import introsde.external.helpers.RequestHelper;

public class SoundCloudClient {

    final static String CLIENT_ID = "e4ef6572c2baf401db2f64b4e0eae9ce";
    static String[] genre = {"rock", "metal", "blues", "steven%20wilson","vlastur"};
    public static String[] getSong() throws ClientProtocolException, IOException {
        int randomNum = 0 + (int)(Math.random()*(genre.length-1));
        //final String CLIENT_ID = "e4ef6572c2baf401db2f64b4e0eae9ce";
        String URI = "http://api.soundcloud.com/tracks?q="+genre[randomNum]+"&client_id="+CLIENT_ID;
        String result = RequestHelper.getRequest(URI);
        JSONArray arr = new JSONArray(result);
        randomNum = 0 + (int)(Math.random()*(arr.length()-1));
        JSONObject jso = arr.getJSONObject(randomNum);
        System.out.println(jso.getString("permalink_url") + "\n " + jso.getString("title"));
        String[] resArr = {jso.getString("permalink_url"),jso.getString("title")};
        return resArr; //Response.status(204).build();
    }
}
