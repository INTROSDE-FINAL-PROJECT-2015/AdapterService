package introsde.adapter.ws;

import javax.jws.WebService;
import introsde.adapter.ws.AdapterService;

import introsde.external.soundcloud.SoundCloudClient;
import introsde.external.quotesondesign.QuotesOnDesignClient;

//Service Implementation
@WebService(endpointInterface = "introsde.adapter.ws.AdapterService")
public class AdapterServiceImpl implements AdapterService{

    @Override
    public String[] getSong() {
        try{
            return SoundCloudClient.getSong();
        } catch(Exception e){
            String[] res = {"",""};
            return res;
        }
    }

    @Override
    public String[] getQuote(){
        try{
            return QuotesOnDesignClient.getQuote();
        } catch(Exception e){
            String[] res = {"",""};
            return res;
        }
    }
}
