/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.codegentest;

import android.annotation.NonNull;

import com.android.internal.util.DataClass;

/**
 * Test for some false positive pitfalls for
 * {@link android.processor.staledataclass.StaleDataclassProcessor}
 *
 * Relies on the detector being run, failing the build should any of things here falsely
 * register as stale.
 */
@DataClass(genConstructor = false, genBuilder = false)
public class StaleDataclassDetectorFalsePositivesTest {

    /** Interfaces should be ignored */
    public interface SomeListener {
        void onEvent();
    }

    /** Enums should be ignored */
    private enum SomeEnum { ONE, TWO }

    /** Annotations should be ignored */
    public @interface SomeAnnotation {}

    /* Static initializers should be ignored */
    static {}

    /* Initializers should be ignored */
    {}

    /** Unrelated methods should be noted, without triggering staleness false positives */
    public @NonNull String someMethod(int param) { return null; }



    // Code below generated by codegen v1.0.11.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/tests/Codegen/src/com/android/codegentest/StaleDataclassDetectorFalsePositivesTest.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated(
            time = 1572630439617L,
            codegenVersion = "1.0.11",
            sourceFile = "frameworks/base/tests/Codegen/src/com/android/codegentest/StaleDataclassDetectorFalsePositivesTest.java",
            inputSignatures = "public @android.annotation.NonNull java.lang.String someMethod(int)\nclass StaleDataclassDetectorFalsePositivesTest extends java.lang.Object implements []\n@com.android.internal.util.DataClass(genConstructor=false, genBuilder=false)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
