package com.sgffsg.patternlockview.view;

/**
 * 图案控件监听器
 * Created by liumengkai on 17/4/24.
 */

public interface PatternViewLintener {
    void onSuccess();
    void onSet(String psw);
    void onError();
}
