package com.siberiadante.utilsample.activity.util;

import android.os.Bundle;
import android.widget.TextView;

import com.siberiadante.androidutil.util.SDMathUtil;
import com.siberiadante.utilsample.R;
import com.siberiadante.utilsample.activity.base.BaseActivity;

import butterknife.BindView;

/**
 * Created:： SiberiaDante
 * @Date： 2018/01/01
 * Describe：
 * @github： https://github.com/SiberiaDante
 * @博客园： http://www.cnblogs.com/shen-hua/
 */
public class SDMathActivity extends BaseActivity {

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    public int setLayoutId() {
        return R.layout.activity_sdmath;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        actionBar.setTitle(R.string.sd_math_util);
        StringBuilder builder = new StringBuilder();
        builder.append("sin 30度等于：").append(SDMathUtil.sin(30))
                .append("cos 30度等于：").append(SDMathUtil.cos(30));
        tvContent.setText(builder);
    }
}
