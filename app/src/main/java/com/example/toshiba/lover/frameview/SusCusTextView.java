package com.example.toshiba.lover.frameview;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by susyimes on 15/12/15.
 */
public class SusCusTextView extends TextView {
    public SusCusTextView(Context context) {
        super(context);
        init(context);

    }

    public SusCusTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public SusCusTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);

    }

    private void init(Context context) {
        AssetManager assertMgr = context.getAssets();
        Typeface font = Typeface.createFromAsset(assertMgr, "fonts/SanFrancisco.ttf");
        setTypeface(font);
    }

}
