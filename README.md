# MyButterKnife

### 一个曾经用过的一个ButterKnife

#### 步骤一 添加依赖
```java  
 compile 'com.jakewharton:butterknife:7.0.1'
```

#### 步骤二 编写布局文件
```java  
  
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="butterknife.butterknife.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</android.support.constraint.ConstraintLayout>
  
```

#### 代码绑定吧
```java 

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.user)
    EditText username;
    @Bind(R.id.pass)
    EditText password;
    @OnClick(R.id.submit)
    public void submit() {
        Toast.makeText(this,"点击了",Toast.LENGTH_SHORT).show();
    }
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
        ButterKnife.bind(this);
    }
}
```
