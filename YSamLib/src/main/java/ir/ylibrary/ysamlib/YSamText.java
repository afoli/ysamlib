package ir.ylibrary.ysamlib;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class YSamText extends androidx.appcompat.widget.AppCompatTextView {
    public YSamText(@NonNull Context context) {
        super(context);
    }

    public YSamText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public YSamText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setTextSize(int unit, float size) {
        size = 200;
        super.setTextSize(unit, size);

    }
}
