package webview.zhoujian.com.x5_webview.utils;

import android.content.Context;
import android.widget.Toast;


public class ToastUtil {


    public static void makeTextLong(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void makeTextShort(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
