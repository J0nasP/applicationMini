import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

const _platform = MethodChannel("hce");

class App extends StatefulWidget {
  @override
  State<StatefulWidget> createState() => _AppState();
}

class _AppState extends State {
  bool _unlocked = false;

  _AppState() : super() {
    _platform.setMethodCallHandler((MethodCall call) async {
      bool unlocked = call.arguments["success"];
      switch (call.method) {
        case "onHCEResult":
          setState(() {
            _unlocked = unlocked;
          });
      }
    });
  }


  @override
  Widget build(BuildContext context) {
    return Lock(unlocked = _unlocked)
  }
}