package com.birdea.util.josastring.adapter;

/**
 * @author seungtae.hwang (birdea@sk.com)
 * @since 2019. 1. 25.
 */
public class BLog {

    public static void d(String tag, String msg) {
        log(String.format("[%s] %s", tag, msg));
    }

    private static void log(String msg) {
        System.out.println(msg);
    }
}
