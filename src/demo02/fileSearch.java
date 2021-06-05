package demo02;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class fileSearch extends JFrame {

	public fileSearch() {
		this.setTitle("文件搜索");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//子窗体关闭
		this.add(new SearchFilePanel());
	}

	public static void main(String[] args) {
		fileSearch test = new fileSearch();
		test.setVisible(true);
	}
}

class SearchFilePanel extends JPanel {

	private JButton search;// 查找按钮
	
	private JLabel filter, directory, statusShow1;
	
	private JTextField textFilter, textDirectory;
	
	private JTextArea result;
	
	
	
	private String p, f;

	public SearchFilePanel() {

		directory = new JLabel("请输入磁盘路径：", 2);
		filter = new JLabel("请输入要搜索的文件名：", 2);
		statusShow1 = new JLabel("准备搜索...", 2);
		textFilter = new JTextField(15);
		textDirectory = new JTextField(15);

		result = new JTextArea();
		result.setLineWrap(true);
		result.setWrapStyleWord(true); 
		result.setEditable(false);// 出现的结果，不可编辑
		JScrollPane js = new JScrollPane(result);// 滚动面板

		search = new JButton("开始搜索");
		

		// 给搜索按钮添加监听事件
		search.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {

				result.setText("");

				f = textFilter.getText().trim();//输入的关键字
				p = textDirectory.getText().trim();

				/*if ("".equals(f)) {
					System.out.println("输入内容不能为空！");
				}
				if ("".equals(p)) {
					System.out.println("路径不能为空!");
				} else {
					Thread searchT = new Thread(new Runnable() {
						public void run() {*/
							doSearch(f, p);
						/*}
					});
					searchT.start();
				}*/
			}

		});

		setLayout(new GridBagLayout());
		// GridBagConstraints类指定使用GridBagLayout类布局的组件的约束。
		GridBagConstraints gc = new GridBagConstraints();
		/*
		 * 当组件小于其显示区域时，将使用此字段。它决定在显示区域内将组件放置在何处。 有三种可能的值:方向相对值、基线相对值和绝对值。方向相对值是相对于容器的组件方
		 * 向属性来解释的，基线相对值是相对于基线来解释的，而绝对值则不是。绝对值有:中、
		 * 北、东北、东、东南、南、西南、西、西北。方向相对值分别为:PAGE_START、PAGE_END、
		 * LINE_START、LINE_END、FIRST_LINE_START、FIRST_LINE_END、LAST_LINE_START、
		 * LAST_LINE_END。基线的相对值为:BASELINE、BASELINE_LEADING、baseline_、
		 * ABOVE_BASELINE_LEADING、above_baseline_、above_baseline_、
		 * BELOW_BASELINE_LEADING、below_baseline_。默认值是CENTER。
		 */
		gc.anchor = GridBagConstraints.WEST;
		addComponet(gc, filter, 0, 0, 1, 1);//添加组件
		addComponet(gc, directory, 0, 1, 1, 1);

		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weightx = 100;
		addComponet(gc, textFilter, 1, 0, 1, 1);
		addComponet(gc, textDirectory, 1, 1, 1, 1);

		gc.fill = GridBagConstraints.NONE;
		gc.weightx = 0;
		addComponet(gc, search, 2, 0, 1, 1);
		

		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.weightx = 100;
		addComponet(gc, statusShow1, 0, 2, 3, 1);
		

		gc.fill = GridBagConstraints.BOTH;
		gc.weighty = 100;
		addComponet(gc, js, 0, 4, 3, 1);
	}

	public void addComponet(GridBagConstraints gc, Component c, int x, int y, int w, int h) {
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = w;
		gc.gridheight = h;
		add(c, gc);
	}

	//搜索
	private void doSearch(String filter, String path) {
		File file = new File(path);
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] fileArray = file.listFiles();
				for (File f : fileArray) {
					if (f.isDirectory()) {
						if(f.getName().contains(filter)) {
							result.append("找到了文件夹"+f.getAbsolutePath()+"\r\n");
						}
						doSearch(filter, f.getPath());
					} else {
						if (f.getName().indexOf(filter) >= 0) {
							
							result.append("找到了"+f.getPath()+"\r\n");//文件搜索换行
							
							
						}
					}
					statusShow1.setText(f.getPath());
				}
				
			} else {
				System.out.println("不能打开文件路径!");
			}
		} else {
			System.out.println("此路径不存在!");
		}
	}
}
