
package com.example.android.moldovatourguide;

/**
 * Created by Ghena on 24/03/2017.
 */

public class Object  {



    //Declare the variables
    private String mString1;

    private String mString2;

    private int mImageResourceId;

    private String mVideoPath = NO_VIDEO;

    private static final String NO_VIDEO = "";



// we use Constructor to initialize the variables
    public Object (String string1, String string2,int imageResourceId) {

        mString1 = string1;
        mString2 = string2;
        mImageResourceId = imageResourceId;


    }
    public  Object( String string1, String string2,String videoUri){



        mString1 = string1;
        mString2 = string2;
        mVideoPath = videoUri;





    }

    public String getString1() {
        return mString1;
    }

    public String getString2() {
        return mString2;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public  String getVideoPathId(){return mVideoPath;}


    // / return true if an object comes with a Video
    public boolean hasVideo(){

        return mVideoPath != NO_VIDEO;

    }

    @Override
    public String toString() {
        return "Object{" +
                "mString1='" + mString1 + '\'' +
                ", mString2='" + mString2+ '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mVideoPath=" + mVideoPath +
                '}';
    }

}
