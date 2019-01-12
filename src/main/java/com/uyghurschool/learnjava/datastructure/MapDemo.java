package com.uyghurschool.learnjava.datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //A map is a data type that keeps associations between keys and values
        //Construct a map (Dictionary)
        Map<String, String>  websites=new HashMap<String, String>();
        websites.put("Yahoo","www.yahoo.com");
        websites.put("Google","www.google.com");
        websites.put("Youtube","www.youtube.com");
        websites.put("Uyghur","www.uyghurschool.com");
        //print the size of the map (dictionary)
        System.out.println("Total sites: "+websites.size());
        //print all keys
        Set<String> siteKeys=websites.keySet();
        for(String i: siteKeys)
        {
            String url=websites.get(i);
            System.out.println("Site : "+i + " url: "+url);
        }
        //remove a key
        websites.remove("Yahoo");
        System.out.println(websites.containsKey("Yahoo"));
        System.out.println(websites.containsKey("Google"));
        Collection<String> sites=websites.values(); //get the values in the map
        for(String site: sites)
        {
            System.out.println(site);
        }

    }
}
