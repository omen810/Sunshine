

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

参数说明：

For temperature in Fahrenheit use units=imperial  为华氏温度使用单位=帝国
For temperature in Celsius use units=metric  为摄氏温度使用单位=公制

## 粘贴代码时，自动导入所需包文件

-1 Android studio 只有import单个包的快捷键：Alt+Enter。没有Eclipse下的快速导入包的快捷键Ctrl+Shift+O。

-2 但Android studio设置里有一项Auto Import自动导入功能。设置过程如下：
Android studio --> File--> Settings --> Editor --> Auto Import:

设置中的参数解释如下，下为转载：

    XML
    Show import popup，这个是用于编辑XML时，自动会弹出一个import的对话框，问你是否需要导入。
    
    Java
    
    Insert imports on paste:(All Ask None),这个其实就是你在复制代码的时候，对于导入的包是否需要进行询问的一个选项。
        All:有需要导入的包名时，会自动导入，不会弹提示框
        ASK:有需要导入的包名时，会弹提示框，问你要不要导入
        None:有需要导入的包名时，不会弹提示框，也不会自动导入。
    
    Show import popup:这个是和上面的Insert imports on paste是不同的项了哈，不要混一起，这个是指当你输入的类的声明没被导入时，会弹出一个选择的对话框。但是这边需要注意下，这个选项其实是有点问题的。不管你勾还是不勾，反正对话框是不会弹出来的，在你输完类名后，声明都自动导入了。所以我估计这个可能是Android Studio的bug。
    Optimize imports on fly：这个其实和快捷键Ctrl+Shift+O/Ctrl+Alt+O是一样的，就是把不用的声明移除掉。
    Add unambiguous imports on the fly：这个就是自动导入功能了，当你输入类名后，声明就被自动导入了。
    Exclude from Import and Completion：这个其实就是你自定义import。可以不用关注，一般来说你是用不上的。
# 分支2：2_get_forecast_data

说明：从网络上获取天气预报数据字符串，并在Logcat中显示

## 菜单按钮

### 图解Android Studio下创建menu布局文件

http://jingyan.baidu.com/article/47a29f24426063c014239931.html?st=2&net_type=&bd_page_type=1&os=0&rst=&word=menu

### 注意检查模拟器的网络是否处于开启状态

# 分支3：3_parse_json_data

说明：解析JSON数据，得到一个字符串数组（数组中包含7天天气预报数据），在Logcat中显示，并更新到ListView中

## 在线解析JSON数据网站

http://www.json.cn/

## 关于时间的获取

谷歌建议不用Time类，而是使用Calendar

https://developer.android.com/reference/java/util/Calendar.html

