package io.github.changjiashuai.openglestutorial.di.component;

import android.app.Activity;

import dagger.Component;
import io.github.changjiashuai.openglestutorial.MainActivity;
import io.github.changjiashuai.openglestutorial.di.PerActivity;
import io.github.changjiashuai.openglestutorial.di.module.ActivityModule;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 11:36.
 */
@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();

    void inject(MainActivity activity);
}
