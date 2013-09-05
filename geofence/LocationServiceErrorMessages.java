/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.geofence;

import com.google.android.gms.common.ConnectionResult;

import android.content.Context;

/**
 * Map error codes to error messages.
 */
public class LocationServiceErrorMessages {
    // Don't allow instantiation
    private LocationServiceErrorMessages () {}

    public static String getErrorString(Context context, int errorCode) {

        // Define a string to contain the error message
        String errorString = "error";

        // Decide which error message to get, based on the error code.
        switch (errorCode) {

            case ConnectionResult.DEVELOPER_ERROR:
                break;

            case ConnectionResult.INTERNAL_ERROR:
                break;

            case ConnectionResult.INVALID_ACCOUNT:
                break;

            case ConnectionResult.LICENSE_CHECK_FAILED:
                break;

            case ConnectionResult.NETWORK_ERROR:
                break;

            case ConnectionResult.RESOLUTION_REQUIRED:
                break;

            case ConnectionResult.SERVICE_DISABLED:
                break;

            case ConnectionResult.SERVICE_INVALID:
                break;

            case ConnectionResult.SERVICE_MISSING:
                break;

            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED:
                break;

            case ConnectionResult.SIGN_IN_REQUIRED:
                break;

            default:
                break;
        }

        // Return the error message
        return errorString;
    }
}
