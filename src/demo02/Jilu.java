package demo02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Jilu extends JFrame implements ActionListener {

	JPanel panel1, panel2, panel3, panel3_1;
	JLabel labelC, labelB;
	JTextArea memoEdit;
	Calendar dat;
	String str;
	int yea, mon, da;
	int open;
	JLabel week[];
	JButton preYear;
	JButton nexYear;
	JButton preMonth;
	JButton nexMonth;
	JButton save, about, readMe, delete;
	JButton button[];

	public Jilu() {
		JPanel panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel3_1 = new JPanel();
		week = new JLabel[7];
		button = new JButton[42];
		// ��һ�����
		panel1.setLayout(new GridLayout(1, 5, 1, 0));
		preYear = new JButton("��һ��");
		preYear.addActionListener(this);
		nexYear = new JButton("��һ��");
		nexYear.addActionListener(this);
		preMonth = new JButton("��һ��");
		preMonth.addActionListener(this);
		nexMonth = new JButton("��һ��");
		nexMonth.addActionListener(this);

		save = new JButton("���汸��¼�ļ�");
		save.setEnabled(false);
		save.addActionListener(this);
		delete = new JButton("ɾ������¼�ļ�");
		delete.setEnabled(false);
		delete.addActionListener(this);

		memoEdit = new JTextArea("");
		memoEdit.setRows(8);
		JScrollPane roll1 = new JScrollPane(memoEdit);
		memoEdit.setEditable(false);

		labelB = new JLabel();
		labelB.setHorizontalAlignment(JLabel.CENTER);// ʹ���ı�����
		labelB.setBackground(new Color(255, 50, 50));

		labelC = new JLabel();
		labelC.setHorizontalAlignment(JLabel.CENTER);// ʹ���ı�����
		labelC.setBackground(new Color(255, 50, 50));

		dat = Calendar.getInstance();
		panel1.add(preYear);
		panel1.add(preMonth);
		panel1.add(labelC);
		panel1.add(nexMonth);
		panel1.add(nexYear);
		// �ڶ������
		panel2.setLayout(new GridLayout(7, 7, 4, 0));
		for (int i = 0; i < 7; ++i) {
			week[i] = new JLabel();
			week[i].setHorizontalAlignment(JLabel.CENTER);// ʹ���ı�����
			//week[i].setBackground(new Color(0, 255, 0));
			panel2.add(week[i]);
		}

		week[0].setText("������");
		week[1].setText("����һ");
		week[2].setText("���ڶ�");
		week[3].setText("������");
		week[4].setText("������");
		week[5].setText("������");
		week[6].setText("������");
		for (int i = 0; i < 7; ++i) {
			week[i].setAlignmentX(Label.CENTER);
		}
		// 42����ť
		for (int i = 0; i < 42; ++i) {
			button[i] = new JButton();
			button[i].addActionListener(this);
			panel2.add(button[i]);
		}

		// ������С���ɾ���ͱ��水ť
		panel3_1.setLayout(new GridLayout(1, 2));

		panel3_1.add(save);
		panel3_1.add(labelB);
		panel3_1.add(delete);
		// ��������壨�������һ������ټ���һ���ı�����

		panel3.setLayout(new BorderLayout());
		panel3.add(roll1, BorderLayout.NORTH);
		panel3.add(panel3_1, BorderLayout.SOUTH);

		// �����Ǹ��ֹ���
		yea = dat.get(Calendar.YEAR);
		mon = dat.get(Calendar.MONTH) + 1;
		da = dat.get(Calendar.DAY_OF_MONTH);
		str = new String("" + yea + "��" + mon + "��" + da + "��");
		setCalendar(yea, mon);// ���÷���setCalendar

		setLayout(new BorderLayout());
		setSize(378,455);
		/*
		 * add(panel1, BorderLayout.NORTH); add(panel2, BorderLayout.CENTER);
		 * add(panel3, BorderLayout.SOUTH);
		 */

		panel.add(panel1, BorderLayout.NORTH);
		panel.add(panel2, BorderLayout.CENTER);
		panel.add(panel3, BorderLayout.SOUTH);
		add(panel);
		setTitle("����ʱ����㼣");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// �Ӵ���
		setResizable(false);
		setVisible(true);
	}

	public void setCalendar(int year, int month) {
		int j = 0;
		int startDay = getWeek(year, month, 1);
		for (int i = 0; i < 42; ++i) {
			button[i].setLabel("");// ������
			button[i].setBackground(new Color(255, 255, 255));
		}
		// �������
		labelC.setText("" + year + "��" + month + "��");//�������
		if (2 == month && !((yea % 4 == 0 && yea % 100 != 0) || (yea % 400 == 0)))
			for (int i = 1; i < 29; ++i) {
				j = i + startDay - 1;
				button[j].setLabel("" + i);
				if (("" + yea + "��" + mon + "��" + i + "��").equals(str)) {
					button[j].setBackground(new Color(0, 155, 254));
				}
			}
		//����
		else if (2 == month && ((yea % 4 == 0 && yea % 100 != 0) || (yea % 400 == 0))) {
			for (int i = 1; i < 30; ++i) {
				j = i + startDay - 1;
				button[j].setLabel("" + i);
				if (("" + yea + "��" + mon + "��" + i + "��").equals(str)) {
					button[j].setBackground(new Color(0, 155, 254));
				}
			}
		} else if (1 == month || 3 == month || 5 == month || 7 == month || 8 == month || 10 == month || 12 == month)
			for (int i = 1; i < 32; ++i) {
				j = i + startDay - 1;
				button[j].setLabel("" + i);
				if (("" + yea + "��" + mon + "��" + i + "��").equals(str)) {
					button[j].setBackground(new Color(0, 155, 254));
				}
			}
		else
			for (int i = 1; i < 31; ++i) {
				j = i + startDay - 1;
				button[j].setLabel("" + i);
				if (("" + yea + "��" + mon + "��" + i + "��").equals(str)) {
					button[j].setBackground(new Color(0, 155, 254));
				}
			}
	}

	public int getWeek(int year, int month, int day) {
		int week = 0;
		int cen = year / 100;
		year = year % 100;
		day = 1;
		if (1 == month) {
			month = 13;
			year--;
		}
		if (2 == month) {
			month = 14;
			year--;
		}
		week = (year + (year / 4) + (cen / 4) - 2 * cen + (26 * (month + 1) / 10) + day - 1) % 7;
		if (week < 0)
			week = week + 7;
		return week;
	}

	public void actionPerformed(ActionEvent arg0) {
		if (preYear == arg0.getSource()) {
			yea = yea - 1;
			if (yea < 0)
				yea = 1;
			setCalendar(yea, mon);
		} else if (nexYear == arg0.getSource()) {
			yea = yea + 1;
			setCalendar(yea, mon);
		} else if (preMonth == arg0.getSource()) {
			mon = mon - 1;
			if (0 == mon) {
				yea = yea - 1;
				mon = mon + 12;
			}
			setCalendar(yea, mon);
		} else if (nexMonth == arg0.getSource()) {
			mon = mon + 1;
			if (mon > 12) {
				yea = yea + 1;
				mon = mon - 12;
			}
			setCalendar(yea, mon);
		} else if (save == arg0.getSource()) {
			File fileMemo = new File("memo");// ����һ���ļ�����
			if (!fileMemo.exists()) {// �ж��ļ����Ƿ����
				fileMemo.mkdir();// ��������ھͽ�һ��
			}
			File fileMemoInclude = new File(fileMemo, labelC.getText() + button[open].getLabel() + "�ձ���¼.txt");
			if (fileMemoInclude.exists()) {
				fileMemoInclude.delete();
			}
			try {
				fileMemoInclude.createNewFile();
				// �ļ������;д�ļ�
				FileOutputStream fout = new FileOutputStream(fileMemoInclude);
				// ���ַ����ֽڵ�ת��
				OutputStreamWriter write = new OutputStreamWriter(fout, "UTF-8");
				// �ַ������
				BufferedWriter writer = new BufferedWriter(write);
				// ����ı����������
				String temp = new String(memoEdit.getText());

				writer.write(temp);
				writer.close(); 
				write.close(); 

				fout.close(); 
			} catch (FileNotFoundException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}
			JOptionPane.showMessageDialog(panel3, "�ļ��ѱ�����ϣ��뵽��memo���ļ����²鿴��");
		} else if (delete == arg0.getSource()) {
			File fileMemo = new File("memo");
			if (!fileMemo.exists())
				fileMemo.mkdir();
			File fileMemoInclude = new File(fileMemo, labelC.getText() + button[open].getLabel() + "�ձ���¼.txt");
			if (fileMemoInclude.exists())
				fileMemoInclude.delete();
			save.setEnabled(false);
			delete.setEnabled(false);
			memoEdit.setEditable(false);
			memoEdit.setText("");
		}

		else {
			for (int i = 0; i < 42; ++i) {
				if (arg0.getSource() == button[i])
					open = i;
			}
			File fileMemo = new File("memo");
			if (!fileMemo.exists())
				fileMemo.mkdir();

			if (!("").equals(button[open].getLabel())) {
				save.setEnabled(true);
				delete.setEnabled(true);
				memoEdit.setEditable(true);
				memoEdit.setText("");
				for (int i = 0; i < 42; ++i) {
					if (("" + yea + "��" + mon + "��" + button[i].getLabel() + "��").equals(str))
						button[i].setBackground(new Color(0, 155, 254));
					else
						button[i].setBackground(new Color(255, 255, 255));
				}
				button[open].setBackground(new Color(203, 229, 254));
				File fileMemoInclude = new File(fileMemo, labelC.getText() + button[open].getLabel() + "�ձ���¼.txt");
				try {
					if (!fileMemoInclude.exists())
						fileMemoInclude.createNewFile();
					FileInputStream fin = new FileInputStream(fileMemoInclude);
					InputStreamReader read = new InputStreamReader(fin, "UTF-8");
					BufferedReader reader = new BufferedReader(read);

					String temp = new String("");
					String line = new String("");

					while ((line = reader.readLine()) != null)
						temp = temp + line + "\n";

					memoEdit.setText(temp);

					reader.close(); // һ��Ҫ�ر�
					read.close();
					fin.close();
					if (("").equals(memoEdit.getText()))
						fileMemoInclude.delete();
				} catch (FileNotFoundException e) {
					System.err.println(e);
				} catch (IOException e) {
					System.err.println(e);
				}
			} else {
				save.setEnabled(false);
				delete.setEnabled(false);
				memoEdit.setEditable(false);
				memoEdit.setText("");
			}
		}
	}

	public static void main(String[] args) {
		Jilu test = new Jilu();
		test.setVisible(true);
	}

}
