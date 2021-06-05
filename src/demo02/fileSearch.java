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
		this.setTitle("�ļ�����");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//�Ӵ���ر�
		this.add(new SearchFilePanel());
	}

	public static void main(String[] args) {
		fileSearch test = new fileSearch();
		test.setVisible(true);
	}
}

class SearchFilePanel extends JPanel {

	private JButton search;// ���Ұ�ť
	
	private JLabel filter, directory, statusShow1;
	
	private JTextField textFilter, textDirectory;
	
	private JTextArea result;
	
	
	
	private String p, f;

	public SearchFilePanel() {

		directory = new JLabel("���������·����", 2);
		filter = new JLabel("������Ҫ�������ļ�����", 2);
		statusShow1 = new JLabel("׼������...", 2);
		textFilter = new JTextField(15);
		textDirectory = new JTextField(15);

		result = new JTextArea();
		result.setLineWrap(true);
		result.setWrapStyleWord(true); 
		result.setEditable(false);// ���ֵĽ�������ɱ༭
		JScrollPane js = new JScrollPane(result);// �������

		search = new JButton("��ʼ����");
		

		// ��������ť��Ӽ����¼�
		search.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {

				result.setText("");

				f = textFilter.getText().trim();//����Ĺؼ���
				p = textDirectory.getText().trim();

				/*if ("".equals(f)) {
					System.out.println("�������ݲ���Ϊ�գ�");
				}
				if ("".equals(p)) {
					System.out.println("·������Ϊ��!");
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
		// GridBagConstraints��ָ��ʹ��GridBagLayout�಼�ֵ������Լ����
		GridBagConstraints gc = new GridBagConstraints();
		/*
		 * �����С������ʾ����ʱ����ʹ�ô��ֶΡ�����������ʾ�����ڽ���������ںδ��� �����ֿ��ܵ�ֵ:�������ֵ���������ֵ�;���ֵ���������ֵ������������������
		 * �����������͵ģ��������ֵ������ڻ��������͵ģ�������ֵ���ǡ�����ֵ��:�С�
		 * �����������������ϡ��ϡ����ϡ������������������ֵ�ֱ�Ϊ:PAGE_START��PAGE_END��
		 * LINE_START��LINE_END��FIRST_LINE_START��FIRST_LINE_END��LAST_LINE_START��
		 * LAST_LINE_END�����ߵ����ֵΪ:BASELINE��BASELINE_LEADING��baseline_��
		 * ABOVE_BASELINE_LEADING��above_baseline_��above_baseline_��
		 * BELOW_BASELINE_LEADING��below_baseline_��Ĭ��ֵ��CENTER��
		 */
		gc.anchor = GridBagConstraints.WEST;
		addComponet(gc, filter, 0, 0, 1, 1);//������
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

	//����
	private void doSearch(String filter, String path) {
		File file = new File(path);
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] fileArray = file.listFiles();
				for (File f : fileArray) {
					if (f.isDirectory()) {
						if(f.getName().contains(filter)) {
							result.append("�ҵ����ļ���"+f.getAbsolutePath()+"\r\n");
						}
						doSearch(filter, f.getPath());
					} else {
						if (f.getName().indexOf(filter) >= 0) {
							
							result.append("�ҵ���"+f.getPath()+"\r\n");//�ļ���������
							
							
						}
					}
					statusShow1.setText(f.getPath());
				}
				
			} else {
				System.out.println("���ܴ��ļ�·��!");
			}
		} else {
			System.out.println("��·��������!");
		}
	}
}
