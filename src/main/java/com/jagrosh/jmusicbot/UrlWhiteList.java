package com.jagrosh.jmusicbot;

import java.util.regex.Pattern;

@SuppressWarnings("HttpUrlsUsage")
public class UrlWhiteList {
    private static final String[] allowedPatterns = new String[]{
            "^http[s]?://(www\\.)?youtube\\.com/.+",
            "^http[s]?://(www\\.)?soundcloud\\.com/.+",
            "^http[s]?://.*\\.bandcamp\\.com/.+",
            "^http[s]?://(www\\.)?vimeo\\.com/.+",
            "^http[s]?://(www\\.)?twitch\\.tv/.+"
    };

    public static String fixUrl(String url) {
        for (String s : allowedPatterns) {
            if (Pattern.compile(s).matcher(url).matches()) {
                return url;
            }
        }
        return "{BLOCKED}";
    }
}
