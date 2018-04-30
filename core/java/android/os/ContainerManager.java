package android.os;

import android.content.Context;

public class ContainerManager {
    private static final String TAG = "ContainerManager";

    private final Context mContext;
    private final IContainerManager mService;

    /**
     * @hide - hide this constructor because it has a parameter
     * of type IContainerManager, which is a system private class. The
     * right way to create an instance of this class is using the
     * factory Context.getSystemService.
     */
    public ContainerManager(Context context, IContainerManager service) {
        mService = service;
        mContext = context;
    }

    /**
     * @hide
     */
    public void sayHelloTo(String name) {
        String packageName = mContext.getPackageName();

        try {
            mService.sayHelloTo(name, packageName);
        } catch (RemoteException e) {
            throw e.rethrowFromSystemServer();
        }
    }
}
