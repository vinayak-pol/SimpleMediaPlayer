package com.app.mediaplayer.mediaplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.MediaController;

/**
 * Created by Vinayak on 09-10-2017.
 */

public class MusicController extends MediaController {
    public MusicController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public MusicController(Context c){
        super(c);
    }

    public void hide(){}

}
