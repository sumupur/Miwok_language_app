package com.sumupur.miwok_language_app;
class word {
    private String mDefaultTranslation,mMiwokTranslation;
    private int mImageResourceId,mAudioResourceId;
    word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    int getImageResourceId() {
        return mImageResourceId;
    }
    int getAudioResourceId() {
        return mAudioResourceId;
    }
}
