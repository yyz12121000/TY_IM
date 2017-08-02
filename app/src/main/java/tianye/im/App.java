package tianye.im;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by Administrator on 2017/8/1 0001.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initLeancloud();
    }

    private void initLeancloud() {
        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this, "XUIz11ilfr4FuiBBmwxUEUOd-gzGzoHsz", "wdHEQAWXFp3GvuABian1GT26");
        // 放在 SDK 初始化语句 AVOSCloud.initialize() 后面，只需要调用一次即可
        AVOSCloud.setDebugLogEnabled(true);
    }


}
