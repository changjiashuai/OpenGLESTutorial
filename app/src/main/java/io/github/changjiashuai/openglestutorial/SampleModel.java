package io.github.changjiashuai.openglestutorial;

import android.widget.TextView;

import com.airbnb.epoxy.EpoxyModelWithHolder;

import butterknife.BindView;
import io.github.changjiashuai.openglestutorial.base.BaseEpoxyHolder;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 15:07.
 */

public class SampleModel extends EpoxyModelWithHolder<SampleModel.SampleHolder> {

    private String name;

    public SampleModel(String name) {
        this.name = name;
    }

    @Override
    protected SampleHolder createNewHolder() {
        return new SampleHolder();
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.activity_main_list_item;
    }

    @Override
    public void bind(SampleHolder holder) {
        holder.mTvName.setText(name);
    }

    static class SampleHolder extends BaseEpoxyHolder {
        @BindView(R.id.tv_name)
        TextView mTvName;
    }
}
