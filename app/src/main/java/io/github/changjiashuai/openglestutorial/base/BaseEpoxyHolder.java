package io.github.changjiashuai.openglestutorial.base;

import android.view.View;

import com.airbnb.epoxy.EpoxyHolder;

import butterknife.ButterKnife;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 14:07.
 */

public class BaseEpoxyHolder extends EpoxyHolder {

    @Override
    protected void bindView(View itemView) {
        ButterKnife.bind(this, itemView);
    }
}
