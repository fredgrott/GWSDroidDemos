package android.util;

/**
 * Dummy class. Permits to extend same hidden class from android framework.
 * Actually in runtime will be used class from android framework and ObjectAnimator
 * optimizations for FloatProperty will be applied.
 * Created by fgrott on 8/19/2015.
 */
public abstract class FloatProperty<T> extends Property<T, Float> {

    public FloatProperty(String name) {
        super(Float.class, name);
    }

    public abstract void setValue(T object, float value);

    @Override
    final public void set(T object, Float value) {
        setValue(object, value);
    }

}
