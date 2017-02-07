package io.github.changjiashuai.openglestutorial.presenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.github.changjiashuai.openglestutorial.SampleModel;
import io.github.changjiashuai.openglestutorial.presenter.contract.MainContract;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 14:16.
 */

public class MainPresenter extends DefaultPresenter<MainContract.View> implements MainContract.Presenter {

    @Inject
    public MainPresenter() {
    }

    @Override
    public void getData() {
        mView.showLoading();
        List<SampleModel> sampleModels = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            SampleModel sampleModel = new SampleModel("Sample " + i);
            sampleModels.add(sampleModel);
        }
        mView.renderMainList(sampleModels);
        mView.hideLoading();
    }

}
