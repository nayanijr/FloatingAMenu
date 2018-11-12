# FloatingAMenu
It is a round action Button  which will be evolved above other page content. It comes in mini size
Floating action menu provides quick acces to common actions within the app

#Step1 

open android Studio
Create new project
in main > resources> layout > activity main xml 
in activity main.xml  add the following code

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <com.github.clans.fab.FloatingActionMenu
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/floatingActionMenu"
        android:layout_alignParentBottom="true"
        android:layout_alignParentEnd="false"
        android:layout_alignParentRight="true"
        android:layout_margin="16dp"
        app:menu_showShadow="true"
        app:menu_fab_label=""
        app:menu_openDirection="up"
        app:menu_backgroundColor="@android:color/transparent"
        app:menu_labels_textColor="@color/colorText"
        app:menu_labels_colorNormal="@color/colorBackground"
        app:menu_colorPressed="@color/colorAccent">

        <com.github.clans.fab.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_label="@string/photo"
            app:fab_size="mini"
            android:id="@+id/floatingActionPhoto"
            android:src="@drawable/photo" />
        <com.github.clans.fab.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_label="@string/record"
            app:fab_size="mini"
            android:id="@+id/floatingActionRecord"
            android:src="@drawable/record" />
        <com.github.clans.fab.FloatingActionButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fab_label="@string/edit"
            app:fab_size="mini"
            android:id="@+id/floatingActionEdit"
            android:src="@drawable/edit" />


    </com.github.clans.fab.FloatingActionMenu>





</RelativeLayout>

# step2 

resource > drawable> new > vectorasset > create 3 assets
photo,edit and record

# step3

add the following code to edit.xml

![screenshot 1](https://user-images.githubusercontent.com/37542255/48366662-8a92a680-e67c-11e8-9ab4-ecd9dcbd6abb.png)

# step4
add following code to photo.xml
![screenshot 2](https://user-images.githubusercontent.com/37542255/48367355-6afc7d80-e67e-11e8-982a-22b347b911b2.png)


# step5
add following code to record.xml

![screenshot 3](https://user-images.githubusercontent.com/37542255/48367401-8f585a00-e67e-11e8-9a2e-0351442bbfcc.png)

