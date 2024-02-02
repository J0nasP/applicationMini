package com.example.application

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)
        flutterView.addFirstFrameListener {
            if (intent.hasExtra("success")) {
                onHCEResult(ntent)
            }
        }
    }
    
    override fun OnNewIntent(intent: Intent?) {
        super.OnNewIntent(intent)
        if (intent?.hasExtra("success") == true) {
            onHCEResult(intent)
        }

    }

    private fun onHCEResult(intent: Intent) {
        channel.invokeMethod("onHCEResult", success)
    }



}

