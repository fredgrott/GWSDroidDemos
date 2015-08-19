
Usage
=====

```
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:shadow="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.grottworkshop.gwszdepthshadow.ZDepthShadowLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        shadow:z_depth="z_depth1"
        shadow:z_depth_shape="rect"
        shadow:z_depth_padding="z_depth5">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Change ZDepth"
            android:background="@android:color/white"/>

    </com.grottowrkshop.gwszdepthshadow.ZDepthShadowLayout>

</RelativeLayout>
```


configuration


```
<com.grottworkshop.gwszdepthshadow.ZDepthShadowLayout
    shadow:z_depth="z_depth1"         // enum
    shadow:z_depth_shape="rect"       // enum
    shadow:z_depth_padding="z_depth5" // enum
    shadow:z_depth_animDuration="150" // integer
    shadow:z_depth_doAnim="true"      // boolean
/>
```





Credits
=======


[Shogo Mizumoto's ZDepthShadowLayout]()