package io.github.changjiashuai.openglestutorial.base;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 14:06.
 */

public interface BasePresenter<T extends BaseView> {
    void attachView(T view);

    void detachView();
}
