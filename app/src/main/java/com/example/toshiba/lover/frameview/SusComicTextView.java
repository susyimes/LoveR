package com.example.toshiba.lover.frameview;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by susyimes on 15/12/15.
 */
public class SusComicTextView extends TextView {
    public SusComicTextView(Context context) {
        super(context);
        init(context);

    }

    public SusComicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public SusComicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);

    }

    private void init(Context context) {
        AssetManager assertMgr = context.getAssets();
        Typeface font = Typeface.createFromAsset(assertMgr, "fonts/comic.ttf");
        setTypeface(font);
    }

}
