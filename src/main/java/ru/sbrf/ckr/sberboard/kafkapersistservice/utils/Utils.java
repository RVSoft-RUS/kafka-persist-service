package ru.sbrf.ckr.sberboard.kafkapersistservice.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jndi.JndiTemplate;

import javax.naming.NamingException;

public class Utils {
    private static final Logger logger = LogManager.getLogger(Utils.class.getSimpleName());

    public static String getJNDIValue(String key){
        String value = null;
        try {
            value = (String)new JndiTemplate().lookup(key);
        } catch (NamingException e) {
            logger.error("Cannot retrieve " + key + " value!");
            e.printStackTrace();
        }
        return value;
    }

}
