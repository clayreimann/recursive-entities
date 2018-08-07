/*
 * Copyright 2018 Yahoo Inc. All rights reserved.
 */
package io.elide.recursive;

import com.yahoo.elide.standalone.ElideStandalone;

public class Main {
    public static void main(String[] args) throws Exception {
        ElideStandalone app = new ElideStandalone(new Settings());
        app.start();

    }
}
