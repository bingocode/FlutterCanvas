import 'package:flutter/material.dart';

class ListViewTest extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Widget divider1 = Divider(color: Colors.blue);
    Widget divider2 = Divider(color: Colors.green);

    return Scaffold(
      appBar: AppBar(
        // Here we take the value from the MyHomePage object that was created by
        // the App.build method, and use it to set our appbar title.
        title: Text('ListTest'),
      ),
      body: Center(
        child: ListView.separated(
            itemBuilder: (BuildContext context, int index) {
              return ListTile(
                title: Text("$index"),
              );
            },
            separatorBuilder: (BuildContext context, int index) {
              return index % 2 == 0 ? divider1 : divider2;
            },
            itemCount: 100),
      ),
    );
  }
}
