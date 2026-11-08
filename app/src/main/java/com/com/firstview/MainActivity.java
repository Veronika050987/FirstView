package com.com.firstview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="8dp">

        <EditText
    android:id="@+id/urlInput"
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    android:hint="Адрес сайта"
    android:inputType="textUri"
    android:imeOptions="actionGo"
    android:maxLines="1"
    android:autofillHints="" />

        <Button
    android:id="@+id/goButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Перейти" />
    </LinearLayout>

    <WebView
    android:id="@+id/webView"
    android:layout_width="match_parent"
    android:layout_height="0dp"
    android:layout_weight="1" />
</LinearLayout>
}