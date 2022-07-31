# iPrayForGod
[![Android Best practices](https://img.shields.io/badge/Android-best--practices-red)](https://www.android.com/intl/en_in/what-is-android/) [![Kotlin](https://img.shields.io/badge/Kotlin-1.6.10-brightgreen)](https://kotlinlang.org/) [![Coroutines](https://img.shields.io/badge/Coroutines-1.6.0-red)](https://kotlinlang.org/docs/reference/coroutines-overview.html) [![DaggerHilt](https://img.shields.io/badge/DaggerHilt-2.40-blue)](https://developer.android.com/training/dependency-injection/hilt-android) [![Moshi](https://img.shields.io/badge/Moshi-1.13.0-orange)](https://github.com/square/moshi) [![Firebase](https://img.shields.io/badge/Firebase-30.2.0-blueviolet)](https://firebase.google.com/) [![Datastore](https://img.shields.io/badge/Datastore-1.0.0-brightgreen)](https://developer.android.com/topic/libraries/architecture/datastore) [![Timber](https://img.shields.io/badge/Timber-5.0.1-blue)](https://github.com/JakeWharton/timber) [![Orhanobut](https://img.shields.io/badge/orhanobut-2.2.0-lightgrey)](https://github.com/orhanobut/logger) [![Jetpack compose](https://img.shields.io/badge/Jetpack%20Compose-1.1.1-ff69b4)](https://developer.android.com/jetpack/compose/documentation) [![Coil](https://img.shields.io/badge/Coil-1.3.2-008080)](https://github.com/coil-kt/coil) [![Google Material](https://img.shields.io/badge/Google%20Material-1.4.0-3D3635)](https://material.io/develop/android/docs/getting-started) [![Compose Navigation](https://img.shields.io/badge/Compose%20Navigation-2.5.0-7D0541)](https://developer.android.com/guide/navigation/navigation-getting-started) [![Hilt navigation compose](https://img.shields.io/badge/Hilt%20navigation%20compose-1.0.0-DB7093)](https://androidx.tech/artifacts/hilt/hilt-navigation-compose/) [![Activity compose](https://img.shields.io/badge/Activity%20compose-1.5.0-5453A6)](https://androidx.tech/artifacts/activity/activity-compose/) [![Ui tooling preview](https://img.shields.io/badge/Ui%20tooling%20preview-1.1.1-C32148)](https://androidx.tech/artifacts/compose.ui/ui-tooling-preview/) [![Compose ui](https://img.shields.io/badge/Compose%20ui-1.1.1-F6BE00)](https://androidx.tech/artifacts/compose.ui/ui-tooling/) [![Kt lint](https://img.shields.io/badge/Kt%20lint-10.3.0-00FA9A)](https://github.com/pinterest/ktlint) [![Crashlytics](https://img.shields.io/badge/Crashlytics-2.9.1-3B9C9C)](https://firebase.google.com/docs/crashlytics)  






This repository contains a sample project that is developed using the clean architecture with compose and multi-module features

---

### **`𝙿𝚞𝚛𝚎 𝚔𝚘𝚝𝚕𝚒𝚗`** :card_index_dividers:
<img align="left" height="150" width="260" src="https://github.com/devrath/droid-compose-clean-architecture/blob/main/assets/KotlinAndroidStudio.png"  alt="dev_logo"/>

:label: Programming language: :heavy_minus_sign: By migrating away from Java and towards kotlin, we can leverage the features like better readability, null saftey, less code, benifits of improved syntax and others. </br>
:label: Kotlin DSL: :heavy_minus_sign: Earlier we used to use gradle for organizing dependencies. Gradle is written in a groovy programming language. Using the kotlin-DSL, we can organize the dependencies in our project cleaner and in an efficient way. Type safety. This allows better autocompletion which was missing from grovey till now. Code navigation between files becomes easy in Kotlin DSL. Refactoring is much easier. </br>
:label: Compose: :heavy_minus_sign: Earlier we had xml for building the UI and thus there was one more language hooked to android project. But with the addition of jetpack compose, Even the UI will be built in kotlin language.

---

### **`𝚆𝚑𝚢 𝚌𝚕𝚎𝚊𝚗 𝚊𝚛𝚌𝚑𝚒𝚝𝚎𝚌𝚝𝚞𝚛𝚎 𝚒𝚜 𝚗𝚎𝚎𝚍𝚎𝚍`** :card_index_dividers:
<img align="right" height="190" width="410" src="https://github.com/devrath/droid-compose-clean-architecture/blob/main/assets/compose_clean_arch.png"  alt="dev_logo"/>
:label: Scalability: :heavy_minus_sign: When new features are added, using the clean architecture we can easily add the new features and maintain old existing features without breaking them. </br>
:label: Testability: :heavy_minus_sign: For the new features, its essential we write a code that can be tested for all possible inputs so that once in production we can forecast all possible scenarios and handle them. </br>
:label: Understandable: :heavy_minus_sign:  Scaling a product with keeping the code testable is good but its also should be in such a way that everyone should understand it and also should easily be modify it.

---

### **`𝚆𝚑𝚢 𝚖𝚞𝚕𝚝𝚒 𝚖𝚘𝚍𝚞𝚕𝚎 𝚒𝚜 𝚞𝚜𝚎𝚍 𝚒𝚗 𝚙𝚛𝚘𝚓𝚎𝚌𝚝`** :card_index_dividers:
:label: A multi module project helps us to segrigate between the layers of code in the project and enforcing strict seperation of concerns. </br>
:label: When working on a large project this will keep the team to work in layer wise and also feature wise. </br>
:label: A change in one feature will not affect other features in the project. </br>

---

### **`𝙳𝚎𝚙𝚎𝚗𝚍𝚎𝚗𝚌𝚢 𝙸𝚗𝚓𝚎𝚌𝚝𝚒𝚘𝚗`** :card_index_dividers:
<img align="right" height="150" width="160" src="https://github.com/devrath/droid-compose-clean-architecture/blob/main/assets/hilt_img_new.png"  alt="dev_logo"/>
:label: A Depencency Injection results in a loosely coupled programs. It helps to achieve inversion of control. Inversion of control means a object or function recieves another object or function as a dependency. </br>
:label: We use hilt that is built on top of dagger tool that generates code on behalf of user and helps to attain the inversion control easily. This is very essential because all the extra code that we need to generate, hilt will do it for us. </br>
:label: The inversion control becomes even more crucial part of the structure in case of multi module project. </br>
:label: This also helps in unit testing thte code because, since object is not created and instead provided to a function, we can easily mock it during unit testing. </br>

---

### **`𝙲𝚘𝚖𝚖𝚞𝚗𝚒𝚌𝚊𝚝𝚒𝚘𝚗 𝚋𝚎𝚝𝚠𝚎𝚎𝚗 𝚝𝚑𝚎 𝚕𝚊𝚢𝚎𝚛𝚜`** :card_index_dividers:
<img align="left" height="250" width="250" src="https://github.com/devrath/iPrayForGod/blob/main/assets/Clean-architecture-layered-interaction.png"  alt="dev_logo"/>
:label: Presentation Layer: :heavy_minus_sign: This layer is the UI layer of the application, It contains composables and view-models. The presentation layer communicates with the domain layer, But the presentation layer is not aware of the data layer. </br> 
:label: Domain Layer: :heavy_minus_sign: This layer contains use cases that contain business logic that perform one functionality each. It also contains the interfaces that communicates with repository which is present in the data layer. </br>
:label: Data Layer: :heavy_minus_sign: The data layer contains the repositries, The repository can be a preference repository, remote API, local-filesystem etc. The data layer communicates back with the domain layer after fetching the data. </br>

---

### **`𝙰𝚍𝚟𝚊𝚗𝚝𝚊𝚐𝚎𝚜 𝚊𝚗𝚍 𝙳𝚒𝚜𝚊𝚍𝚟𝚊𝚗𝚝𝚊𝚐𝚎𝚜 𝚘𝚏 𝚖𝚞𝚕𝚝𝚒 𝚖𝚘𝚍𝚞𝚕𝚎 𝚊𝚛𝚌𝚑𝚒𝚝𝚎𝚌𝚝𝚞𝚛𝚎`** :card_index_dividers:
#### **`𝙰𝚍𝚟𝚊𝚗𝚝𝚊𝚐𝚎𝚜`**
| `Clear separation` | `Faster build time` |
| ------------ | -------------- |
| • Each of the modules is a library and it can depend on each other <br> • If there is a scenario where one library is not dependent on another, Then they can't access each other <br> • Thus, instead of adding terms of separate packages in the app module, we can enforce strict modularity by modularising it <br> • In a large project and big team we can enforce, who works on which project. Thus one person working on one won't affect other modules| • Using the multi-module we can decrease the build time. When in multi-module each module will use separate threads so build time will decrease since all modules will build independently <br> • Since Gradle needs to build the module that has been changed, it doesn't need to make the modules that have not been changed <br> • Point to note here is that, say there is a root module with few child modules, if the root module changes, all the child modules also need to rebuild <br> • Support for `instant apps` and `dynamic feature module` <br> • Using this we can make parts of our app reusable |

#### **`𝙳𝚒𝚜𝚊𝚍𝚟𝚊𝚗𝚝𝚊𝚐𝚎𝚜`**
 • Lot of initial code <br>
 • Not knowing what problem it will cause
 
 ---
 

#### **`𝙼𝚅𝚅𝙼 𝚜𝚝𝚛𝚞𝚌𝚝𝚞𝚛𝚎 𝚞𝚜𝚎𝚍 𝚒𝚗 𝚖𝚞𝚕𝚝𝚒-𝚖𝚘𝚍𝚞𝚕𝚎 𝚏𝚘𝚛 𝚌𝚕𝚎𝚊𝚗 𝚊𝚛𝚌𝚑𝚒𝚝𝚎𝚌𝚝𝚞𝚛𝚎`**


<p align="right" >
<img align="left" height="300" width="300" src="https://github.com/devrath/iPrayForGod/blob/main/assets/mvvm_structure.png" alt="mvvm"/>
<img align="left" height="300" width="400" src="https://github.com/devrath/iPrayForGod/blob/main/assets/skeletal_structure_new.png" alt="mvvm-improved"/>
</p>
 
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
 
 ---
 
## **`𝙲𝚘𝚍𝚎 𝚚𝚞𝚊𝚕𝚒𝚝𝚢`**
  
##### **`Run Kt lint`**
:label: It is static code analysis tool that is used to analyze the Kotlin code for you. It will check if you have written the code by following the Kotlin code guidelines or not.

```gradle
./gradlew ktlintCheck   
```
 
 ---
 
## **`𝙷𝚘𝚠 𝚝𝚘 𝚛𝚞𝚗 𝚝𝚑𝚎 𝚜𝚊𝚖𝚙𝚕𝚎 𝚊𝚙𝚙𝚕𝚒𝚌𝚊𝚝𝚒𝚘𝚗`** :card_index_dividers:
:label: Basically You just follow steps to create a firebase account and eanable authentication module, I have summarized some steps below.<br/>
:label: :one: Before running the sample application, Please create a account in firebase console.<br/>
:label: :two: Now enable the authentication in settings for firebase(This is used during the authentication of login).<br/>
:label: :three: Add the google-services.json in the app level of the project that is obtained when creating a project in firebase.<br/> 
:label: :four: Last but not least add your application SHA in your firebase settings.<br/>

