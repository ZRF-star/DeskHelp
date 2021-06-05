package demo02;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.AWTException;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class Deskhelp extends JFrame {
	private JTextField textField;

	public Deskhelp() {
		setTitle("桌面助手");
		setBounds(100, 100, 400, 220);
		setResizable(false);
		/*
		 * this.setUndecorated(true); this.setBackground(Color.red);
		 */
		getContentPane().setBackground(Color.black);
		// setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 总面板
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		// 第一个面板
		JPanel panel_1 = new JPanel(new GridLayout(1, 3));
		panel_1.setOpaque(false);
		panel.add(panel_1);
		// 显示时间代码
		JLabel time = new JLabel();
		time.setForeground(Color.white);// 颜色
		// 设置背景颜色
		time.setOpaque(false);
		// time.setBackground(Color.BLACK);
		time.setBounds(30, 0, 900, 130);
		time.setFont(new Font("微软雅黑", Font.BOLD, 60));

		this.setTimer(time);// 调用成员方法setTimer（）
		panel_1.add(time);

		JLabel weather = new JLabel("每一天都是要开心的一天哟~♪");
		weather.setForeground(Color.WHITE);
		// 设置背景颜色
		weather.setOpaque(false);
		// weather.setBackground(Color.BLACK);
		weather.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		panel_1.add(weather);

		// 第二个面板
		JPanel panel_4 = new JPanel(new GridLayout(1, 4));
		panel_4.setOpaque(false);
		panel.add(panel_4);

		JLabel Shengxiao = new JLabel("生肖");
		Shengxiao.setForeground(Color.WHITE);
		// 默认是透明的，所以默认情况下对其设置背景色是不管用的。
		// Shengxiao.setOpaque(true);
		// 为什么没起效,对JLabel设置背景颜色必须要有上一步
		// Shengxiao.setBackground(Color.BLACK);
		this.setSx(Shengxiao);
		panel_4.add(Shengxiao);

		JLabel lunar = new JLabel("农历日期");
		lunar.setForeground(Color.WHITE);
		// 默认是透明的，所以默认情况下对其设置背景色是不管用的。
		lunar.setOpaque(false);
		// 为什么没起效,对JLabel设置背景颜色必须要有上一步
		// lunar.setBackground(Color.BLACK);
		this.setCalendar(lunar);
		panel_4.add(lunar);

		// 显示日期代码
		JLabel date = new JLabel();
		date.setForeground(Color.white);// 颜色
		// 设置背景颜色
		date.setOpaque(false);
		// date.setBackground(Color.BLACK);
		this.setDate(date);// 调用成员方法setDate（）
		panel_4.add(date);

		JLabel week = new JLabel();
		week.setForeground(Color.white);// 颜色
		// 设置背景颜色
		week.setOpaque(false);
		// week.setBackground(Color.BLACK);
		this.setWeek(week);// 调用成员方法setDate（）
		panel_4.add(week);

		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(this.getWidth(), 1));
		separator.setBackground(new Color(153, 153, 153));
		panel.add(separator);
		// 第三个面板
		JPanel panel_2 = new JPanel(new GridLayout(0, 3, 0, 0));
		panel_2.setOpaque(false);
		panel.add(panel_2);
		// 游戏贪吃蛇
		JButton btnNewButton = new JButton("游戏",
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\desk.png"));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Snake1 t = new Snake1();
				t.Thread();

				JFrame game = new JFrame();
				Image img = Toolkit.getDefaultToolkit().getImage("title.png");// 窗口图标
				game.setIconImage(img);
				game.setTitle("贪吃蛇");
				game.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		        game.setSize(502, 507);
				game.getContentPane().setBackground(Color.black);
				game.setSize(602, 507);
				game.setResizable(false);
				game.setLocationRelativeTo(null);

				game.add(t);
				game.setVisible(true);
			}

		});
		btnNewButton.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		panel_2.add(btnNewButton);

		JButton button_2 = new JButton("搜索",
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\搜索--1.png"));
		button_2.setForeground(Color.WHITE);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fileSearch test = new fileSearch();

				test.setVisible(true);
			}

		});
		panel_2.add(button_2);

		JButton btnNewButton_1 = new JButton("背景设置",
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\背景设置.png"));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JColorChooser chooser = new JColorChooser(); // 实例化颜色选择器
				Color color = chooser.showDialog(Deskhelp.this, "选取颜色", Color.red); // 得到选择的颜色
				if (color == null) // 如果未选取
					color = Color.gray; // 则设置颜色为灰色
				getContentPane().setBackground(color); // 改变面板的背景色
			}
		});
		panel_2.add(btnNewButton_1);

		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(this.getWidth(), 1));
		separator_1.setBackground(new Color(255, 255, 255));
		panel.add(separator_1);
		// 第四个面板
		JPanel panel_3 = new JPanel(new GridLayout(1, 6));
		panel_3.setOpaque(false);
		panel.add(panel_3);

		// 截屏
		JButton button_3 = new JButton(
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\截屏.png"));
		button_3.setForeground(Color.WHITE);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		button_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ScreenShotWindow ssw = new ScreenShotWindow();
							ssw.setVisible(true);
						} catch (AWTException e) {
							e.printStackTrace();
						}
					}
				});
			}

		});
		panel_3.add(button_3);

		// 记事本
		JButton button_5 = new JButton(
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\记事本.png"));
		button_5.setForeground(Color.WHITE);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		button_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime run = Runtime.getRuntime(); // 建立操作类
				Process pro = null; // 获取操作类方法exec（）的返回值
				try {
					pro = run.exec("notepad.exe"); // 这里以记事本为例子
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				try {
					Thread.sleep(6000); // 等待一秒后
				} catch (InterruptedException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				pro.destroy(); // 结束程序
			}
		});
		panel_3.add(button_5);

		// 计算器
		JButton button_6 = new JButton(
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\计算器.png"));
		button_6.setForeground(Color.WHITE);
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		button_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime run = Runtime.getRuntime(); // 建立操作类
				Process pro = null; // 获取操作类方法exec（）的返回值
				try {
					pro = run.exec("calc.exe");
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				try {
					Thread.sleep(6000); // 等待一秒后
				} catch (InterruptedException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				pro.destroy(); // 结束程序
			}
		});
		panel_3.add(button_6);

		// 画图
		JButton button_13 = new JButton(
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\画图.png"));
		button_13.setForeground(Color.WHITE);
		button_13.setContentAreaFilled(false);
		button_13.setBorderPainted(false);
		button_13.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		button_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime run = Runtime.getRuntime(); // 建立操作类
				Process pro = null; // 获取操作类方法exec（）的返回值
				try {
					pro = run.exec("mspaint.exe"); // 这里以记事本为例子
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				try {
					Thread.sleep(6000); // 等待一秒后
				} catch (InterruptedException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				pro.destroy(); // 结束程序
			}
		});
		panel_3.add(button_13);

		// 锁屏
		JButton button_7 = new JButton(
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\锁屏.png"));
		button_7.setForeground(Color.WHITE);
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		button_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Runtime.getRuntime().exec("RunDll32.exe user32.dll,LockWorkStation");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_3.add(button_7);

		// 上网
		JButton button_8 = new JButton(
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\上网.png"));
		button_8.setForeground(Color.WHITE);
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		panel_3.add(button_8);
		button_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 先判断当前平台是否支持桌面
				if (Desktop.isDesktopSupported()) {
					// 获取当前平台桌面实例
					Desktop desktop = Desktop.getDesktop();

					// 使用默认浏览器打开链接
					try {
						desktop.browse(URI.create("https://blog.csdn.net/xietansheng"));
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
			}
		});
		JSeparator separator_2 = new JSeparator();

		separator_2.setPreferredSize(new Dimension(this.getWidth(), 1));
		separator_2.setBackground(new Color(153, 153, 153));
		panel.add(separator_2);
		// 滚动面板
		/*
		 * JScrollPane scrollPane = new JScrollPane(); getContentPane().add(scrollPane,
		 * BorderLayout.CENTER);
		 * 
		 * textField = new JTextField(); scrollPane.setViewportView(textField);
		 * textField.setColumns(10);
		 */
		// 第四个面板添加待办事项面板
		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		getContentPane().add(panel_5, BorderLayout.CENTER);

		JButton button_12 = new JButton("备忘录",
				new ImageIcon("D:\\Java\\workspace\\termEnd\\src\\demo02\\images\\添加待办事项.png"));
		button_12.setForeground(Color.WHITE);
		button_12.setContentAreaFilled(false);
		button_12.setBorderPainted(false);
		button_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Jilu test = new Jilu();
				test.setVisible(true);
			}

		});
		button_12.setBackground(new Color(0, 0, 0));// 按钮的背景颜色
		panel_5.setBackground(Color.black);
		panel_5.add(button_12);
		panel.add(panel_5);
		setVisible(true);
	}

	// 这是截屏代码
	/*
	 * 截图窗口
	 */
	class ScreenShotWindow extends JFrame {
		private int orgx, orgy, endx, endy;
		private BufferedImage image = null;
		private BufferedImage tempImage = null;
		private BufferedImage saveImage = null;

		private ToolsWindow tools = null;// 操作窗口

		public ScreenShotWindow() throws AWTException {
			// 获取屏幕尺寸
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			this.setBounds(0, 0, d.width, d.height);

			// 截取屏幕
			Robot robot = new Robot();
			// 创建包含从屏幕读取的像素的图像。此图像不包括鼠标光标
			image = robot.createScreenCapture(new Rectangle(0, 0, d.width, d.height));

			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					// 鼠标松开时记录起点坐标，并隐藏操作窗口
					orgx = e.getX();
					orgy = e.getY();

					if (tools != null) {
						tools.setVisible(false);
					}
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// 鼠标松开时，显示操作窗口
					// e.getX(), e.getY()鼠标结束的位置出现操作窗口
					if (tools == null) {
						tools = new ToolsWindow(ScreenShotWindow.this, e.getX(), e.getY());
					} else {
						tools.setLocation(e.getX(), e.getY());
					}
					tools.setVisible(true);
				}
			});

			this.addMouseMotionListener(new MouseMotionAdapter() {

				@Override
				public void mouseDragged(MouseEvent e) {
					// 鼠标拖动时，记录坐标并重绘窗口
					endx = e.getX();
					endy = e.getY();
					// 抽象类映像是表示图形映像的所有类的超类。图像必须以特定于平台的方式获得。
					// 临时图像，用于缓冲屏幕区域放置屏幕闪烁
					// createImage方法得到图像
					Image tempImage2 = createImage(ScreenShotWindow.this.getWidth(), ScreenShotWindow.this.getHeight());
					// 图形类是所有图形上下文的抽象基类，它允许应用程序绘制在各种设备上实现的组件，
					// 以及屏幕外的图像。
					Graphics g = tempImage2.getGraphics();// 为绘制到屏幕外的图像创建图形上下文。此方法只能调用屏幕外的图像。
					// drawImage方法的返回值是true或者false
					g.drawImage(tempImage, 0, 0, null);
					// 返回两个整型值中较小的那个
					int x = Math.min(orgx, endx);
					int y = Math.min(orgy, endy);
					// 减1加1都了防止图片矩形框覆盖掉;返回一个int值的绝对值
					int width = Math.abs(endx - orgx) + 1;
					int height = Math.abs(endy - orgy) + 1;

					// 返回指定矩形区域定义的子图像。
					saveImage = image.getSubimage(x, y, width, height);
					// 尽可能多地绘制当前可用的指定图像。在这个图形上下文的坐标空间中，图像的左上角(x, y)被绘制。图像中的透明像素
					// 不会影响已经存在的像素。
					// 在所有情况下，此方法都立即返回，即使尚未加载完整的图像，也未对当前输出设备进行犹豫和转换。
					// 如果图像已经完全加载，并且它的像素不再改变，那么drawImage返回true。否则，drawImage返回
					// false，当更多的图像变得可用或者是时候绘制另一帧动画，加载图像的过程通知指定的图像观察者。
					g.drawImage(saveImage, x, y, null);

					ScreenShotWindow.this.getGraphics().drawImage(tempImage2, 0, 0, ScreenShotWindow.this);
				}
			});
		}

		@Override
		public void paint(Graphics g) {
			/*RescaleOp类通过将每个像素的采样值乘以一个比例因子，然后添加
			一个偏移量，对源图像中的数据逐像素进行重新排序。缩放后的样
			本值被剪切到目标图像中可表示的最小/最大值。*/
			RescaleOp ro = new RescaleOp(0.8f, 0, null);
			//对源 Raster 中的像素数据进行重缩放。
			/*
			 * 重新测量源缓冲区。如果源图像中的颜色模型与目标图像中的颜色模型不同，
			 * 则像素将被转换到目标图像中。如果目标图像为空，则使用源ColorModel创
			 * 建BufferedImage。如果该对象的缩放因子/偏移量
			 * 的数量不符合上述类注释中规定的条件，或者该源图像
			 * 具有IndexColorModel，则可能抛出IllegalArgumentException。
			 */
			tempImage = ro.filter(image, null);
			g.drawImage(tempImage, 0, 0, this);
		}

		// 保存图像到文件
		public void saveImage() throws IOException {
			//文件选择器
			JFileChooser jfc = new JFileChooser();
			jfc.setDialogTitle("保存");

			// 文件过滤器，用户过滤可选择文件
			/*FileFilter的一种实现，它使用一组特定的扩展进行过滤。
			 * 文件的扩展名是文件名最后一个“.”后面的部分。名称不包含“。”
			 * 的文件没有文件扩展名。文件名扩展比较不区分大小写。
			 */
		
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG", "jpg");// 过滤文件名，只显示jpg格式文件
			// 将文件过滤器加入到文件选择中；设置当前文件过滤器。文件筛选器使用文件筛选器从用户的视图中筛选文件
			jfc.setFileFilter(filter); 

			// 初始化一个默认文件（此文件会生成到桌面上）
			SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddHHmmss");
			String fileName = sdf.format(new Date()); // 把时间作为图片名（防止图片名重复，而把之前的图片覆盖）
			//FileSystemView是JFileChooser通向文件系统的网关; 获取系统桌面的路径
			File filePath = FileSystemView.getFileSystemView().getHomeDirectory(); 
			File defaultFile = new File(filePath + File.separator + fileName + ".jpg");
			jfc.setSelectedFile(defaultFile);

			int flag = jfc.showSaveDialog(this);
			if (flag == JFileChooser.APPROVE_OPTION) {
				File file = jfc.getSelectedFile();
				String path = file.getPath();
				// 检查文件后缀，放置用户忘记输入后缀或者输入不正确的后缀
				if (!(path.endsWith(".jpg") || path.endsWith(".JPG"))) {
					path += ".jpg";
				}
				// 写入文件
				ImageIO.write(saveImage, "jpg", new File(path));
				// System.exit(0);
			}
		}
	}

	/*
	 * 操作窗口
	 */
	class ToolsWindow extends JFrame {
		// 截屏窗口
		private ScreenShotWindow parent;

		public ToolsWindow(ScreenShotWindow parent, int x, int y) {
			this.parent = parent;
			this.init();
			this.setLocation(x, y);
			this.pack();
			this.setVisible(true);
		}

		private void init() {

			this.setLayout(new BorderLayout());
			JToolBar toolBar = new JToolBar("Java 截图");

			// 保存按钮
			JButton saveButton = new JButton("保存");
			saveButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						parent.saveImage();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
			toolBar.add(saveButton);

			this.add(toolBar, BorderLayout.NORTH);
		}
	}

	// 这是显示时间代码
	private void setTimer(JLabel time) {
		final JLabel varTime = time;
		// 匿名类
		// Timer类以指定的时间间隔触发一个或多个actionevent，设置计时器涉及创建一个计时器对象，
		// 在其上注册一个或多个操作监听器，然后使用start方法启动计时器。例如，下面的代码创建并启动
		// 一个timer每秒触发一次动作事件(由Timer构造函数的第一个参数指定)。
		// Timer构造函数的第二个参数指定一个监听器来接收Timer的动作事件。
		Timer timeAction = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long timemillis = System.currentTimeMillis();// 返回当前时间
				// 转换日期显示格式
				SimpleDateFormat df = new SimpleDateFormat("HH:mm");
				varTime.setText(df.format(new Date(timemillis)));
			}
		});
		timeAction.start();
	}

	// 生肖和农历日期
	class Lunar {
		private int year;
		private int month;
		private int day;
		private boolean leap;
		final String chineseNumber[] = { "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二" };
		SimpleDateFormat chineseDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		final long[] lunarInfo = new long[] { 0x04bd8, 0x04ae0, 0x0a570, 0x054d5, 0x0d260, 0x0d950, 0x16554, 0x056a0,
				0x09ad0, 0x055d2, 0x04ae0, 0x0a5b6, 0x0a4d0, 0x0d250, 0x1d255, 0x0b540, 0x0d6a0, 0x0ada2, 0x095b0,
				0x14977, 0x04970, 0x0a4b0, 0x0b4b5, 0x06a50, 0x06d40, 0x1ab54, 0x02b60, 0x09570, 0x052f2, 0x04970,
				0x06566, 0x0d4a0, 0x0ea50, 0x06e95, 0x05ad0, 0x02b60, 0x186e3, 0x092e0, 0x1c8d7, 0x0c950, 0x0d4a0,
				0x1d8a6, 0x0b550, 0x056a0, 0x1a5b4, 0x025d0, 0x092d0, 0x0d2b2, 0x0a950, 0x0b557, 0x06ca0, 0x0b550,
				0x15355, 0x04da0, 0x0a5d0, 0x14573, 0x052d0, 0x0a9a8, 0x0e950, 0x06aa0, 0x0aea6, 0x0ab50, 0x04b60,
				0x0aae4, 0x0a570, 0x05260, 0x0f263, 0x0d950, 0x05b57, 0x056a0, 0x096d0, 0x04dd5, 0x04ad0, 0x0a4d0,
				0x0d4d4, 0x0d250, 0x0d558, 0x0b540, 0x0b5a0, 0x195a6, 0x095b0, 0x049b0, 0x0a974, 0x0a4b0, 0x0b27a,
				0x06a50, 0x06d40, 0x0af46, 0x0ab60, 0x09570, 0x04af5, 0x04970, 0x064b0, 0x074a3, 0x0ea50, 0x06b58,
				0x055c0, 0x0ab60, 0x096d5, 0x092e0, 0x0c960, 0x0d954, 0x0d4a0, 0x0da50, 0x07552, 0x056a0, 0x0abb7,
				0x025d0, 0x092d0, 0x0cab5, 0x0a950, 0x0b4a0, 0x0baa4, 0x0ad50, 0x055d9, 0x04ba0, 0x0a5b0, 0x15176,
				0x052b0, 0x0a930, 0x07954, 0x06aa0, 0x0ad50, 0x05b52, 0x04b60, 0x0a6e6, 0x0a4e0, 0x0d260, 0x0ea65,
				0x0d530, 0x05aa0, 0x076a3, 0x096d0, 0x04bd7, 0x04ad0, 0x0a4d0, 0x1d0b6, 0x0d250, 0x0d520, 0x0dd45,
				0x0b5a0, 0x056d0, 0x055b2, 0x049b0, 0x0a577, 0x0a4b0, 0x0aa50, 0x1b255, 0x06d20, 0x0ada0 };

		// ====== 传回农历 y年的总天数
		final private int yearDays(int y) {
			int i, sum = 348;
			for (i = 0x8000; i > 0x8; i >>= 1) {
				if ((lunarInfo[y - 1900] & i) != 0)
					sum += 1;

			}
			return (sum + leapDays(y));
		}

		// ====== 传回农历 y年闰月的天数
		final private int leapDays(int y) {
			if (leapMonth(y) != 0) {
				if ((lunarInfo[y - 1900] & 0x10000) != 0)
					return 30;
				else
					return 29;
			} else
				return 0;
		}

		// ====== 传回农历 y年闰哪个月 1-12 , 没闰传回 0
		final private int leapMonth(int y) {
			// 1111
			// 1010110101010000
			return (int) (lunarInfo[y - 1900] & 0xf);
		}

		// ====== 传回农历 y年m月的总天数
		final private int monthDays(int y, int m) {
			if ((lunarInfo[y - 1900] & (0x10000 >> m)) == 0)
				return 29;
			else
				return 30;
		}

		// ====== 传回农历 y年的生肖
		final public String animalsYear() {
			final String[] Animals = new String[] { "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪" };
			return Animals[(year - 4) % 12];
		}

		// ====== 传入 月日的offset 传回干支, 0=甲子
		final private String cyclicalm(int num) {
			final String[] Gan = new String[] { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸" };
			final String[] Zhi = new String[] { "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥" };
			return (Gan[num % 10] + Zhi[num % 12]);
		}

		// ====== 传入 offset 传回干支, 0=甲子
		final public String cyclical() {
			int num = year - 1900 + 36;
			return (cyclicalm(num));
		}

		/*
		 * /** 传出y年m月d日对应的农历. yearCyl3:农历年与1864的相差数 ? monCyl4:从1900年1月31日以来,闰月数
		 * dayCyl5:与1900年1月31日相差的天数,再加40 ?
		 *
		 */
		public Lunar(Calendar cal) {
			int yearCyl, monCyl, dayCyl;
			int leapMonth = 0;
			Date baseDate = null;//基准日期
			try {
				//parse解析给定字符串开头的文本以生成日期
				baseDate = chineseDateFormat.parse("1900年1月31日");
			} catch (ParseException e) {
				e.printStackTrace(); // To change body of catch statement use
				// Options | File Templates.
			}

			// 求出和1900年1月31日相差的天数;
			//getTime()方法获得日期的毫秒数
			//cal.getTime().getTime() - baseDate.getTime()得到毫秒数差
			/*
			 * 除以1000，得到秒数的差；再除以60，得到分钟数的差；再除以60，
			 * 得到小时数的差；再除以24小时，得到天数的差。
			 */
			int offset = (int) ((cal.getTime().getTime() - baseDate.getTime()) /(1000*60*60*24));
			dayCyl = offset + 40;
			monCyl = 14;

			// 用offset减去每农历年的天数
			// 计算当天是农历第几天
			// i最终结果是农历的年份
			// offset是当年的第几天
			int iYear, daysOfYear = 0;
			for (iYear = 1900; iYear < 2050 && offset > 0; iYear++) {
				daysOfYear = yearDays(iYear);
				offset -= daysOfYear;
				monCyl += 12;
			}
			if (offset < 0) {
				offset += daysOfYear;
				iYear--;
				monCyl -= 12;
			}
			// 农历年份
			year = iYear;

			yearCyl = iYear - 1864;
			leapMonth = leapMonth(iYear); // 闰哪个月,1-12
			leap = false;

			// 用当年的天数offset,逐个减去每月（农历）的天数，求出当天是本月的第几天
			int iMonth, daysOfMonth = 0;
			for (iMonth = 1; iMonth < 13 && offset > 0; iMonth++) {
				// 闰月
				if (leapMonth > 0 && iMonth == (leapMonth + 1) && !leap) {
					--iMonth;
					leap = true;
					daysOfMonth = leapDays(year);
				} else
					daysOfMonth = monthDays(year, iMonth);

				offset -= daysOfMonth;
				// 解除闰月
				if (leap && iMonth == (leapMonth + 1))
					leap = false;
				if (!leap)
					monCyl++;
			}
			// offset为0时，并且刚才计算的月份是闰月，要校正
			if (offset == 0 && leapMonth > 0 && iMonth == leapMonth + 1) {
				if (leap) {
					leap = false;
				} else {
					leap = true;
					--iMonth;
					--monCyl;
				}
			}
			// offset小于0时，也要校正
			if (offset < 0) {
				offset += daysOfMonth;
				--iMonth;
				--monCyl;
			}
			month = iMonth;
			day = offset + 1;
		}

		public String getChinaDayString(int day) {
			String chineseTen[] = { "初", "十", "廿", "卅" };
			int n = day % 10 == 0 ? 9 : day % 10 - 1;
			if (day > 30)
				return "";
			if (day == 10)
				return "初十";
			else
				return chineseTen[day / 10] + chineseNumber[n];
		}

		public String toString() {
			return (leap ? "闰" : "") + chineseNumber[month - 1] + "月" + getChinaDayString(day);
		}
	}

	// 显示生肖
	public void setSx(JLabel Shengxiao) {
		Calendar today = Calendar.getInstance();
		Lunar lunar1 = new Lunar(today);
		String mLunar = lunar1.cyclical() + "•" + lunar1.animalsYear();
		Shengxiao.setText(mLunar);
	}

	// 显示农历日期
	public void setCalendar(JLabel lunar) {
		Calendar today = Calendar.getInstance();
		Lunar lunar1 = new Lunar(today);
		String mLunar = lunar1.toString();
		lunar.setText(mLunar);
	}

	// 显示日期代码
	private void setDate(JLabel date) {
		final JLabel varDate = date;
		// 匿名类
		// Timer类以指定的时间间隔触发一个或多个actionevent，设置计时器涉及创建一个计时器对象，在其上注册一个或多个操作监听器，然后使用start方法启动计时器。例如，下面的代码创建并启动一个timer每秒触发一次动作事件(由Timer构造函数的第一个参数指定)。
		// Timer构造函数的第二个参数指定一个监听器来接收Timer的动作事件。
		Timer timeAction = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long timemillis = System.currentTimeMillis();// 返回当前时间
				// 转换日期显示格式
				SimpleDateFormat df = new SimpleDateFormat("MM月dd日");
				varDate.setText(df.format(new Date(timemillis)));
			}
		});
		timeAction.start();
	}

	// 显示星期代码
	private void setWeek(JLabel week) {
		Date date = new Date();
		SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
		week.setText(dateFm.format(date));
	}

	// 程序入口
	public static void main(String[] args) {
		new Deskhelp();
	}
}
