package com.reversecoder.samplelibrary.java;

public class PleaseUseMe {

    private static PleaseUseMe pleaseUseMe = null;

    private PleaseUseMe() {
    }

    public static PleaseUseMe getInstance() {
        if (pleaseUseMe == null) {
            pleaseUseMe = new PleaseUseMe();
        }
        return pleaseUseMe;
    }

    public String pleasePleaseUseMe() {
        return "Please please please use me!";
    }
}
