package com.sgffsg.patternlockview;

/**
 * 图案控件监听器
 * Created by sgffsg on 17/4/24.
 */

public interface PatternViewListener {
    void onSuccess();
    void onDraw(String psw);
    void onError();
}
