# MySequenceLayoutTest
序列佈局

序列佈局包含帶有進度條的一系列步驟。按照順序，它跟隨一個動畫進度條。


1.build.gradle（app）

dependencies {

  implementation 'com.github.transferwise:sequence-layout:1.0.7'
  
}

2.build.gradle（project）

allprojects {

   repositories {
   
      maven { url "https://jitpack.io" }
      
   }  
}

3.xml

<com.transferwise.sequencelayout.SequenceLayout

...>

   <com.transferwise.sequencelayout.SequenceStep
   
    ...>

</com.transferwise.sequencelayout.SequenceLayout>

4.java

import com.transferwise.sequencelayout.SequenceStep;

step3.setActive(true);

聲明step3為活動狀態，進度條將顯示到序列步驟3。


