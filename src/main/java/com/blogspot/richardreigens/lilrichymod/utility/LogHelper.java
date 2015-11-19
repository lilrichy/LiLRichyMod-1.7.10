package com.blogspot.richardreigens.LiLRichyMod.utility;

import com.blogspot.richardreigens.LiLRichyMod.reference.Reference;
import cpw.mods.fml.common.FMLLog;

import java.util.logging.Level;


/**
 * Created by Rich on 11/19/2015.
 */
public class LogHelper
{
    public static void log(org.apache.logging.log4j.Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(org.apache.logging.log4j.Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(org.apache.logging.log4j.Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(org.apache.logging.log4j.Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(org.apache.logging.log4j.Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(org.apache.logging.log4j.Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(org.apache.logging.log4j.Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(org.apache.logging.log4j.Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(org.apache.logging.log4j.Level.WARN, object);
    }


}
