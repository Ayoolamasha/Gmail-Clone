package com.gmailclone.Helper;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;

import com.gmailclone.R;

public class FlipAnimator {
    private static  String TAG = FlipAnimator.class.getSimpleName();
    private static AnimatorSet leftIn, rightOut, leftOut, rightIn;

    // PERFORM FLIP ANIMATION ON TWO VIEWS

    public static void flipView(Context context, final View back, final View front, boolean showFront){
       leftIn = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.card_flip_left_in);
       rightOut = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.card_flip_right_out);
       leftOut = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.card_flip_left_out);
       rightIn = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.card_flip_right_in);

       final AnimatorSet showFrontAnim = new AnimatorSet();
       final AnimatorSet showBackAnim = new AnimatorSet();

       leftIn.setTarget(back);
       rightOut.setTarget(front);
       showFrontAnim.playTogether(leftIn, rightOut);

        leftOut.setTarget(back);
        rightIn.setTarget(front);
        showBackAnim.playTogether(leftOut, rightIn);

        if (showFront){
            showFrontAnim.start();
        }else {
            showBackAnim.start();
        }

    }
}
