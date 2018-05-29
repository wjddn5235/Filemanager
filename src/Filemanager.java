import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.File;
import java.io.FileFilter;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Filemanager extends JFrame {
	JTree tree;
	Choice ch1 = new Choice(); 
	
	
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("디스크 드라이브(C:)");
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel(new GridLayout(1,1));
	Panel p4 = new Panel();
	TextField tf = TextField(50);
	
	Label l = new Label("File Exploler");
	Label l2 = new Label("");
	Label l3 = new Label("");
	Label l4 = new Label("");
	Label l5 = new Label("");
	Label l6 = new Label("");
	Label l7 = new Label("");
	Label l8 = new Label("");
	Label l9 = new Label("");
	Label l10 = new Label("");
	Label l11 = new Label("");
	Label l12 = new Label("");
	Label l13 = new Label("");
	Label l14 = new Label("");
	Label l15 = new Label("");
	Label l16 = new Label("");
	Label l17 = new Label("");
	Label l18 = new Label("");
	Label l19 = new Label("");
	Label l20 = new Label("");
	Label l21 = new Label("");
	
	
	DefaultTreeModel treeModel;
	
	public Filemanager() {
		super("/home/");
	
		File dir = new File("\\");
		
		File[] files = dir.listFiles();
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		files = dir.listFiles(fileFilter);
		if(files.length > 0) {
				for(int i= 0; i<files.length;i++)
				{
					File filename = files[i];
					if(filename.toString().contains("$") || filename.toString().contains("Recovery")
							|| filename.toString().contains("System")||filename.toString().contains("PerfLogs"))
							continue;
							else
								{
								Object q = filename;
								String w = q.toString();
								String e[] = w.split("\\\\");
								DefaultMutableTreeNode a = new DefaultMutableTreeNode(e[1]);
								root.add(a);}
				}
		}
		
		
		
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
		
		add(p1,BorderLayout.SOUTH);
		add(p2,BorderLayout.NORTH);
		add(p3,BorderLayout.WEST);
		add(p4,BorderLayout.EAST);
		
		
		
		p1.add(l);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
		p1.add(l9);
		p1.add(l10);
		p1.add(l11);
		p1.add(l12);
		p1.add(l13);
		p1.add(l14);
		p1.add(l15);
		p1.add(l16);
		p1.add(l17);
		p1.add(l18);
		p1.add(l19);
		p1.add(l20);
		p1.add(l21);
		ch1.addItem("한국어");
		ch1.addItem("English");
		p1.add(ch1);
		p1.add(tree);
		
		p3.add(tree, BorderLayout.WEST);
		
		
		
		
		
		
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	private TextField TextField(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Filemanager();
		
		
}
}
