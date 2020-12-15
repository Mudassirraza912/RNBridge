package com.trypayment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

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

public class MyViewManager extends SimpleViewManager<LinearLayout> {

    public static final String REACT_NAME="MyViewManager";
//    public int COMMAND_CREATE=1;
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

    public LinearLayout createViewInstance(ThemedReactContext context) {
        LayoutInflater inflater =(LayoutInflater) reactContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_face_capture,null);
        return linearLayout; //If your customview has more constructor parameters pass it from here.

    }

}
