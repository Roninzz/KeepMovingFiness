package com.keepmoving.fitness.pay.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Created by HanleyTang on 2017/3/6.
 */
public class JsonUtil {

    /**
     * Format string.
     *
     * @param o the o
     * @return the string
     */
    public static String format(Object o){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(o);
        return prettyJson;
    }

    /**
     * Format string.
     *
     * @param uglyJson the ugly json
     * @return the string
     */
    public static String format(String uglyJson){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(uglyJson);
        String prettyJson = gson.toJson(jsonElement);
        return prettyJson;
    }


    /**
     * Bean to jsontring string.
     *
     * @param bean the bean
     * @return the string
     */
    public static String beanToJsontring(Object bean) {
        return new Gson().toJson(bean);
    }

}
