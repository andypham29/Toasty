# Toasty
If you are not a fan of bland toasts and are looking for toasty toasts, look no further!

You can now make randomize colored toasts!

# Installation
### With gradle:
Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
        }
}
```

Then add the dependency
```
dependencies {
      implementation 'com.github.andypham29:Toasty:*0.1.1*'
      // replace with latest version
}
```
Visit [jetpack](https://jitpack.io/#andypham29/Toasty) for more details on the installation

# Usage
Simply write the following code.
```
ToastyToast.makeRandom(getApplicationContext(), "Hello World!");
```
