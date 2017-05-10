

# Kartik's Custom Views 

# Project now moved to https://github.com/ikartiks/kartiksCustomViews

This is a UI library for android which allows users to set custom typeface via xml as well as show custom gif images present in your app package.

This text you see here is *actually* written in Markdown! To get a feel for Markdown's syntax, type some text into the left window and watch the results in the right.

### Version 0.8

### Installation

You will need the latest version of android studio, Below are the steps to add this library to an existing project.

* download this project
* To add to you project goto File >> project structure 
* click on + click on import gradle project 
* then click on your app module , and in dependancies tab add the above downloaded project
* go to its build.gradle file of this project and change com.android.application to com.android.library and also remove application icon from its manifest (This will be fixed once we go ahead with official release of library)


### Sample code
`````````` 
<com.kartiks.ui.GifImageView
        android:id="@+id/Loading"
        android:layout_width="36dp"
        android:layout_height="36dp"
        app:gifResourseId="loadinggym.gif"
        android:visibility="gone"
        android:layout_alignParentRight="true"
        android:layout_centerVertical="true"
        android:elevation="@dimen/stdElevationForLoader"
        />
`````````` 
In the loadinggym.gif is stored in the assets folder of your android app.
```````
<com.kartiks.ui.CustomTextView
        android:id="@+id/Name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:ttfResourseName="fonts/s.ttf"
        android:layout_margin="@dimen/stdMarginTopGeneral"
        android:text="@string/app_name"/>
```````
In the above example the the ttf file is stored in fonts folder inside assets.

# License
**Free Software, Hell Yeah!**


