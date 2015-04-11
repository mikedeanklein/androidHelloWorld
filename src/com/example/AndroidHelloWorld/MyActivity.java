package com.example.AndroidHelloWorld;

import android.app.Activity;
import android.os.Bundle;
import com.example.HelloWorld.R;

public class MyActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public int addNumbersGood(int x, int y)
    {
        return x + y;
    }

    public int addNumbersFail(int x, int y)
    {
        throw new IllegalArgumentException();
    }
}