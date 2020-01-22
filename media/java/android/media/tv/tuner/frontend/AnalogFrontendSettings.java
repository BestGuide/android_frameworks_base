/*
 * Copyright 2019 The Android Open Source Project
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

package android.media.tv.tuner.frontend;

import android.annotation.IntDef;
import android.annotation.NonNull;
import android.annotation.RequiresPermission;
import android.annotation.SystemApi;
import android.content.Context;
import android.hardware.tv.tuner.V1_0.Constants;
import android.media.tv.tuner.TunerUtils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Frontend settings for analog tuner.
 *
 * @hide
 */
@SystemApi
public class AnalogFrontendSettings extends FrontendSettings {
    /** @hide */
    @IntDef(flag = true,
            prefix = "SIGNAL_TYPE_",
            value = {SIGNAL_TYPE_UNDEFINED, SIGNAL_TYPE_AUTO, SIGNAL_TYPE_PAL, SIGNAL_TYPE_PAL_M,
              SIGNAL_TYPE_PAL_N, SIGNAL_TYPE_PAL_60, SIGNAL_TYPE_NTSC, SIGNAL_TYPE_NTSC_443,
              SIGNAL_TYPE_SECAM})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SignalType {}

    /**
     * Undefined analog signal type.
     */
    public static final int SIGNAL_TYPE_UNDEFINED = Constants.FrontendAnalogType.UNDEFINED;
    /**
     * AUTO analog signal type.
     */
    public static final int SIGNAL_TYPE_AUTO = Constants.FrontendAnalogType.AUTO;
    /**
     * PAL analog signal type.
     */
    public static final int SIGNAL_TYPE_PAL = Constants.FrontendAnalogType.PAL;
    /**
     * PAL M analog signal type.
     */
    public static final int SIGNAL_TYPE_PAL_M = Constants.FrontendAnalogType.PAL_M;
    /**
     * PAL N analog signal type.
     */
    public static final int SIGNAL_TYPE_PAL_N = Constants.FrontendAnalogType.PAL_N;
    /**
     * PAL 60 analog signal type.
     */
    public static final int SIGNAL_TYPE_PAL_60 = Constants.FrontendAnalogType.PAL_60;
    /**
     * NTSC analog signal type.
     */
    public static final int SIGNAL_TYPE_NTSC = Constants.FrontendAnalogType.NTSC;
    /**
     * NTSC 443 analog signal type.
     */
    public static final int SIGNAL_TYPE_NTSC_443 = Constants.FrontendAnalogType.NTSC_443;
    /**
     * SECM analog signal type.
     */
    public static final int SIGNAL_TYPE_SECAM = Constants.FrontendAnalogType.SECAM;

    /** @hide */
    @IntDef(flag = true,
            prefix = "SIF_",
            value = {SIF_UNDEFINED, SIF_AUTO, SIF_BG, SIF_BG_A2, SIF_BG_NICAM, SIF_I, SIF_DK,
            SIF_DK1_A2, SIF_DK2_A2, SIF_DK3_A2, SIF_DK_NICAM, SIF_L, SIF_M, SIF_M_BTSC, SIF_M_A2,
            SIF_M_EIAJ, SIF_I_NICAM, SIF_L_NICAM, SIF_L_PRIME})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SifStandard {}

    /**
     * Undefined Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_UNDEFINED = Constants.FrontendAnalogSifStandard.UNDEFINED;
    /**
     * Audo Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_AUTO = Constants.FrontendAnalogSifStandard.AUTO;
     /**
     * BG Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_BG = Constants.FrontendAnalogSifStandard.BG;
    /**
     * BG-A2 Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_BG_A2 = Constants.FrontendAnalogSifStandard.BG_A2;
    /**
     * BG-NICAM Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_BG_NICAM = Constants.FrontendAnalogSifStandard.BG_NICAM;
    /**
     * I Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_I = Constants.FrontendAnalogSifStandard.I;
    /**
     * DK Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_DK = Constants.FrontendAnalogSifStandard.DK;
    /**
     * DK1 A2 Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_DK1_A2 = Constants.FrontendAnalogSifStandard.DK1_A2;
    /**
     * DK2 A2 Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_DK2_A2 = Constants.FrontendAnalogSifStandard.DK2_A2;
    /**
     * DK3 A2 Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_DK3_A2 = Constants.FrontendAnalogSifStandard.DK3_A2;
    /**
     * DK-NICAM Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_DK_NICAM = Constants.FrontendAnalogSifStandard.DK_NICAM;
    /**
     * L Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_L = Constants.FrontendAnalogSifStandard.L;
    /**
     * M Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_M = Constants.FrontendAnalogSifStandard.M;
    /**
     * M-BTSC Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_M_BTSC = Constants.FrontendAnalogSifStandard.M_BTSC;
    /**
     * M-A2 Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_M_A2 = Constants.FrontendAnalogSifStandard.M_A2;
    /**
     * M-EIAJ Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_M_EIAJ = Constants.FrontendAnalogSifStandard.M_EIAJ;
    /**
     * I-NICAM Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_I_NICAM = Constants.FrontendAnalogSifStandard.I_NICAM;
    /**
     * L-NICAM Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_L_NICAM = Constants.FrontendAnalogSifStandard.L_NICAM;
    /**
     * L-PRIME Analog Standard Interchange Format (SIF).
     */
    public static final int SIF_L_PRIME = Constants.FrontendAnalogSifStandard.L_PRIME;


    private final int mSignalType;
    private final int mSifStandard;

    @Override
    public int getType() {
        return FrontendSettings.TYPE_ANALOG;
    }


    /**
     * Gets analog signal type.
     */
    @SignalType
    public int getSignalType() {
        return mSignalType;
    }

    /**
     * Gets Standard Interchange Format (SIF).
     */
    @SifStandard
    public int getSifStandard() {
        return mSifStandard;
    }

    /**
     * Creates a builder for {@link AnalogFrontendSettings}.
     *
     * @param context the context of the caller.
     */
    @RequiresPermission(android.Manifest.permission.ACCESS_TV_TUNER)
    @NonNull
    public static Builder builder(@NonNull Context context) {
        TunerUtils.checkTunerPermission(context);
        return new Builder();
    }

    private AnalogFrontendSettings(int frequency, int signalType, int sifStandard) {
        super(frequency);
        mSignalType = signalType;
        mSifStandard = sifStandard;
    }

    /**
     * Builder for {@link AnalogFrontendSettings}.
     */
    public static class Builder extends FrontendSettings.Builder<Builder> {
        private int mSignalType;
        private int mSifStandard;

        private Builder() {}

        /**
         * Sets analog signal type.
         */
        @NonNull
        public Builder setSignalType(@SignalType int signalType) {
            mSignalType = signalType;
            return this;
        }

        /**
         * Sets Standard Interchange Format (SIF).
         */
        @NonNull
        public Builder setSifStandard(@SifStandard int sifStandard) {
            mSifStandard = sifStandard;
            return this;
        }

        /**
         * Builds a {@link AnalogFrontendSettings} object.
         */
        @NonNull
        public AnalogFrontendSettings build() {
            return new AnalogFrontendSettings(mFrequency, mSignalType, mSifStandard);
        }

        @Override
        Builder self() {
            return this;
        }
    }
}
