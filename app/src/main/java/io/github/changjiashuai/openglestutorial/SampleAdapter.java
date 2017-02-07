package io.github.changjiashuai.openglestutorial;

import android.view.View;

import com.airbnb.epoxy.EpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;

import java.util.List;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/2/7 15:06.
 */

public class SampleAdapter extends EpoxyAdapter {

    interface OnItemClickListener {
        void onItemClick(SampleModel sampleModel, int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public SampleAdapter(List<SampleModel> sampleModels) {
        enableDiffing();
        addModels(sampleModels);
    }

    @Override
    protected void onModelBound(EpoxyViewHolder holder, final EpoxyModel<?> model, final int position) {
        super.onModelBound(holder, model, position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onItemClick((SampleModel) model, position);
            }
        });
    }
}