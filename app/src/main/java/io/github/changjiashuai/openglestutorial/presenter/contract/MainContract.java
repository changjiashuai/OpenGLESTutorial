package io.github.changjiashuai.openglestutorial.presenter.contract;

import java.util.List;

import io.github.changjiashuai.openglestutorial.SampleModel;
import io.github.changjiashuai.openglestutorial.base.BasePresenter;
import io.github.changjiashuai.openglestutorial.base.BaseView;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 14:17.
 */

public interface MainContract {

    interface View extends BaseView{
        void renderMainList(List<SampleModel> sampleModels);
        void viewToActivity(int position);
    }

    interface Presenter extends BasePresenter<View> {
        void getData();
    }
}
