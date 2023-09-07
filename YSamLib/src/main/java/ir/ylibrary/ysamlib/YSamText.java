package ir.ylibrary.ysamlib;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class YSamText extends androidx.appcompat.widget.AppCompatTextView {
    public YSamText(@NonNull Context context) {
        super(context);
        setTextColor(0);
    }

    public YSamText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setTextColor(0);
    }

    public YSamText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTextColor(0);
    }

    @Override
    public void setTextColor(int color) {
        color = getResources().getColor(R.color.textColorExample, null);
        super.setTextColor(color);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        text = "library";
        super.setText(text, type);
    }

    @Override
    public boolean isInEditMode() {
        return super.isInEditMode();
    }
}
