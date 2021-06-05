# ***\*第一章\**** ***\*系统\*******\*需求分析\****

## ***\*1.1 目标用户需求分析\****

***\*一·问卷设计\****

1.题目数量设置：考虑到现在快节奏的生活，设计问卷选择精简，因为冗长的问卷可能用户在填写的过程中认真度会下降。

2.题目内容设置：鉴于这个app开发是所有人都会使用，所以题目内容是针对普遍人群。

***\*二·问卷内容\****

1

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps1.png)  

2

 ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps2.png)

3

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps3.png)  

4

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps4.png)  

5

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps5.png)   

6 

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps6.png)       

7![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps7.jpg)

8![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps8.png)

9

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps9.jpg) 

***\*分析用户需求:\****

1.目标人群：普遍会经常使用电脑的人群

2.界面主题色由于是放在桌面的，所以为了整洁，不影响其他壁纸，更好的让使用者使用，打算灰色透明

3.功能文件搜索、整理桌面这些进行优化，不提供热点新闻的打开按钮，做到简约，让使用者更方便

4.由于该软件是为了让经常使用电脑的人群方便记下自己要做的事，便于提醒会在添加类似闹钟的功能（在能力范围内会进行优化）

 

## ***\*1.2\**** ***\*产品功能性需求\****

（1）日期时间的显示；

（2）文件搜索的准确；

（3）方便用户实现截屏功能；

（4）贪吃蛇小游戏的实现；

（5）记录时光功能的实现；

（6）方便打开计算器、记事本、画图等应用程序的实现；



# ***\*第二章\**** ***\*系统\*******\*设计\****

## ***\*2.1 产品总体架构\****

1

## ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps10.jpg) 

2

 

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps11.png) 

 

3

## ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps12.png) 

4

## ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps13.png)***\*5\****

 

## ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps14.png) 

6

## ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps15.png) 

7

## ![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps16.png)***\*2\*******\*.2\**** ***\*产品功能设计\****

（1）Deskhelp类：该类是总体构架的实现类，在该类中实例化各种类，最终达到总体功能的实现的效果；

（2）Snake1类:该类是一个贪吃蛇小游戏，供用户在休闲之余放松心情，该游戏是用来上下左右控制蛇的方向，寻找吃的东西，每吃一口就能得到一定的积分，而且蛇的身子会越吃越长，身子越长,游戏难度就越大，不能碰墙，不能咬到自己的身体，更不能咬自己的尾巴；

（3）fileSearch类：该类是实现本地文件搜索的类，供用户在需要文件但忘记具体放在那儿时使用，该功能是需要输入文件名，再输入盘符，就可以进行搜索，再一定程度上可以节省寻找的时间；

（4）Jilu类：该类是一个记录时光和记录事件的类，供用户方便的记录自己一天发生的事，有具体时间的显示，和具体用户做的事，在用户过去很多年后，也可以翻看自己在某年某月某日做了什么事，可以很好的记录时光，也可以在这天记录自己需要干的事情，起到备忘录的作用；

（5）ScreenShotWindow类：该类是实现截屏功能的类，该功能是实现用户实时截屏，任意截屏并且进行保存，与电脑自带的截取全屏有一定的区别；

（6）Lunlar类：实现农历日期和生肖的显示，由于中国农历的特殊性以及用户群体面向大众，农历日期也是大众容易忘记，但是有时候是需要的，农历日期的显示给大众带来一定的方便；

 

##  

## ***\*2.\*******\*3\**** ***\*产品界面设计\****

1

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps17.jpg) 

2

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps18.jpg) 

3

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps19.jpg) 

4

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps20.jpg) 



# ***\*第三章\**** ***\*系统\*******\*实现\****

## ***\*3.\*******\*1\**** ***\*产品开发平台及工具\****

Eclipse

## ***\*3.2 产品实现设计\****

1

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps21.jpg) 

2

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps22.jpg) 

3

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps23.jpg) 

4

![img](file:///C:\Users\zrf\AppData\Local\Temp\ksohtml8720\wps24.jpg) 

## ***\*3.3 产品主要代码片段\****

3.3.1界面代码

***\*public\**** Deskhelp() {

setTitle("桌面助手");

setBounds(100, 100, 400, 220);

setResizable(***\*false\****);

getContentPane().setBackground(Color.***\**black\**\***);		 setDefaultCloseOperation(JFrame.***\**EXIT_ON_CLOSE\**\***);

// 总面板

JPanel panel = ***\*new\**** JPanel();

panel.setBorder(***\*new\**** LineBorder(Color.***\**WHITE\**\***));

panel.setOpaque(***\*false\****);

getContentPane().add(panel,BorderLayout.***\**NORTH\**\***);

panel.setLayout(***\*new\**** BoxLayout(panel, BoxLayout.***\**Y_AXIS\**\***));

 

// 第一个面板

JPanel panel_1 = ***\*new\**** JPanel(***\*new\**** GridLayout(1, 3));

panel_1.setOpaque(***\*false\****);

panel.add(panel_1);

JLabel time = ***\*new\**** JLabel();

time.setForeground(Color.***\**white\**\***);

time.setOpaque(***\*false\****);

time.setBounds(30, 0, 900, 130);

time.setFont(***\*new\**** Font("微软雅黑", Font.***\**BOLD\**\***, 60));

***\*this\****.setTimer(time)；

panel_1.add(time);

JLabel weather = ***\*new\**** JLabel("每一天都是要开心的一天哟~♪");

weather.setForeground(Color.***\**WHITE\**\***);

weather.setOpaque(***\*false\****);

weather.setBackground(***\*new\**** Color(0, 0, 0));

panel_1.add(weather);

 

// 第二个面板

JPanel panel_4 = ***\*new\**** JPanel(***\*new\**** GridLayout(1, 4));

panel_4.setOpaque(***\*false\****);

panel.add(panel_4);

 

JLabel Shengxiao = ***\*new\**** JLabel("生肖");

Shengxiao.setForeground(Color.***\**WHITE\**\***);

***\*this\****.setSx(Shengxiao);

panel_4.add(Shengxiao);

 

JLabel lunar = ***\*new\**** JLabel("农历日期");

lunar.setForeground(Color.***\**WHITE\**\***);

lunar.setOpaque(***\*false\****);

***\*this\****.setCalendar(lunar);

panel_4.add(lunar);

 

JLabel date = ***\*new\**** JLabel();

date.setForeground(Color.***\**white\**\***);

date.setOpaque(***\*false\****);

***\*this\****.setDate(date);

panel_4.add(date);

JLabel week = ***\*new\**** JLabel();

week.setForeground(Color.***\**white\**\***);

week.setOpaque(***\*false\****);

***\*this\****.setWeek(week);

panel_4.add(week);

 

JSeparator separator = ***\*new\**** JSeparator();

separator.setPreferredSize(***\*new\**** Dimension(***\*this\****.getWidth(), 1));

separator.setBackground(***\*new\**** Color(153, 153, 153));

panel.add(separator);

 

// 第三个面板

JPanel panel_2 = ***\*new\**** JPanel(***\*new\**** GridLayout(0, 3, 0, 0));

panel_2.setOpaque(***\*false\****);

panel.add(panel_2);

// 游戏贪吃蛇

JButton btnNewButton = ***\*new\**** JButton("游戏",

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\desk.png"));

btnNewButton.setForeground(Color.***\**WHITE\**\***);

btnNewButton.setContentAreaFilled(***\*false\****);

btnNewButton.setBorderPainted(***\*false\****);

JButton button_2 = ***\*new\**** JButton("搜索",

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\搜索--1.png"));

button_2.setForeground(Color.***\**WHITE\**\***);

button_2.setContentAreaFilled(***\*false\****);

button_2.setBorderPainted(***\*false\****);

button_2.setBackground(***\*new\**** Color(0, 0, 0));

JButton btnNewButton_1 = ***\*new\**** JButton("背景设置",

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\背景设置.png"));

btnNewButton_1.setForeground(Color.***\**WHITE\**\***);

btnNewButton_1.setContentAreaFilled(***\*false\****);

btnNewButton_1.setBorderPainted(***\*false\****);

btnNewButton_1.setBackground(***\*new\**** Color(0, 0, 0));

JSeparator separator_1 = ***\*new\**** JSeparator();

separator_1.setPreferredSize(***\*new\**** Dimension(***\*this\****.getWidth(), 1));

separator_1.setBackground(***\*new\**** Color(255, 255, 255));

panel.add(separator_1);

 

// 第四个面板

JPanel panel_3 = ***\*new\**** JPanel(***\*new\**** GridLayout(1, 6));

panel_3.setOpaque(***\*false\****);

panel.add(panel_3);

// 截屏

JButton button_3 = ***\*new\**** JButton(

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\截屏.png"));

button_3.setForeground(Color.***\**WHITE\**\***);

button_3.setContentAreaFilled(***\*false\****);

button_3.setBorderPainted(***\*false\****);

button_3.setBackground(***\*new\**** Color(0, 0, 0));

// 记事本

JButton button_5 = ***\*new\**** JButton(

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\记事本.png"));

button_5.setForeground(Color.***\**WHITE\**\***);

button_5.setContentAreaFilled(***\*false\****);

button_5.setBorderPainted(***\*false\****);

button_5.setBackground(***\*new\**** Color(0, 0, 0));	panel_3.add(button_5);

// 计算器

JButton button_6 = ***\*new\**** JButton(

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\计算器.png"));

button_6.setForeground(Color.***\**WHITE\**\***);

button_6.setContentAreaFilled(***\*false\****);

button_6.setBorderPainted(***\*false\****);

button_6.setBackground(***\*new\**** Color(0, 0, 0));

panel_3.add(button_6);

 

// 画图

JButton button_13 = ***\*new\**** JButton(

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\画图.png"));

button_13.setForeground(Color.***\**WHITE\**\***);

button_13.setContentAreaFilled(***\*false\****);

button_13.setBorderPainted(***\*false\****);

button_13.setBackground(***\*new\**** Color(0, 0, 0));

panel_3.add(button_13);

 

// 锁屏

JButton button_7 = ***\*new\**** JButton(

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\锁屏.png"));

button_7.setForeground(Color.***\**WHITE\**\***);

button_7.setContentAreaFilled(***\*false\****);

button_7.setBorderPainted(***\*false\****);

button_7.setBackground(***\*new\**** Color(0, 0, 0));

panel_3.add(button_7);

 

// 上网

JButton button_8 = ***\*new\**** JButton(

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\上网.png"));

button_8.setForeground(Color.***\**WHITE\**\***);

button_8.setContentAreaFilled(***\*false\****);

button_8.setBorderPainted(***\*false\****);

button_8.setBackground(***\*new\**** Color(0, 0, 0));

panel_3.add(button_8);

JSeparator separator_2 = ***\*new\**** JSeparator();

 

separator_2.setPreferredSize(***\*new\**** Dimension(***\*this\****.getWidth(), 1));

separator_2.setBackground(***\*new\**** Color(153, 153, 153));

panel.add(separator_2);

 

// 第五个面板

//添加待办事项面板

JPanel panel_5 = ***\*new\**** JPanel();

panel_5.setOpaque(***\*false\****);

getContentPane().add(panel_5, BorderLayout.***\**CENTER\**\***);

 

JButton button_12 = ***\*new\**** JButton("备忘录",

***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\添加待办事项.png"));

button_12.setForeground(Color.***\**WHITE\**\***);

button_12.setContentAreaFilled(***\*false\****);

button_12.setBorderPainted(***\*false\****);

***\*public\**** ***\*static\**** ***\*void\**** main(String[] args) {

​		***\*new\**** Deskhelp();

​	}

3.3.2功能代码

// 这是显示时间代码

​	***\*private\**** ***\*void\**** setTimer(JLabel time) {

​		***\*final\**** JLabel varTime = time;

​		// 匿名类

​		// Timer类以指定的时间间隔触发一个或多个actionevent，设置计时器涉及创建一个计时器对象，

​		// 在其上注册一个或多个操作监听器，然后使用start方法启动计时器。例如，下面的代码创建并启动

​		// 一个timer每秒触发一次动作事件(由Timer构造函数的第一个参数指定)。

​		// Timer构造函数的第二个参数指定一个监听器来接收Timer的动作事件。

​		Timer timeAction = ***\*new\**** Timer(100, ***\*new\**** ActionListener() {

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				***\*long\**** timemillis = System.**currentTimeMillis**();// 返回当前时间

​				// 转换日期显示格式

​				SimpleDateFormat df = ***\*new\**** SimpleDateFormat("HH:mm");

​				varTime.setText(df.format(***\*new\**** Date(timemillis)));

​			}

​		});

​		timeAction.start();

​	}

 

3.3功能代码

 

// 显示生肖

***\*public\**** ***\*void\**** setSx(JLabel Shengxiao) {

​		Calendar today = Calendar.**getInstance**();

​		Lunar lunar1 = ***\*new\**** Lunar(today);

​		String mLunar = lunar1.cyclical() + "•" + lunar1.animalsYear();

​		Shengxiao.setText(mLunar);

​	}		

 

//关键代码

//传入 offset 传回干支, 0=甲子

***\*final\**** ***\*public\**** String cyclical() {

​			***\*int\**** num = year - 1900 + 36;

​			***\*return\**** (cyclicalm(num));

​		}

***\*final\**** ***\*private\**** String cyclicalm(***\*int\**** num) {

​			***\*final\**** String[] Gan = ***\*new\**** String[] { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸" };

​			***\*final\**** String[] Zhi = ***\*new\**** String[] { "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥" };

​			***\*return\**** (Gan[num % 10] + Zhi[num % 12]);

​		}

***\*final\**** ***\*public\**** String animalsYear() {

​			***\*final\**** String[] Animals = ***\*new\**** String[] { "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪" };

​			***\*return\**** Animals[(year - 4) % 12];

​		}

​	

​	

// 显示农历日期

​	***\*public\**** ***\*void\**** setCalendar(JLabel lunar) {

​		Calendar today = Calendar.**getInstance**();

​		Lunar lunar1 = ***\*new\**** Lunar(today);

​		String mLunar = lunar1.toString();

​		lunar.setText(mLunar);

​	}

​	***\*class\**** Lunar {

​		***\*private\**** ***\*int\**** year;

​		***\*private\**** ***\*int\**** month;

​		***\*private\**** ***\*int\**** day;

​		***\*private\**** ***\*boolean\**** leap;

​		***\*final\**** String chineseNumber[] = { "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二" };

​		SimpleDateFormat chineseDateFormat = ***\*new\**** SimpleDateFormat("yyyy年MM月dd日");

​		***\*final\**** ***\*long\****[] lunarInfo = ***\*new\**** ***\*long\****[] { 0x04bd8, 0x04ae0, 0x0a570, 0x054d5, 0x0d260, 0x0d950, 0x16554, 0x056a0,

​				0x09ad0, 0x055d2, 0x04ae0, 0x0a5b6, 0x0a4d0, 0x0d250, 0x1d255, 0x0b540, 0x0d6a0, 0x0ada2, 0x095b0,

​				0x14977, 0x04970, 0x0a4b0, 0x0b4b5, 0x06a50, 0x06d40, 0x1ab54, 0x02b60, 0x09570, 0x052f2, 0x04970,

​				0x06566, 0x0d4a0, 0x0ea50, 0x06e95, 0x05ad0, 0x02b60, 0x186e3, 0x092e0, 0x1c8d7, 0x0c950, 0x0d4a0,

​				0x1d8a6, 0x0b550, 0x056a0, 0x1a5b4, 0x025d0, 0x092d0, 0x0d2b2, 0x0a950, 0x0b557, 0x06ca0, 0x0b550,

​				0x15355, 0x04da0, 0x0a5d0, 0x14573, 0x052d0, 0x0a9a8, 0x0e950, 0x06aa0, 0x0aea6, 0x0ab50, 0x04b60,

​				0x0aae4, 0x0a570, 0x05260, 0x0f263, 0x0d950, 0x05b57, 0x056a0, 0x096d0, 0x04dd5, 0x04ad0, 0x0a4d0,

​				0x0d4d4, 0x0d250, 0x0d558, 0x0b540, 0x0b5a0, 0x195a6, 0x095b0, 0x049b0, 0x0a974, 0x0a4b0, 0x0b27a,

​				0x06a50, 0x06d40, 0x0af46, 0x0ab60, 0x09570, 0x04af5, 0x04970, 0x064b0, 0x074a3, 0x0ea50, 0x06b58,

​				0x055c0, 0x0ab60, 0x096d5, 0x092e0, 0x0c960, 0x0d954, 0x0d4a0, 0x0da50, 0x07552, 0x056a0, 0x0abb7,

​				0x025d0, 0x092d0, 0x0cab5, 0x0a950, 0x0b4a0, 0x0baa4, 0x0ad50, 0x055d9, 0x04ba0, 0x0a5b0, 0x15176,

​				0x052b0, 0x0a930, 0x07954, 0x06aa0, 0x0ad50, 0x05b52, 0x04b60, 0x0a6e6, 0x0a4e0, 0x0d260, 0x0ea65,

​				0x0d530, 0x05aa0, 0x076a3, 0x096d0, 0x04bd7, 0x04ad0, 0x0a4d0, 0x1d0b6, 0x0d250, 0x0d520, 0x0dd45,

​				0x0b5a0, 0x056d0, 0x055b2, 0x049b0, 0x0a577, 0x0a4b0, 0x0aa50, 0x1b255, 0x06d20, 0x0ada0 };

 

​		// ====== 传回农历 y年的总天数

​		***\*final\**** ***\*private\**** ***\*int\**** yearDays(***\*int\**** y) {

​			***\*int\**** i, sum = 348;

​			***\*for\**** (i = 0x8000; i > 0x8; i >>= 1) {

​				***\*if\**** ((lunarInfo[y - 1900] & i) != 0)

​					sum += 1;

​			}

​			***\*return\**** (sum + leapDays(y));

​		}

​		// ====== 传回农历 y年闰月的天数

​		***\*final\**** ***\*private\**** ***\*int\**** leapDays(***\*int\**** y) {

​			***\*if\**** (leapMonth(y) != 0) {

​				***\*if\**** ((lunarInfo[y - 1900] & 0x10000) != 0)

​					***\*return\**** 30;

​				***\*else\****

​					***\*return\**** 29;

​			} ***\*else\****

​				***\*return\**** 0;

​		}

​		// ====== 传回农历 y年闰哪个月 1-12 , 没闰传回 0

​		***\*final\**** ***\*private\**** ***\*int\**** leapMonth(***\*int\**** y) {

​			// 1111

​			// 1010110101010000

​			***\*return\**** (***\*int\****) (lunarInfo[y - 1900] & 0xf);

​		}

​		// ====== 传回农历 y年m月的总天数

​		***\*final\**** ***\*private\**** ***\*int\**** monthDays(***\*int\**** y, ***\*int\**** m) {

​			***\*if\**** ((lunarInfo[y - 1900] & (0x10000 >> m)) == 0)

​				***\*return\**** 29;

​			***\*else\****

​				***\*return\**** 30;

​		}

 

 

// 显示日期代码

​	***\*private\**** ***\*void\**** setDate(JLabel date) {

​		***\*final\**** JLabel varDate = date;

​		// 匿名类

​		// Timer类以指定的时间间隔触发一个或多个actionevent，设置计时器涉及创建一个计时器对象，在其上注册一个或多个操作监听器，然后使用start方法启动计时器。例如，下面的代码创建并启动一个timer每秒触发一次动作事件(由Timer构造函数的第一个参数指定)。

​		// Timer构造函数的第二个参数指定一个监听器来接收Timer的动作事件。

​		Timer timeAction = ***\*new\**** Timer(100, ***\*new\**** ActionListener() {

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				***\*long\**** timemillis = System.**currentTimeMillis**();// 返回当前时间

​				// 转换日期显示格式

​				SimpleDateFormat df = ***\*new\**** SimpleDateFormat("MM月dd日");

​				varDate.setText(df.format(***\*new\**** Date(timemillis)));

​			}

​		});

​		timeAction.start();

​	}

 

 

// 显示星期代码

​	***\*private\**** ***\*void\**** setWeek(JLabel week) {

​		Date date = ***\*new\**** Date();

​		SimpleDateFormat dateFm = ***\*new\**** SimpleDateFormat("EEEE");

​		week.setText(dateFm.format(date));

​	}

***\*
\****// 显示游戏代码

//布局

​    add(label);

​    label.setBounds(500, 10, 80, 20);

​    label.setForeground(Color.***\**white\**\***);

​    label.setFont(f);

​    add(Score);

​    Score.setBounds(500, 35, 80, 20);

​    Score.setForeground(Color.***\**white\**\***);

​    Score.setFont(f);

​    add(label2);

​    label2.setBounds(500, 60, 80, 20);

​    label2.setFont(f);

​    label2.setForeground(Color.***\**white\**\***);

​    add(Time);

​    Time.setBounds(500, 85, 80, 20);

​    Time.setFont(f);

​    Time.setForeground(Color.***\**white\**\***);

​    add(p);

​    p.setBounds(498, 110, 93, 1);

​    p.setBorder(BorderFactory.**createLineBorder**(Color.***\**black\**\***));

​    p.setForeground(Color.***\**white\**\***);

​    add(label3);

​    label3.setBounds(500, 115, 80, 20);

​    label3.setFont(f);

​    label3.setForeground(Color.***\**white\**\***);

​    add(explain);

​    explain.setBounds(498, 138, 100, 350);

​    explain.setFont(f2);

​    explain.setForeground(Color.***\**white\**\***);

​    explain.setLineWrap(***\*true\****);//换行符

​    explain.setOpaque(***\*false\****); 

 

//关键代码

  ***\*for\****(***\*int\**** i = 0; i < MAX_SIZE;i++)//身体长度存储到数组

​    {

​      body[i] = ***\*new\**** Tile(0,0);

​    }

​    

​    addKeyListener(***\*new\**** KeyAdapter() {//接收键盘事件

​      ***\*public\**** ***\*void\**** keyPressed(KeyEvent e) {//按下某个键时调用

​        ***\*super\****.keyPressed(e);

​        ***\*if\****(e.getKeyCode() == KeyEvent.***\**VK_RIGHT\**\***)//右键

​        {

​          ***\*if\****(isrun && current_direction != "L")

​          {

​            direction = "R";

​          }

​        }

​        ***\*if\****(e.getKeyCode() == KeyEvent.***\**VK_LEFT\**\***)//左键

​        {

​          ***\*if\****(isrun && current_direction != "R")

​          {

​            direction = "L";

​          }

​        }

​        ***\*if\****(e.getKeyCode() == KeyEvent.***\**VK_UP\**\***)//上

​        {

​          ***\*if\****(isrun && current_direction != "D")

​          {

​            direction = "U";

​          }

​        }

​        ***\*if\****(e.getKeyCode() == KeyEvent.***\**VK_DOWN\**\***)//下

​        {

​          ***\*if\****(isrun && current_direction != "U")

​          {

​            direction = "D";

​          }

​        }

​        ***\*if\****(e.getKeyCode() == KeyEvent.***\**VK_ESCAPE\**\***)// Esc 键，重第一次位置开始，

​        {

​          direction = "R";//默认向右走

​          current_direction = "R";//当前方向

​          first_launch = ***\*false\****;

​          iseaten = ***\*false\****;

​          isrun = ***\*true\****;

​          body_length = 5;

​          head = ***\*new\**** Tile(227,100);

​          Score.setText("6");

​          hour =0;

​          min =0;

​          sec =0 ;

​          ***\*for\****(***\*int\**** i = 0; i < MAX_SIZE;i++)

​          {

​            body[i].x = 0;

​            body[i].y = 0;

​          }

​          

​          run = ***\*new\**** Thread();

​          run.start();

​          System.***\**out\**\***.println("Start again");

​        }

​        ***\*if\****(e.getKeyCode() == KeyEvent.***\**VK_SPACE\**\***)//按空格键开始和暂停暂时没做，还在思考中

​        {

​          ***\*if\****(!pause)//暂停

​          {

​            pause = ***\*true\****;

​            isrun = ***\*false\****;

​          }

​          ***\*else\****//开始

​          {

​            pause = ***\*false\****;

​            isrun = ***\*true\****;

​          }

​        }

​      }

​    });

​    

​    ***\*new\**** Timer();

​    

​    setFocusable(***\*true\****);//将控件设置成可获取焦点状态

  }

  

  ***\*public\**** ***\*void\**** paintComponent(Graphics g1){// 绘制此容器中的每个组件

​    ***\*super\****.paintComponent(g1);

​    Graphics2D g = (Graphics2D) g1;//拥用二维图形处理能力,提供坐标转换、颜色管理以及文字布局等的控制。

​    g.setRenderingHint(RenderingHints.***\**KEY_ANTIALIASING\**\***,RenderingHints.***\**VALUE_ANTIALIAS_ON\**\***);//使用抗锯齿

​    g.setRenderingHint(RenderingHints.***\**KEY_STROKE_CONTROL\**\***,RenderingHints.***\**VALUE_STROKE_NORMALIZE\**\***);//笔划规范化控制

​    

​    //画头部

​    g.setColor(Color.***\**red\**\***);

​    g.fillRoundRect(head.x, head.y, 20, 20, 10, 10);

​    

​    g.setPaint(***\*new\**** GradientPaint(115,135,Color.***\**CYAN\**\***,230,135,Color.***\**MAGENTA\**\***,***\*true\****));

​    ***\*if\****(!first_launch)

​    {

​      //初始化身体

​      ***\*int\**** x = head.x;

​      ***\*for\****(***\*int\**** i = 0;i < body_length;i++)

​      {

​        x -= 22;//相邻两个方块的间距为2个像素，方块宽度都为20像素

​        body[i].x = x;

​        body[i].y = head.y;

​        g.fillRoundRect(body[i].x, body[i].y, 20, 20, 10, 10);//涂一个圆角矩形块

​      }

​      //初始化食物位置

​      ProduceRandom();

​      g.fillOval(randomx, randomy, 19, 19);//使用当前颜色填充外接指定矩形框的椭圆。

​    }

​    ***\*else\****

​    {

​      //每次刷新身体

​      ***\*for\****(***\*int\**** i = 0;i < body_length;i++)

​      {

​        g.fillRoundRect(body[i].x, body[i].y, 20, 20, 10, 10);

​      }

​      

​      ***\*if\****(EatFood())//被吃了重新产生食物

​      {

​        ProduceRandom();

​        g.fillOval(randomx, randomy, 19, 19);

​        iseaten = ***\*false\****;

​      }

​      ***\*else\****

​      {

​        g.fillOval(randomx, randomy, 19, 19);

​      }

​    }

​    first_launch = ***\*true\****;

​    //墙

​    g.setStroke( ***\*new\**** BasicStroke(4,BasicStroke.***\**CAP_BUTT\**\***,BasicStroke.***\**JOIN_BEVEL\**\***));//设置画刷

​    g.setBackground(Color.***\**black\**\***);

​    g.drawRect(2, 7, 491, 469);

​    

​    //网格线

​    ***\*for\****(***\*int\**** i = 1;i < 22;i++)

​    {

​      g.setStroke( ***\*new\**** BasicStroke(1,BasicStroke.***\**CAP_BUTT\**\***,BasicStroke.***\**JOIN_BEVEL\**\***));

​      g.setColor(Color.***\**black\**\***);

​      g.drawLine(5+i*22,9,5+i*22,472);

​      ***\*if\****(i <= 20)

​      {

​        g.drawLine(4,10+i*22,491,10+i*22);

​      }

​    }

  }

  

  ***\*public\**** ***\*void\**** ProduceRandom(){

​    ***\*boolean\**** flag = ***\*true\****;

​    Random rand = ***\*new\**** Random();

​    randomx = (rand.nextInt(21) + 1) * 22 + 7;

​    randomy = (rand.nextInt(20) + 1) *22 + 12;

​    ***\*while\****(flag)

​    {

​      ***\*for\****(***\*int\**** i = 0;i < body_length; i++)

​      {

​        ***\*if\****(body[i].x == randomx && body[i].y == randomy)

​        {

​          randomx = (rand.nextInt(21) + 1) * 22 + 7;

​          randomy = (rand.nextInt(20) + 1) *22 + 12;

​          flag = ***\*true\****;

​          ***\*break\****;

​        }

​        ***\*else\****

​        {

​          ***\*if\****(i == body_length - 1)

​          {

​            flag = ***\*false\****;

​          }

​        }

​      }

​    }

  }

  

  ***\*public\**** ***\*void\**** HitWall(){//判断是否撞墙

​    ***\*if\****(current_direction == "L")

​    {

​      ***\*if\****(head.x < 7)

​      {

​        

​        isrun = ***\*false\****;

​        ***\*int\**** result=JOptionPane.**showConfirmDialog**(***\*null\****, "Game over! Try again?", "Information", JOptionPane.***\**YES_NO_OPTION\**\***);

​        ***\*if\****(result==JOptionPane.***\**YES_NO_OPTION\**\***)

​        {

​          direction = "R";//默认向右走

​          current_direction = "R";//当前方向

​          first_launch = ***\*false\****;

​          iseaten = ***\*false\****;

​          isrun = ***\*true\****;

​          body_length = 5;

​          head = ***\*new\**** Tile(227,100);

​          Score.setText("6");

​          hour =0;

​          min =0;

​          sec =0 ;

​          ***\*for\****(***\*int\**** i = 0; i < MAX_SIZE;i++)

​          {

​            body[i].x = 0;

​            body[i].y = 0;

​          }

​          

​          run = ***\*new\**** Thread();//线程

​          run.start();

​          System.***\**out\**\***.println("Start again");

​        }

​        ***\*else\****

​        {

​        	run.stop();

​      			

​      		

 

​        }     

​      }

​    }

​    ***\*if\****(current_direction == "R")

​    {

​      ***\*if\****(head.x > 489)

​      {

​        

​        isrun = ***\*false\****;

​        ***\*int\**** result=JOptionPane.**showConfirmDialog**(***\*null\****, "Game over! Try again?", "Information", JOptionPane.***\**YES_NO_OPTION\**\***);

​        ***\*if\****(result==JOptionPane.***\**YES_NO_OPTION\**\***)

​        {

​          direction = "R";//默认向右走

​          current_direction = "R";//当前方向

​          first_launch = ***\*false\****;

​          iseaten = ***\*false\****;

​          isrun = ***\*true\****;

​          body_length = 5;

​          head = ***\*new\**** Tile(227,100);

​          Score.setText("6");

​          hour =0;

​          min =0;

​          sec =0 ;

​          ***\*for\****(***\*int\**** i = 0; i < MAX_SIZE;i++)

​          {

​            body[i].x = 0;

​            body[i].y = 0;

​          }

​          

​          run = ***\*new\**** Thread();

​          run.start();

​          System.***\**out\**\***.println("Start again");

​        }

​        ***\*else\****

​        {

​        	run.stop();

​        }

​      }

​    }

​    ***\*if\****(current_direction == "U")

​    {

​      ***\*if\****(head.y < 12)

​      {

​        

​        isrun = ***\*false\****;

​        ***\*int\**** result=JOptionPane.**showConfirmDialog**(***\*null\****, "Game over! Try again?", "Information", JOptionPane.***\**YES_NO_OPTION\**\***);

​        ***\*if\****(result==JOptionPane.***\**YES_NO_OPTION\**\***)

​        {

​          direction = "R";//默认向右走

​          current_direction = "R";//当前方向

​          first_launch = ***\*false\****;

​          iseaten = ***\*false\****;

​          isrun = ***\*true\****;

​          body_length = 5;

​          head = ***\*new\**** Tile(227,100);

​          Score.setText("6");

​          hour =0;

​          min =0;

​          sec =0 ;

​          ***\*for\****(***\*int\**** i = 0; i < MAX_SIZE;i++)

​          {

​            body[i].x = 0;

​            body[i].y = 0;

​          }

​          

​          run = ***\*new\**** Thread();

​          run.start();

​          System.***\**out\**\***.println("Start again");

​        }

​        ***\*else\****

​        {

​        	run.stop();;

​        }

​      }

​    }

​    ***\*if\****(current_direction == "D")

​    {

​      ***\*if\****(head.y > 472)

​      {

​        

​        isrun = ***\*false\****;

​        ***\*int\**** result=JOptionPane.**showConfirmDialog**(***\*null\****, "Game over! Try again?", "Information", JOptionPane.***\**YES_NO_OPTION\**\***);

​        ***\*if\****(result==JOptionPane.***\**YES_NO_OPTION\**\***)

​        {

​          direction = "R";//默认向右走

​          current_direction = "R";//当前方向

​          first_launch = ***\*false\****;

​          iseaten = ***\*false\****;

​          isrun = ***\*true\****;

​          body_length = 5;

​          head = ***\*new\**** Tile(227,100);

​          Score.setText("6");

​          hour =0;

​          min =0;

​          sec =0 ;

​          ***\*for\****(***\*int\**** i = 0; i < MAX_SIZE;i++)

​          {

​            body[i].x = 0;

​            body[i].y = 0;

​          }

​          

​          run = ***\*new\**** Thread();

​          run.start();

​          System.***\**out\**\***.println("Start again");

​        }

​        ***\*else\****

​        {

​        	run.stop();

​        }

​      }

​    }

  }

  

  ***\*public\**** ***\*void\**** HitSelf(){//判断是否撞到自己身上

​    ***\*for\****(***\*int\**** i = 0;i < body_length; i++)

​    {

​      ***\*if\****(body[i].x == head.x && body[i].y == head.y)

​      {

​        

​        isrun = ***\*false\****;

​        ***\*int\**** result=JOptionPane.**showConfirmDialog**(***\*null\****, "Game over! Try again?", "Information", JOptionPane.***\**YES_NO_OPTION\**\***);

​        ***\*if\****(result==JOptionPane.***\**YES_NO_OPTION\**\***)

​        {

​          direction = "R";//默认向右走

​          current_direction = "R";//当前方向

​          first_launch = ***\*false\****;

​          iseaten = ***\*false\****;

​          isrun = ***\*true\****;

​          body_length = 5;

​          head = ***\*new\**** Tile(227,100);

​          Score.setText("6");

​          hour =0;

​          min =0;

​          sec =0 ;

​          ***\*for\****(***\*int\**** j = 0; j < MAX_SIZE;j++)

​          {

​            body[j].x = 0;

​            body[j].y = 0;

​          }

​          

​          run = ***\*new\**** Thread();

​          run.start();

​          System.***\**out\**\***.println("Start again");

​        }

​        ***\*else\****

​        {

​        	System.**exit**(0);

​        }

​        ***\*break\****;

​      }

​    }

  }

  

  ***\*public\**** ***\*boolean\**** EatFood(){

​    ***\*if\****(head.x == randomx && head.y == randomy)

​    {

​      iseaten = ***\*true\****;

​      ***\*return\**** ***\*true\****;

​    }

​    ***\*else\****

​    {

​      ***\*return\**** ***\*false\****;

​    }

  }

  

  ***\*public\**** ***\*void\**** Thread(){

​    ***\*long\**** millis = 300;//每隔300毫秒刷新一次

​    run = ***\*new\**** Thread() {

​      ***\*public\**** ***\*void\**** run() {

​        ***\*while\**** (***\*true\****) 

​        {

​          ***\*try\**** {

​            Thread.**sleep**(millis);

​          } ***\*catch\**** (InterruptedException ex) {

​            ex.printStackTrace();

​          }

​          

​          ***\*if\****(!pause)

​          {   

​            temp.x = head.x;

​            temp.y = head.y;

​            //头部移动

​            ***\*if\****(direction == "L")

​            {

​              head.x -= 22;

​            }

​            ***\*if\****(direction == "R")

​            {

​              head.x += 22;

​            }

​            ***\*if\****(direction == "U")

​            {

​              head.y -= 22;

​            }

​            ***\*if\****(direction == "D")

​            {

​              head.y += 22;

​            }

​            current_direction = direction;//刷新当前前进方向

​            //身体移动

​            ***\*for\****(***\*int\**** i = 0;i < body_length;i++)

​            {

​              temp2.x = body[i].x;

​              temp2.y = body[i].y;

​              body[i].x = temp.x;

​              body[i].y = temp.y;

​              temp.x = temp2.x;

​              temp.y = temp2.y;

​            }

​            

​            ***\*if\****(EatFood())

​            {

​              body_length ++;

​              body[body_length-1].x = temp2.x;

​              body[body_length-1].y = temp2.y;

​              Score.setText("" + (body_length+1) );

​              //new AePlayWave("eat.wav").start();

​            }

​            

​            repaint();

​            

​            HitWall();

​            HitSelf();

​          }

​        }

​      }

​    };

​    

​    run.start();

  }  

  //计时器类

  ***\*class\**** Timer ***\*extends\**** Thread{  

​      ***\*public\**** Timer(){

​        ***\*this\****.start();

​      }

​      @Override

​      ***\*public\**** ***\*void\**** run() {

​        // ***\*TODO\**** Auto-generated method stub

​        ***\*while\****(***\*true\****){

​          ***\*if\****(isrun){

​            sec +=1 ;

​            ***\*if\****(sec >= 60){

​              sec = 0;

​              min +=1 ;

​            }

​            ***\*if\****(min>=60){

​              min=0;

​              hour+=1;

​            }

​            showTime();

​          }

​     

​          ***\*try\**** {

​            Thread.**sleep**(1000);

​          } ***\*catch\**** (InterruptedException e) {

​            // ***\*TODO\**** Auto-generated catch block

​            e.printStackTrace();

​          }

​           

​        }

​      }

 

​      ***\*private\**** ***\*void\**** showTime(){

​        String strTime ="" ;

​        ***\*if\****(hour < 10)

​          strTime = "0"+hour+":";

​        ***\*else\****

​          strTime = ""+hour+":";

​         

​        ***\*if\****(min < 10)

​          strTime = strTime+"0"+min+":";

​        ***\*else\****

​          strTime =strTime+ ""+min+":";

​         

​        ***\*if\****(sec < 10)

​          strTime = strTime+"0"+sec;

​        ***\*else\****

​          strTime = strTime+""+sec;

​         

​        //在窗体上设置显示时间

​        Time.setText(strTime);

​      }

​    }   

 

//文件搜索关键代码

directory = ***\*new\**** JLabel("请输入磁盘路径：", 2);

​		filter = ***\*new\**** JLabel("请输入要搜索的文件名：", 2);

​		statusShow1 = ***\*new\**** JLabel("准备搜索...", 2);

​		textFilter = ***\*new\**** JTextField(15);

​		textDirectory = ***\*new\**** JTextField(15);

 

​		result = ***\*new\**** JTextArea();

​		result.setLineWrap(***\*true\****);

​		result.setWrapStyleWord(***\*true\****); 

​		result.setEditable(***\*false\****);// 出现的结果，不可编辑

​		JScrollPane js = ***\*new\**** JScrollPane(result);// 滚动面板

 

​		search = ***\*new\**** JButton("开始搜索");

​		

 

​		// 给搜索按钮添加监听事件

​		search.addActionListener(***\*new\**** ActionListener() {

 

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent evt) {

 

​				result.setText("");

 

​				f = textFilter.getText().trim();//输入的关键字

​				p = textDirectory.getText().trim();

 

​				/*if ("".equals(f)) {

​					System.out.println("输入内容不能为空！");

​				}

​				if ("".equals(p)) {

​					System.out.println("路径不能为空!");

​				} else {

​					Thread searchT = new Thread(new Runnable() {

​						public void run() {*/

​							doSearch(f, p);

​						/*}

​					});

​					searchT.start();

​				}*/

​			}

 

​		});

 

​		setLayout(***\*new\**** GridBagLayout());

​		// GridBagConstraints类指定使用GridBagLayout类布局的组件的约束。

​		GridBagConstraints gc = ***\*new\**** GridBagConstraints();

​		/*

​		 * 当组件小于其显示区域时，将使用此字段。它决定在显示区域内将组件放置在何处。 有三种可能的值:方向相对值、基线相对值和绝对值。方向相对值是相对于容器的组件方

​		 * 向属性来解释的，基线相对值是相对于基线来解释的，而绝对值则不是。绝对值有:中、

​		 * 北、东北、东、东南、南、西南、西、西北。方向相对值分别为:PAGE_START、PAGE_END、

​		 * LINE_START、LINE_END、FIRST_LINE_START、FIRST_LINE_END、LAST_LINE_START、

​		 * LAST_LINE_END。基线的相对值为:BASELINE、BASELINE_LEADING、baseline_、

​		 * ABOVE_BASELINE_LEADING、above_baseline_、above_baseline_、

​		 * BELOW_BASELINE_LEADING、below_baseline_。默认值是CENTER。

​		 */

​		gc.anchor = GridBagConstraints.***\**WEST\**\***;

​		addComponet(gc, filter, 0, 0, 1, 1);//添加组件

​		addComponet(gc, directory, 0, 1, 1, 1);

 

​		gc.fill = GridBagConstraints.***\**HORIZONTAL\**\***;

​		gc.weightx = 100;

​		addComponet(gc, textFilter, 1, 0, 1, 1);

​		addComponet(gc, textDirectory, 1, 1, 1, 1);

 

​		gc.fill = GridBagConstraints.***\**NONE\**\***;

​		gc.weightx = 0;

​		addComponet(gc, search, 2, 0, 1, 1);

​		

 

​		gc.fill = GridBagConstraints.***\**HORIZONTAL\**\***;

​		gc.weightx = 100;

​		addComponet(gc, statusShow1, 0, 2, 3, 1);

​		

 

​		gc.fill = GridBagConstraints.***\**BOTH\**\***;

​		gc.weighty = 100;

​		addComponet(gc, js, 0, 4, 3, 1);

​	}

 

​	***\*public\**** ***\*void\**** addComponet(GridBagConstraints gc, Component c, ***\*int\**** x, ***\*int\**** y, ***\*int\**** w, ***\*int\**** h) {

​		gc.gridx = x;

​		gc.gridy = y;

​		gc.gridwidth = w;

​		gc.gridheight = h;

​		add(c, gc);

​	}

 

​	//搜索

​	***\*private\**** ***\*void\**** doSearch(String filter, String path) {

​		File file = ***\*new\**** File(path);

​		***\*if\**** (file.exists()) {

​			***\*if\**** (file.isDirectory()) {

​				File[] fileArray = file.listFiles();

​				***\*for\**** (File f : fileArray) {

​					***\*if\**** (f.isDirectory()) {

​						***\*if\****(f.getName().contains(filter)) {

​							result.append("找到了文件夹"+f.getAbsolutePath()+"\r\n");

​						}

​						doSearch(filter, f.getPath());

​					} ***\*else\**** {

​						***\*if\**** (f.getName().indexOf(filter) >= 0) {

​							

​							result.append("找到了"+f.getPath()+"\r\n");//文件搜索换行

​							

​							

​						}

​					}

​					statusShow1.setText(f.getPath());

​				}

​				

​			} ***\*else\**** {

​				System.***\**out\**\***.println("不能打开文件路径!");

​			}

​		} ***\*else\**** {

​			System.***\**out\**\***.println("此路径不存在!");

​		}

​	}

//背景颜色设置

JButton btnNewButton_1 = ***\*new\**** JButton("背景设置",

​				***\*new\**** ImageIcon("D:\\Java\\eclipse\\workspace\\termEnd\\src\\demo02\\images\\背景设置.png"));

​		btnNewButton_1.setForeground(Color.***\**WHITE\**\***);

​		btnNewButton_1.setContentAreaFilled(***\*false\****);

​		btnNewButton_1.setBorderPainted(***\*false\****);

​		btnNewButton_1.setBackground(***\*new\**** Color(0, 0, 0));// 按钮的背景颜色

​		btnNewButton_1.addActionListener(***\*new\**** ActionListener() {

​			@Override

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent event) {

​				JColorChooser chooser = ***\*new\**** JColorChooser(); // 实例化颜色选择器

​				Color color = chooser.**showDialog**(Deskhelp.***\*this\****, "选取颜色", Color.***\**red\**\***); // 得到选择的颜色

​				***\*if\**** (color == ***\*null\****) // 如果未选取

​					color = Color.***\**gray\**\***; // 则设置颜色为灰色

​				getContentPane().setBackground(color); // 改变面板的背景色

​			}

​		});

 

 

// 这是截屏代码

​	/*

​	 * 截图窗口

​	 */

​	***\*class\**** ScreenShotWindow ***\*extends\**** JFrame {

​		***\*private\**** ***\*int\**** orgx, orgy, endx, endy;

​		***\*private\**** BufferedImage image = ***\*null\****;

​		***\*private\**** BufferedImage tempImage = ***\*null\****;

​		***\*private\**** BufferedImage saveImage = ***\*null\****;

 

​		***\*private\**** ToolsWindow tools = ***\*null\****;// 操作窗口

 

​		***\*public\**** ScreenShotWindow() ***\*throws\**** AWTException {

​			// 获取屏幕尺寸

​			Dimension d = Toolkit.**getDefaultToolkit**().getScreenSize();

​			***\*this\****.setBounds(0, 0, d.width, d.height);

 

​			// 截取屏幕

​			Robot robot = ***\*new\**** Robot();

​			// 创建包含从屏幕读取的像素的图像。此图像不包括鼠标光标

​			image = robot.createScreenCapture(***\*new\**** Rectangle(0, 0, d.width, d.height));

 

​			***\*this\****.addMouseListener(***\*new\**** MouseAdapter() {

​				@Override

​				***\*public\**** ***\*void\**** mousePressed(MouseEvent e) {

​					// 鼠标松开时记录起点坐标，并隐藏操作窗口

​					orgx = e.getX();

​					orgy = e.getY();

 

​					***\*if\**** (tools != ***\*null\****) {

​						tools.setVisible(***\*false\****);

​					}

​				}

 

​				@Override

​				***\*public\**** ***\*void\**** mouseReleased(MouseEvent e) {

​					// 鼠标松开时，显示操作窗口

​					// e.getX(), e.getY()鼠标结束的位置出现操作窗口

​					***\*if\**** (tools == ***\*null\****) {

​						tools = ***\*new\**** ToolsWindow(ScreenShotWindow.***\*this\****, e.getX(), e.getY());

​					} ***\*else\**** {

​						tools.setLocation(e.getX(), e.getY());

​					}

​					tools.setVisible(***\*true\****);

​				}

​			});

 

​			***\*this\****.addMouseMotionListener(***\*new\**** MouseMotionAdapter() {

 

​				@Override

​				***\*public\**** ***\*void\**** mouseDragged(MouseEvent e) {

​					// 鼠标拖动时，记录坐标并重绘窗口

​					endx = e.getX();

​					endy = e.getY();

​					// 抽象类映像是表示图形映像的所有类的超类。图像必须以特定于平台的方式获得。

​					// 临时图像，用于缓冲屏幕区域放置屏幕闪烁

​					// createImage方法得到图像

​					Image tempImage2 = createImage(ScreenShotWindow.***\*this\****.getWidth(), ScreenShotWindow.***\*this\****.getHeight());

​					// 图形类是所有图形上下文的抽象基类，它允许应用程序绘制在各种设备上实现的组件，

​					// 以及屏幕外的图像。

​					Graphics g = tempImage2.getGraphics();// 为绘制到屏幕外的图像创建图形上下文。此方法只能调用屏幕外的图像。

​					// drawImage方法的返回值是true或者false

​					g.drawImage(tempImage, 0, 0, ***\*null\****);

​					// 返回两个整型值中较小的那个

​					***\*int\**** x = Math.**min**(orgx, endx);

​					***\*int\**** y = Math.**min**(orgy, endy);

​					// 减1加1都了防止图片矩形框覆盖掉;返回一个int值的绝对值

​					***\*int\**** width = Math.**abs**(endx - orgx) + 1;

​					***\*int\**** height = Math.**abs**(endy - orgy) + 1;

 

​					// 返回指定矩形区域定义的子图像。

​					saveImage = image.getSubimage(x, y, width, height);

​					// 尽可能多地绘制当前可用的指定图像。在这个图形上下文的坐标空间中，图像的左上角(x, y)被绘制。图像中的透明像素

​					// 不会影响已经存在的像素。

​					// 在所有情况下，此方法都立即返回，即使尚未加载完整的图像，也未对当前输出设备进行犹豫和转换。

​					// 如果图像已经完全加载，并且它的像素不再改变，那么drawImage返回true。否则，drawImage返回

​					// false，当更多的图像变得可用或者是时候绘制另一帧动画，加载图像的过程通知指定的图像观察者。

​					g.drawImage(saveImage, x, y, ***\*null\****);

 

​					ScreenShotWindow.***\*this\****.getGraphics().drawImage(tempImage2, 0, 0, ScreenShotWindow.***\*this\****);

​				}

​			});

​		}

 

​		@Override

​		***\*public\**** ***\*void\**** paint(Graphics g) {

​			/*RescaleOp类通过将每个像素的采样值乘以一个比例因子，然后添加

​			一个偏移量，对源图像中的数据逐像素进行重新排序。缩放后的样

​			本值被剪切到目标图像中可表示的最小/最大值。*/

​			RescaleOp ro = ***\*new\**** RescaleOp(0.8f, 0, ***\*null\****);

​			//对源 Raster 中的像素数据进行重缩放。

​			/*

​			 * 重新测量源缓冲区。如果源图像中的颜色模型与目标图像中的颜色模型不同，

​			 * 则像素将被转换到目标图像中。如果目标图像为空，则使用源ColorModel创

​			 * 建BufferedImage。如果该对象的缩放因子/偏移量

​			 * 的数量不符合上述类注释中规定的条件，或者该源图像

​			 * 具有IndexColorModel，则可能抛出IllegalArgumentException。

​			 */

​			tempImage = ro.filter(image, ***\*null\****);

​			g.drawImage(tempImage, 0, 0, ***\*this\****);

​		}

 

​		// 保存图像到文件

​		***\*public\**** ***\*void\**** saveImage() ***\*throws\**** IOException {

​			//文件选择器

​			JFileChooser jfc = ***\*new\**** JFileChooser();

​			jfc.setDialogTitle("保存");

 

​			// 文件过滤器，用户过滤可选择文件

​			/*FileFilter的一种实现，它使用一组特定的扩展进行过滤。

​			 * 文件的扩展名是文件名最后一个“.”后面的部分。名称不包含“。”

​			 * 的文件没有文件扩展名。文件名扩展比较不区分大小写。

​			 */

​		

​			FileNameExtensionFilter filter = ***\*new\**** FileNameExtensionFilter("JPG", "jpg");// 过滤文件名，只显示jpg格式文件

​			// 将文件过滤器加入到文件选择中；设置当前文件过滤器。文件筛选器使用文件筛选器从用户的视图中筛选文件

​			jfc.setFileFilter(filter); 

 

​			// 初始化一个默认文件（此文件会生成到桌面上）

​			SimpleDateFormat sdf = ***\*new\**** SimpleDateFormat("yyyymmddHHmmss");

​			String fileName = sdf.format(***\*new\**** Date()); // 把时间作为图片名（防止图片名重复，而把之前的图片覆盖）

​			//FileSystemView是JFileChooser通向文件系统的网关; 获取系统桌面的路径

​			File filePath = FileSystemView.**getFileSystemView**().getHomeDirectory(); 

​			File defaultFile = ***\*new\**** File(filePath + File.***\**separator\**\*** + fileName + ".jpg");

​			jfc.setSelectedFile(defaultFile);

 

​			***\*int\**** flag = jfc.showSaveDialog(***\*this\****);

​			***\*if\**** (flag == JFileChooser.***\**APPROVE_OPTION\**\***) {

​				File file = jfc.getSelectedFile();

​				String path = file.getPath();

​				// 检查文件后缀，放置用户忘记输入后缀或者输入不正确的后缀

​				***\*if\**** (!(path.endsWith(".jpg") || path.endsWith(".JPG"))) {

​					path += ".jpg";

​				}

​				// 写入文件

​				ImageIO.**write**(saveImage, "jpg", ***\*new\**** File(path));

​				// System.exit(0);

​			}

​		}

​	}

/*

​	 * 操作窗口

​	 */

​	***\*class\**** ToolsWindow ***\*extends\**** JFrame {

​		// 截屏窗口

​		***\*private\**** ScreenShotWindow parent;

 

​		***\*public\**** ToolsWindow(ScreenShotWindow parent, ***\*int\**** x, ***\*int\**** y) {

​			***\*this\****.parent = parent;

​			***\*this\****.init();

​			***\*this\****.setLocation(x, y);

​			***\*this\****.pack();

​			***\*this\****.setVisible(***\*true\****);

​		}

 

​		***\*private\**** ***\*void\**** init() {

 

​			***\*this\****.setLayout(***\*new\**** BorderLayout());

​			JToolBar toolBar = ***\*new\**** JToolBar("Java 截图");

 

​			// 保存按钮

​			JButton saveButton = ***\*new\**** JButton("保存");

​			saveButton.addActionListener(***\*new\**** ActionListener() {

​				***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​					***\*try\**** {

​						parent.saveImage();

​					} ***\*catch\**** (IOException e1) {

​						e1.printStackTrace();

​					}

​				}

​			});

​			toolBar.add(saveButton);

 

​			***\*this\****.add(toolBar, BorderLayout.***\**NORTH\**\***);

​		}

​	}

//打开记事本

button_5.addActionListener(***\*new\**** ActionListener() {

 

​			@Override

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				Runtime run = Runtime.**getRuntime**(); // 建立操作类

​				Process pro = ***\*null\****; // 获取操作类方法exec（）的返回值

​				***\*try\**** {

​					pro = run.exec("notepad.exe"); // 这里以记事本为例子

​				} ***\*catch\**** (IOException e1) {

​					// ***\*TODO\**** 自动生成的 catch 块

​					e1.printStackTrace();

​				}

​				***\*try\**** {

​					Thread.**sleep**(6000); // 等待一秒后

​				} ***\*catch\**** (InterruptedException e1) {

​					// ***\*TODO\**** 自动生成的 catch 块

​					e1.printStackTrace();

​				}

​				pro.destroy(); // 结束程序

​			}

​		});

//打开计算器

button_6.addActionListener(***\*new\**** ActionListener() {

 

​			@Override

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				Runtime run = Runtime.**getRuntime**(); // 建立操作类

​				Process pro = ***\*null\****; // 获取操作类方法exec（）的返回值

​				***\*try\**** {

​					pro = run.exec("calc.exe");

​				} ***\*catch\**** (IOException e1) {

​					// ***\*TODO\**** 自动生成的 catch 块

​					e1.printStackTrace();

​				}

​				***\*try\**** {

​					Thread.**sleep**(6000); // 等待一秒后

​				} ***\*catch\**** (InterruptedException e1) {

​					// ***\*TODO\**** 自动生成的 catch 块

​					e1.printStackTrace();

​				}

​				pro.destroy(); // 结束程序

​			}

​		});

 

//打开画图

button_13.addActionListener(***\*new\**** ActionListener() {

 

​			@Override

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				Runtime run = Runtime.**getRuntime**(); // 建立操作类

​				Process pro = ***\*null\****; // 获取操作类方法exec（）的返回值

​				***\*try\**** {

​					pro = run.exec("mspaint.exe"); 

​				} ***\*catch\**** (IOException e1) {

​					// ***\*TODO\**** 自动生成的 catch 块

​					e1.printStackTrace();

​				}

​				***\*try\**** {

​					Thread.**sleep**(6000); // 等待一秒后

​				} ***\*catch\**** (InterruptedException e1) {

​					// ***\*TODO\**** 自动生成的 catch 块

​					e1.printStackTrace();

​				}

​				pro.destroy(); // 结束程序

​			}

​		});

 

//锁屏

button_7.addActionListener(***\*new\**** ActionListener() {

 

​			@Override

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				***\*try\**** {

​					Runtime.**getRuntime**().exec("RunDll32.exe user32.dll,LockWorkStation");

​				} ***\*catch\**** (IOException e1) {

​					// ***\*TODO\**** Auto-generated catch block

​					e1.printStackTrace();

​				}

​			}

​		});

 

//上网

button_8.addActionListener(***\*new\**** ActionListener() {

 

​			@Override

​			***\*public\**** ***\*void\**** actionPerformed(ActionEvent e) {

​				// 先判断当前平台是否支持桌面

​				***\*if\**** (Desktop.**isDesktopSupported**()) {

​					// 获取当前平台桌面实例

​					Desktop desktop = Desktop.**getDesktop**();

 

​					// 使用默认浏览器打开链接

​					***\*try\**** {

​						desktop.browse(URI.**create**("https://blog.csdn.net/xietansheng"));

​					} ***\*catch\**** (IOException e2) {

​						// ***\*TODO\**** Auto-generated catch block

​						e2.printStackTrace();

​					}

​				}

​			}

​		});

//备忘录

//布局

JPanel panel = ***\*new\**** JPanel();

​		panel1 = ***\*new\**** JPanel();

​		panel2 = ***\*new\**** JPanel();

​		panel3 = ***\*new\**** JPanel();

​		panel3_1 = ***\*new\**** JPanel();

​		week = ***\*new\**** JLabel[7];

​		button = ***\*new\**** JButton[42];

​		// 第一个面板

​		panel1.setLayout(***\*new\**** GridLayout(1, 5, 1, 0));

​		preYear = ***\*new\**** JButton("上一年");

​		preYear.addActionListener(***\*this\****);

​		nexYear = ***\*new\**** JButton("下一年");

​		nexYear.addActionListener(***\*this\****);

​		preMonth = ***\*new\**** JButton("上一月");

​		preMonth.addActionListener(***\*this\****);

​		nexMonth = ***\*new\**** JButton("下一月");

​		nexMonth.addActionListener(***\*this\****);

 

​		save = ***\*new\**** JButton("保存备忘录文件");

​		save.setEnabled(***\*false\****);

​		save.addActionListener(***\*this\****);

​		delete = ***\*new\**** JButton("删除备忘录文件");

​		delete.setEnabled(***\*false\****);

​		delete.addActionListener(***\*this\****);

 

​		memoEdit = ***\*new\**** JTextArea("");

​		memoEdit.setRows(8);

​		JScrollPane roll1 = ***\*new\**** JScrollPane(memoEdit);

​		memoEdit.setEditable(***\*false\****);

 

​		labelB = ***\*new\**** JLabel();

​		labelB.setHorizontalAlignment(JLabel.***\**CENTER\**\***);// 使得文本居中

​		labelB.setBackground(***\*new\**** Color(255, 50, 50));

 

​		labelC = ***\*new\**** JLabel();

​		labelC.setHorizontalAlignment(JLabel.***\**CENTER\**\***);// 使得文本居中

​		labelC.setBackground(***\*new\**** Color(255, 50, 50));

 

​		dat = Calendar.**getInstance**();

​		panel1.add(preYear);

​		panel1.add(preMonth);

​		panel1.add(labelC);

​		panel1.add(nexMonth);

​		panel1.add(nexYear);

 

//关键代码

// 第二个面板

​		panel2.setLayout(***\*new\**** GridLayout(7, 7, 4, 0));

​		***\*for\**** (***\*int\**** i = 0; i < 7; ++i) {

​			week[i] = ***\*new\**** JLabel();

​			week[i].setHorizontalAlignment(JLabel.***\**CENTER\**\***);// 使得文本居中

​			//week[i].setBackground(new Color(0, 255, 0));

​			panel2.add(week[i]);

​		}

 

​		week[0].setText("星期日");

​		week[1].setText("星期一");

​		week[2].setText("星期二");

​		week[3].setText("星期三");

​		week[4].setText("星期四");

​		week[5].setText("星期五");

​		week[6].setText("星期六");

​		***\*for\**** (***\*int\**** i = 0; i < 7; ++i) {

​			week[i].setAlignmentX(Label.***\**CENTER\**\***);

​		}

​		// 42个按钮

​		***\*for\**** (***\*int\**** i = 0; i < 42; ++i) {

​			button[i] = ***\*new\**** JButton();

​			button[i].addActionListener(***\*this\****);

​			panel2.add(button[i]);

​		}

 

​		// 第三个小面板删除和保存按钮

​		panel3_1.setLayout(***\*new\**** GridLayout(1, 2));

 

​		panel3_1.add(save);

​		panel3_1.add(labelB);

​		panel3_1.add(delete);

​		// 第三个面板（上面加了一个面板再加了一个文本区域）

 

​		panel3.setLayout(***\*new\**** BorderLayout());

​		panel3.add(roll1, BorderLayout.***\**NORTH\**\***);

​		panel3.add(panel3_1, BorderLayout.***\**SOUTH\**\***);

 

​		// 下面是各种功能

​		yea = dat.get(Calendar.***\**YEAR\**\***);

​		mon = dat.get(Calendar.***\**MONTH\**\***) + 1;

​		da = dat.get(Calendar.***\**DAY_OF_MONTH\**\***);

​		str = ***\*new\**** String("" + yea + "年" + mon + "月" + da + "日");

​		setCalendar(yea, mon);// 调用方法setCalendar

 

​		setLayout(***\*new\**** BorderLayout());

​		setSize(378,455);

​		/*

​		 * add(panel1, BorderLayout.NORTH); add(panel2, BorderLayout.CENTER);

​		 * add(panel3, BorderLayout.SOUTH);

​		 */

 

​		panel.add(panel1, BorderLayout.***\**NORTH\**\***);

​		panel.add(panel2, BorderLayout.***\**CENTER\**\***);

​		panel.add(panel3, BorderLayout.***\**SOUTH\**\***);

​		add(panel);

​		setTitle("留下时光的足迹");

​		setDefaultCloseOperation(JFrame.***\**HIDE_ON_CLOSE\**\***);// 子窗体

​		setResizable(***\*false\****);

​		setVisible(***\*true\****);

​	}

 

​	***\*public\**** ***\*void\**** setCalendar(***\*int\**** year, ***\*int\**** month) {

​		***\*int\**** j = 0;

​		***\*int\**** startDay = getWeek(year, month, 1);

​		***\*for\**** (***\*int\**** i = 0; i < 42; ++i) {

​			button[i].setLabel("");// 必须有

​			button[i].setBackground(***\*new\**** Color(255, 255, 255));

​		}

​		// 获得日期

​		labelC.setText("" + year + "年" + month + "月");//获得日期

​		***\*if\**** (2 == month && !((yea % 4 == 0 && yea % 100 != 0) || (yea % 400 == 0)))

​			***\*for\**** (***\*int\**** i = 1; i < 29; ++i) {

​				j = i + startDay - 1;

​				button[j].setLabel("" + i);

​				***\*if\**** (("" + yea + "年" + mon + "月" + i + "日").equals(str)) {

​					button[j].setBackground(***\*new\**** Color(0, 155, 254));

​				}

​			}

​		//闰年

​		***\*else\**** ***\*if\**** (2 == month && ((yea % 4 == 0 && yea % 100 != 0) || (yea % 400 == 0))) {

​			***\*for\**** (***\*int\**** i = 1; i < 30; ++i) {

​				j = i + startDay - 1;

​				button[j].setLabel("" + i);

​				***\*if\**** (("" + yea + "年" + mon + "月" + i + "日").equals(str)) {

​					button[j].setBackground(***\*new\**** Color(0, 155, 254));

​				}

​			}

​		} ***\*else\**** ***\*if\**** (1 == month || 3 == month || 5 == month || 7 == month || 8 == month || 10 == month || 12 == month)

​			***\*for\**** (***\*int\**** i = 1; i < 32; ++i) {

​				j = i + startDay - 1;

​				button[j].setLabel("" + i);

​				***\*if\**** (("" + yea + "年" + mon + "月" + i + "日").equals(str)) {

​					button[j].setBackground(***\*new\**** Color(0, 155, 254));

​				}

​			}

​		***\*else\****

​			***\*for\**** (***\*int\**** i = 1; i < 31; ++i) {

​				j = i + startDay - 1;

​				button[j].setLabel("" + i);

​				***\*if\**** (("" + yea + "年" + mon + "月" + i + "日").equals(str)) {

​					button[j].setBackground(***\*new\**** Color(0, 155, 254));

​				}

​			}

​	}

 

​	***\*public\**** ***\*int\**** getWeek(***\*int\**** year, ***\*int\**** month, ***\*int\**** day) {

​		***\*int\**** week = 0;

​		***\*int\**** cen = year / 100;

​		year = year % 100;

​		day = 1;

​		***\*if\**** (1 == month) {

​			month = 13;

​			year--;

​		}

​		***\*if\**** (2 == month) {

​			month = 14;

​			year--;

​		}

​		week = (year + (year / 4) + (cen / 4) - 2 * cen + (26 * (month + 1) / 10) + day - 1) % 7;

​		***\*if\**** (week < 0)

​			week = week + 7;

​		***\*return\**** week;

​	}

 

​	***\*public\**** ***\*void\**** actionPerformed(ActionEvent arg0) {

​		***\*if\**** (preYear == arg0.getSource()) {

​			yea = yea - 1;

​			***\*if\**** (yea < 0)

​				yea = 1;

​			setCalendar(yea, mon);

​		} ***\*else\**** ***\*if\**** (nexYear == arg0.getSource()) {

​			yea = yea + 1;

​			setCalendar(yea, mon);

​		} ***\*else\**** ***\*if\**** (preMonth == arg0.getSource()) {

​			mon = mon - 1;

​			***\*if\**** (0 == mon) {

​				yea = yea - 1;

​				mon = mon + 12;

​			}

​			setCalendar(yea, mon);

​		} ***\*else\**** ***\*if\**** (nexMonth == arg0.getSource()) {

​			mon = mon + 1;

​			***\*if\**** (mon > 12) {

​				yea = yea + 1;

​				mon = mon - 12;

​			}

​			setCalendar(yea, mon);

​		} ***\*else\**** ***\*if\**** (save == arg0.getSource()) {

​			File fileMemo = ***\*new\**** File("memo");// 创建一个文件对象

​			***\*if\**** (!fileMemo.exists()) {// 判断文件夹是否存在

​				fileMemo.mkdir();// 如果不存在就建一个

​			}

​			File fileMemoInclude = ***\*new\**** File(fileMemo, labelC.getText() + button[open].getLabel() + "日备忘录.txt");

​			***\*if\**** (fileMemoInclude.exists()) {

​				fileMemoInclude.delete();

​			}

​			***\*try\**** {

​				fileMemoInclude.createNewFile();

​				// 文件输出流;写文件

​				FileOutputStream fout = ***\*new\**** FileOutputStream(fileMemoInclude);

​				// 从字符到字节的转换

​				OutputStreamWriter write = ***\*new\**** OutputStreamWriter(fout, "UTF-8");

​				// 字符输出流

​				BufferedWriter writer = ***\*new\**** BufferedWriter(write);

​				// 获得文本框里的内容

​				String temp = ***\*new\**** String(memoEdit.getText());

 

​				writer.write(temp);

​				writer.close(); 

​				write.close(); 

 

​				fout.close(); 

​			} ***\*catch\**** (FileNotFoundException e) {

​				System.***\**err\**\***.println(e);

​			} ***\*catch\**** (IOException e) {

​				System.***\**err\**\***.println(e);

​			}

​			JOptionPane.**showMessageDialog**(panel3, "文件已保存完毕，请到“memo”文件夹下查看。");

​		} ***\*else\**** ***\*if\**** (delete == arg0.getSource()) {

​			File fileMemo = ***\*new\**** File("memo");

​			***\*if\**** (!fileMemo.exists())

​				fileMemo.mkdir();

​			File fileMemoInclude = ***\*new\**** File(fileMemo, labelC.getText() + button[open].getLabel() + "日备忘录.txt");

​			***\*if\**** (fileMemoInclude.exists())

​				fileMemoInclude.delete();

​			save.setEnabled(***\*false\****);

​			delete.setEnabled(***\*false\****);

​			memoEdit.setEditable(***\*false\****);

​			memoEdit.setText("");

​		}

 

​		***\*else\**** {

​			***\*for\**** (***\*int\**** i = 0; i < 42; ++i) {

​				***\*if\**** (arg0.getSource() == button[i])

​					open = i;

​			}

​			File fileMemo = ***\*new\**** File("memo");

​			***\*if\**** (!fileMemo.exists())

​				fileMemo.mkdir();

 

​			***\*if\**** (!("").equals(button[open].getLabel())) {

​				save.setEnabled(***\*true\****);

​				delete.setEnabled(***\*true\****);

​				memoEdit.setEditable(***\*true\****);

​				memoEdit.setText("");

​				***\*for\**** (***\*int\**** i = 0; i < 42; ++i) {

​					***\*if\**** (("" + yea + "年" + mon + "月" + button[i].getLabel() + "日").equals(str))

​						button[i].setBackground(***\*new\**** Color(0, 155, 254));

​					***\*else\****

​						button[i].setBackground(***\*new\**** Color(255, 255, 255));

​				}

​				button[open].setBackground(***\*new\**** Color(203, 229, 254));

​				File fileMemoInclude = ***\*new\**** File(fileMemo, labelC.getText() + button[open].getLabel() + "日备忘录.txt");

​				***\*try\**** {

​					***\*if\**** (!fileMemoInclude.exists())

​						fileMemoInclude.createNewFile();

​					FileInputStream fin = ***\*new\**** FileInputStream(fileMemoInclude);

​					InputStreamReader read = ***\*new\**** InputStreamReader(fin, "UTF-8");

​					BufferedReader reader = ***\*new\**** BufferedReader(read);

 

​					String temp = ***\*new\**** String("");

​					String line = ***\*new\**** String("");

 

​					***\*while\**** ((line = reader.readLine()) != ***\*null\****)

​						temp = temp + line + "\n";

 

​					memoEdit.setText(temp);

 

​					reader.close(); // 一定要关闭

​					read.close();

​					fin.close();

​					***\*if\**** (("").equals(memoEdit.getText()))

​						fileMemoInclude.delete();

​				} ***\*catch\**** (FileNotFoundException e) {

​					System.***\**err\**\***.println(e);

​				} ***\*catch\**** (IOException e) {

​					System.***\**err\**\***.println(e);

​				}

​			} ***\*else\**** {

​				save.setEnabled(***\*false\****);

​				delete.setEnabled(***\*false\****);

​				memoEdit.setEditable(***\*false\****);

​				memoEdit.setText("");

​			}

​		}

​	}