package com.birdea.util.josastring.adapter;

import org.jetbrains.annotations.Nullable;

/**
 * @author seungtae.hwang (birdea@sk.com)
 * @since 2019. 1. 25.
 */
public class TextUtils {

    /**
     * Returns true if the string is null or 0-length.
     * @param str the string to be examined
     * @return true if str is null or zero length
     */
    public static boolean isEmpty(@Nullable CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }
}
