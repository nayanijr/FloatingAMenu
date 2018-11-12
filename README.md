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
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24.0"
    android:viewportHeight="24.0">
<path
android:fillColor="#f7f3f3"
android:pathData="M3,17.25V21h3.75L17.81,9.94l-3.75,-3.75L3,17.25zM20.71,7.04c0.39,-0.39 0.39,-1.02 0,-1.41l-2.34,-2.34c-0.39,-0.39 -1.02,-0.39 -1.41,0l-1.83,1.83 3.75,3.75 1.83,-1.83z"/>
    </vector>
#step4


add the following code to photo.xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24.0"
    android:viewportHeight="24.0">
    <path
        android:fillColor="#ece0e0"
        android:pathData="M12,12m-3.2,0a3.2,3.2 0,1 1,6.4 0a3.2,3.2 0,1 1,-6.4 0"/>
    <path
        android:fillColor="#FF000000"
        android:pathData="M9,2L7.17,4L4,4c-1.1,0 -2,0.9 -2,2v12c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2L22,6c0,-1.1 -0.9,-2 -2,-2h-3.17L15,2L9,2zM12,17c-2.76,0 -5,-2.24 -5,-5s2.24,-5 5,-5 5,2.24 5,5 -2.24,5 -5,5z"/>
</vector>



#step5
add the following code to record.xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24.0"
    android:viewportHeight="24.0">
    <path
        android:fillColor="#d2b7b7"
        android:pathData="M12,14c1.66,0 2.99,-1.34 2.99,-3L15,5c0,-1.66 -1.34,-3 -3,-3S9,3.34 9,5v6c0,1.66 1.34,3 3,3zM17.3,11c0,3 -2.54,5.1 -5.3,5.1S6.7,14 6.7,11L5,11c0,3.41 2.72,6.23 6,6.72L11,21h2v-3.28c3.28,-0.48 6,-3.3 6,-6.72h-1.7z"/>
</vector>


#Step6

