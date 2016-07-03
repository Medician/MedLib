package com.example.manyamadan.medlib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by manyamadan on 03/07/16.
 */
public class MedLib {
    private static MedLib ourInstance = new MedLib();

    public static MedLib getInstance() {
        return ourInstance;
    }

    private MedLib() {
    }


    public void showToast(Context context,String data)
    {
        Toast.makeText(context,"yayyyyy",Toast.LENGTH_LONG).show();
    }
}
