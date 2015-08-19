
Usage
=====

Import the custom namespace (app, rdv, your choice) into your layout, below the android schema:

    xmlns:rdv="http://schemas.android.com/apk/res-auto"


Then wrap any layout with a com.grottworkshop.gwsripple.RippleDecoratorView element:

```
<com.grottworkshop.gwsripple.RippleDecoratorView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:layout_gravity="center_horizontal"
      android:layout_margin="4dp"
      rdv:rdv_rippleColor="@android:color/holo_blue_dark"
      rdv:rdv_rippleAnimationFrames="60"
      rdv:rdv_rippleAnimationPeakFrame="15"
      rdv:rdv_rippleMaxAlpha="0.8"
      rdv:rdv_rippleAnimationDuration="600"
      rdv:rdv_rippleRadius="50dp">

         <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:padding="4dp" />

    </com.grottworkshop.gwsripple.RippleDecoratorView>

```


Credits
=======

[Francisco Estevez's RippleDecoratorView]()