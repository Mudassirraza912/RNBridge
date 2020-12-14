package com.trypayment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

import java.util.Map;

public class MyViewManager extends SimpleViewManager<FrameLayout> {

    public static final String REACT_NAME="TESTINGUI";
    public int COMMAND_CREATE=1;
    ReactApplicationContext reactContext;
    private ReactApplicationContext context;
    public MyViewManager(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;

    }

    @NonNull
    @Override
    public String getName() {
        return REACT_NAME;
    }

    @NonNull
    @Override
    protected FrameLayout createViewInstance(@NonNull ThemedReactContext reactContext) {
        // Create new fragment and transaction

// Commit the transaction


        LayoutInflater inflater =(LayoutInflater) reactContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_face_capture,null);
        return frameLayout;
   }
}
