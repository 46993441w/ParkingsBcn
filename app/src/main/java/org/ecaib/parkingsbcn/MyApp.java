package org.ecaib.parkingsbcn;

import android.app.Application;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by carlesgm on 9/2/16.
 */
public class MyApp extends Application {

    private Firebase ref;

    public Firebase getRef() {
        return ref;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        super.onCreate();
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);

        ref = new Firebase("https://parkingsbcn.firebaseio.com");
    }
}
