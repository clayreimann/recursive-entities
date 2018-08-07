/*
 * Copyright 2018 Yahoo Inc. All rights reserved.
 */
package io.elide.recursive;

import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

public class Settings implements ElideStandaloneSettings {
    @Override
    public String getModelPackageName() {
        return "io.elide.recursive.beans";
    }
}
