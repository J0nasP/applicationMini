import 'package:flutter/material.dart';
import 'login_form.dart';

void main() {
  runApp(const NfcApp());
}

class NfcApp extends StatelessWidget {
  const NfcApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'NFC APP',
      initialRoute: '/user',
      routes: {
        '/': (context) => const LoginForm(),
      },
    );
  }
}
