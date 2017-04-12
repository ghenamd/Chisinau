
package com.example.android.moldovatourguide;

import java.util.Objects;

/**
 * Created by Ghena on 24/03/2017.
 */

public class Object {


    //Declare the variables
    private String mString1;

    private String mString2;

    private int mImageResourceId;

    private String mVideoResource;
    private static final String NO_VIDEO_PROVIDED = "";



    // we use Constructor to initialize the variables
    public Object(String string1, String string2, int imageResourceId) {

        mString1 = string1;
        mString2 = string2;
        mImageResourceId = imageResourceId;
    }


    public Object(String string1, String string2, int imageResourceId, String videoResource) {

        mString1 = string1;
        mString2 = string2;
        mImageResourceId = imageResourceId;
        mVideoResource = videoResource;

    }


    public String getString1() {
        return mString1;
    }

    public String getString2() {
        return mString2;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getVideoResource() {
        return mVideoResource;
    }

    // return true if a word comes with an Image
    public boolean hasVideo() {

        return !Objects.equals(mVideoResource, NO_VIDEO_PROVIDED);
    }


    @Override
    public String toString() {
        return "Object{" +
                "mString1='" + mString1 + '\'' +
                ", mString2='" + mString2 + '\'' +
                ", mImageResourceId=" + mImageResourceId +

                '}';
    }

}
