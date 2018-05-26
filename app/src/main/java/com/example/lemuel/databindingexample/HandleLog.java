package com.example.lemuel.databindingexample;

import android.util.Log;
import android.view.View;

import java.util.List;

public class HandleLog {
    //The signature of the method in the expression must exactly match the signature of the method in the listener object.
    public void logIt(View view)
    {
        Log.e("UserHandlerLog","logged it");
    }

    //Listener bindings are binding expressions that run when an event happens. They are similar to method references,
    // but they let you run arbitrary data binding expressions. This feature is available with Android Gradle Plugin for Gradle version 2.0 and later.
    public void logClass(List<String> subjects)
    {
        Log.e("UserFirstClass",subjects.get(0));
    }

    public void logClass(View view, List<String> subjects)
    {
        Log.e("UserFirstClass",subjects.get(0));
        if(subjects.get(0).equals("Math"))
        {
            view.setVisibility(View.INVISIBLE);
        }
    }
}
