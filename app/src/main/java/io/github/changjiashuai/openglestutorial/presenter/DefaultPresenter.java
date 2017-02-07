package io.github.changjiashuai.openglestutorial.presenter;

import io.github.changjiashuai.openglestutorial.base.BasePresenter;
import io.github.changjiashuai.openglestutorial.base.BaseView;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 14:50.
 */

public class DefaultPresenter<T extends BaseView> implements BasePresenter<T> {

    protected T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
