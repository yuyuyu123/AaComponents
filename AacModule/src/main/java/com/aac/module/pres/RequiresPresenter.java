package com.aac.module.pres;

import com.aac.module.ui.AacPresenter;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPresenter {
    Class<? extends AacPresenter> value();
}
