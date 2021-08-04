package com.as.socialdemo;


import net.arvin.socialhelper.SocialHelper;

/**
 * github socialUtil 的 初始化
 */
public class MySocialUtil {
    private static MySocialUtil sInstance = new MySocialUtil();
    private static SocialHelper socialHelper;

    private MySocialUtil() {
        socialHelper = new SocialHelper.Builder()
                .setQqAppId("")
                .setWxAppId("")
                .setWxAppSecret("")
                .setWbAppId("")//
                .setWbRedirectUrl("http://sns.whalecloud.com/sina2/callback")
                .build();
    }

    public static MySocialUtil getInstance() {
        return sInstance;
    }

    public SocialHelper socialHelper() {
        return socialHelper;
    }
}