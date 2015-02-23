package com.bignerdranch.android.geoquiz;

public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mIsCheater;

    public TrueFalse(int question, boolean trueQuestion, boolean isCheater) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mIsCheater = isCheater;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public boolean isCheater() {
        return mIsCheater;
    }

    public void setCheater(boolean isCheater) {
        mIsCheater = isCheater;
    }
}
