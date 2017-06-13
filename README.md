# DatabindingKotlinIssue
This replicates an issue where when using databinding and the kotlin-kapt plugin we get databinding errors due to not being able to find BindingAdapters in a different module.
  
  
###Steps to reproduce
1. Run ./gradlew clean assembleDebug
2. Look at gradle console and you will see databinding errors

>Caused by: android.databinding.tool.util.LoggedErrorException: Found data binding errors.
****/ data binding error ****msg:Cannot find the setter for attribute 'android:layout_marginLeft' with parameter type float on android.widget.TextView. file:/Users/solcott/projects/DatabindingKotlin/app/src/main/res/layout/test.xml loc:13:41 - 13:57 ****\ data binding error ****'

If you comment out the kotlin-kapt plugin and the kapt dependency in the app module everything works correctly


