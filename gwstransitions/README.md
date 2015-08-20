
Usage
=====

In res/anim folder instead of res/transiton:

You need to use application attributes namespase instead of `android:`. For example:

```
<transitionSet xmlns:app="http://schemas.android.com/apk/res-auto"
               app:duration="400">
    <changeBounds/>
    <fade app:fadingMode="fade_in">
        <targets>
            <target app:targetId="@id/transition_title"/>
        </targets>
    </fade>
</transitionSet>
```


Credits
=======

[transitions-everywhere]()