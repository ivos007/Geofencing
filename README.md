Phonegap - Geofencing for Android
==========
This is the android version for phonegap geofencing.
The code is modified from native geofencing example: http://developer.android.com/training/location/geofencing.html
This works with phonegap 2.9 on mac

SETUP
==========
1. copy the source code to src/com/example/android/geofence
2. inside the application tag in the AdoridManifext.xml, add 
<service android:name="com.example.android.geofence.ReceiveTransitionsIntentService" android:exported="false"></service>
3. in Java Build Path, add google-play-services.jar external jar from your local android sdk folder (android-sdks/extras/google/google_play_services/libproject/google-play-services_lib/libs/google-play-services.jar)
4. in Android Project Build Target in preference, build target must be Google APIs (worked with 4.2.2)
5. in config.xml, add
    <feature name="DGGeofencing">
      <param name="android-package" value="com.example.android.geofence.DGGeofencing"/>
    </feature>
6. for javascript setup please follow IOS version: https://github.com/radshag/PhoneGap-Geofencing

FUNCTIONS
==========
1. initCallbackForRegionMonitoring - Initializes the PhoneGap Plugin callback.
2. startMonitoringRegion - Starts monitoring a region.

USAGE
==========
please follow IOS version: https://github.com/radshag/PhoneGap-Geofencing

LICENSE
==========
The MIT License

Copyright (c) 2013 Philip Hsu EMAIL: ivos007@yahoo.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.