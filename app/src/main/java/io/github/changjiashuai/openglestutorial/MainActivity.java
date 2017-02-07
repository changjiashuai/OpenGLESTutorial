package io.github.changjiashuai.openglestutorial;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import io.github.changjiashuai.openglestutorial.base.BaseActivity;
import io.github.changjiashuai.openglestutorial.presenter.MainPresenter;
import io.github.changjiashuai.openglestutorial.presenter.contract.MainContract;
import io.github.changjiashuai.openglestutorial.sample1.TutorialPartIActivity;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private SampleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void loadData() {
        mPresenter.getData();
    }

    @Override
    public void renderMainList(List<SampleModel> sampleModels) {
        mAdapter = new SampleAdapter(sampleModels);
        mAdapter.setOnItemClickListener(new SampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(SampleModel sampleModel, int position) {
                viewToActivity(position);
            }
        });
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void viewToActivity(int position) {
        switch (position) {
            case 0:
                navigateToActivity(TutorialPartIActivity.class);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}