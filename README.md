# 分支1：:1_listview_with_fake_data

说明：listview显示数组中的静态天气预报数据

### 创建用户界面

1. 新建Fragment：PlaceholderFragment

   包名上点击右键，选择New--Fragment--Empty Fragment

   并将其布局文件设置如下：

   ```
   <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="match_parent">

       <TextView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="hello_world" />

   </RelativeLayout>
   ```

2. 把MainActivity的布局文件设置如下：

   ```
   <?xml version="1.0" encoding="utf-8"?>
   <FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:tools="http://schemas.android.com/tools"
       android:id="@+id/container"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       tools:context="com.omen.sunshine.MainActivity">

       <fragment
           android:id="@+id/fragment"
           android:name="com.omen.sunshine.PlaceholderFragment"
           android:layout_width="match_parent"
           android:layout_height="match_parent" />
   </FrameLayout>
   ```

## 将Sunshine连接到云端

### OpenWeather网站

网址：<http://openweathermap.org/>

用户名：QQ邮箱，密码：与Github密码一样

已获得的API key：96e93220167db791d98f41de7dca2b00

南宁的City ID：1799869

访问方法：

http://api.openweathermap.org/data/2.5/forecast/city?id=1799869&APPID=96e93220167db791d98f41de7dca2b00

获取7天天气情况的方法：
http://api.openweathermap.org/data/2.5/forecast/daily?id=1799869&mode=json&units=metric&cnt=7&APPID=96e93220167db791d98f41de7dca2b00