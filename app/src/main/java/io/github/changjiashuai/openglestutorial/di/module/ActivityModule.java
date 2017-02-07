package io.github.changjiashuai.openglestutorial.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import io.github.changjiashuai.openglestutorial.di.PerActivity;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 11:37.
 */
@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }
}
