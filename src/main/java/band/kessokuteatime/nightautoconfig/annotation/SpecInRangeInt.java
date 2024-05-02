package band.kessokuteatime.nightautoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SpecInRangeInt {
    int min() default 0;
    int max() default Integer.MAX_VALUE;

    List<Class<?>> associatedTypes = List.of(Integer.class, int.class);
}
