# Card View Example

## Card View Usage
This repository contains a simple AndroidStudio project with a custom built CardView xml layout, and an Activity that shows it.

The sole purpouse of this repository is to give an example of how a CardView is built and how you can show it on screen as part of an activity.

The Image below shows the layout that I have built for the custom Card View:

![alt text][screenshot]
[screenshot]: http://i.imgur.com/vx5QCCu.png "Card View Screenshot"

<b>PS:</b> All images used on this example do not belong to me.

## Libraries used
To develop this example I've made use of these two libraries: 

### Card View
To be able to use and manipulate CardViews in your project it is necessary to have the following dependecy added to your build.gradle(Module:app) file:
```
compile 'com.android.support:cardview-v7:24.2.1'
```
<b>PS:</b> As of <b>10.07.2016</b>,the most recent version of the cardview support library is <b>24.2.1</b>. 

Depending on when you are vewing this example, a new version might already be avaiable. In such case Android Studio will advise you to change the version to the newest one. 

<b>PS2:</b> This dependency is already added in this project.

### Caligraphy
I have also made use of the caligraphy library in order to help me use custom fonts: _Roboto-Bold_, _Roboto-Medium_ and _Roboto-Regular_

The Github page of the library is: https://github.com/chrisjenx/Calligraphy

You can easily use it in your project adding this line of code to your build.gradle(Module:app) dependencies: 
```
compile 'uk.co.chrisjenx:calligraphy:2.2.0'
```
<b>PS:</b> This dependency is also already added in this project.
