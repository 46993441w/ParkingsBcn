package org.ecaib.parkingsbcn;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by carlesgm on 9/2/16.
 */
public class MyApp extends Application {

    private Firebase ref;

    public Firebase getRef() {
        return ref;
    }

    public void setRef(Firebase ref) {
        this.ref = ref;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        super.onCreate();
        Firebase.setAndroidContext(this);

        ref = new Firebase("https://parkingsbcn.firebaseio.com");
    }
}
