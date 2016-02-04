package introsde.adapter.endpoint;

import javax.xml.ws.Endpoint;
import introsde.adapter.ws.AdapterServiceImpl;

//Endpoint publisher
public class AdapterServicePublisher{
    public static void main(String[] args) {
       Endpoint.publish("http://localhost:6902/ws/adapter", new AdapterServiceImpl());
    }
}
