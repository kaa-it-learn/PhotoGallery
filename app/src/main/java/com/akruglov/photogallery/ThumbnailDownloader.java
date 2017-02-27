package com.akruglov.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by akruglov on 2/27/17.
 */

public class ThumbnailDownloader<T> extends HandlerThread {

    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader() {
        super(TAG);
    }

    public void queueThumbnail(T target, String url) {
        Log.i(TAG, "Got a URL: " + url);
    }
}
