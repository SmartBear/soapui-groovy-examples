package com.smartbear.soapui.demo;

class CountryToCurrency {
    def static String convert(String country) {        
        def map = ['Sweden':'SEK', 'Norway':'NOK']
        
        if(!map.containsKey(country))
            throw new IllegalArgumentException("Couldn't find currency for the provided country: $country")
        else
            return map[country]
    }
}
