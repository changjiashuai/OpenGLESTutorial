package io.github.changjiashuai.openglestutorial.base;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 14:03.
 */

public interface BaseView {
    /**
     * Show a view with a progress bar indicating a loading process.
     */
    void showLoading();

    /**
     * Hide a loading view.
     */
    void hideLoading();

    /**
     * Show a retry view in case of an error when retrieving data.
     */
    void showRetry();

    /**
     * Hide a retry view shown if there was an error when retrieving data.
     */
    void hideRetry();

    /**
     * Show an error message
     *
     * @param message A string representing an error.
     */
    void showError(String message);

    void showMessage(String message);
}
