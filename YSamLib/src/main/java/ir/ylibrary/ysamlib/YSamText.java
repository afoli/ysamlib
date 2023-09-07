package ir.ylibrary.ysamlib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

public class YSamText extends LinearLayoutCompat {
    public YSamText(@NonNull Context context) {
        super(context);
        init(context);
    }

    public YSamText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public YSamText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(final Context context) {
        inflate(context, R.layout.text_view_custom, this);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("LIBRARY");
        textView.setTextColor(getResources().getColor(R.color.textColor, null));

    }

}
