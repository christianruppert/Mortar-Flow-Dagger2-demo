package com.lukaspili.mortardemo.utils;


import timber.log.Timber;

public class CustomDebugTree extends Timber.DebugTree {

    private static final String LOG_PREFIX = "### ";
    private static final int MAX_TAG_LEN_ANDROID = 23;

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        super.log(priority, StringUtils.padLeft(tag, MAX_TAG_LEN_ANDROID), LOG_PREFIX + message, t);
    }
}
