package com.android.server;

import android.content.Context;
import android.os.IContainerManager;
import android.os.ContainerManager;
import android.util.Log;

public class ContainerManagerService extends IContainerManager.Stub {

    private static final String TAG = "ContainerManagerService";
    private final Context mContext;

    public ContainerManagerService(Context context) {
        super();
        mContext = context;
    }

    @Override
    public void sayHelloTo(String name, String packageName) {
        Log.i(TAG, "Hello, " + name + "! (package " + packageName + ")");
    }

}
