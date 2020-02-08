import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class frame extends JFrame{
	Book b=new Book();
   //ArrayList <Book> q=new ArrayList<Book>();
	
	JLabel t1,t2,t3;
		JPanel p1,p2,p3;
		JLabel jlabel1,jlabel2,jlabel3,jlabel4,jlabel5,jlabel6,j1,j2,j3,j4,j5,j6;
		JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8;
		JButton clear,insert,find,find2,borrow,return2;
		JRadioButton r1,r2,r3,r4;
		TextArea a=new TextArea();
     // GridLayout g=new GridLayout(4,5);
	BorderLayout p=new BorderLayout();
        ButtonGroup buttonGroup=new ButtonGroup();
        InternalFrame handler=new InternalFrame();
        Boolean f1=false,f2=false,f3=false,f4=false;
        
	public frame () {
super("Libary System");
	

	t1=new JLabel("NEW BOOK");
	t1.setFont(new Font("Arial", Font.BOLD, 16));
    t1.setForeground(Color.RED);
	
    t2=new JLabel("SEARCH BY");
	t2.setFont(new Font("Arial", Font.BOLD, 16));
    t2.setForeground(Color.RED);
	
    t3=new JLabel("BORROW BOOK");
	t3.setFont(new Font("Arial", Font.BOLD, 16));
    t3.setForeground(Color.RED);
    
	jlabel1=new JLabel("ISBN ");
	jlabel2=new JLabel("Title ");
	jlabel3=new JLabel("Author");
	jlabel4=new JLabel("Edition");
	jlabel5=new JLabel("Published Year");
	 textField1=new JTextField(10);
     textField2=new JTextField(10);
     textField3=new JTextField(10);
    textField4=new JTextField(10);
	    textField5=new JTextField(10);
	    clear=new JButton("   Clear   ");
	    clear.addActionListener(handler);
  	    insert=new JButton("  Insert  ");
  	    insert.addActionListener(handler);
  	
  	  p1=new JPanel();
  	add(p1,BorderLayout.NORTH);
  	p1.setLayout(new GridLayout(4,1));
  	p1.add(t1);
  	JPanel l10=new JPanel();
  	l10.setLayout(new GridLayout(1,5));
  	l10.add(jlabel1);l10.add(jlabel3);
	l10.add(jlabel2);l10.add(jlabel4);l10.add(jlabel5);
	p1.add(l10);
	JPanel l11=new JPanel();
  	l11.setLayout(new GridLayout(1,5));
  	l11.add(textField1);l11.add(textField3);
	l11.add(textField2);l11.add(textField4); 
	l11.add(textField5);
	p1.add(l11);
	JPanel l12=new JPanel();
	l12.setLayout(new FlowLayout());
	l12.add(insert);
	l12.add(clear);
	
	p1.add(l12);
	

	
	textField6=new JTextField(25);
      find=new JButton("Find");
      find.addActionListener(handler);
      r1=new JRadioButton("ISBN"); 
      r1.addItemListener(handler);
      r2=new JRadioButton("Title"); 
      r2.addItemListener(handler);
      r3=new JRadioButton("Author"); 
      r3.addItemListener(handler);
      r4=new JRadioButton("Published Year");
      r4.addItemListener(handler);
      buttonGroup.add(r1);
      buttonGroup.add(r2);
      buttonGroup.add(r3);
      buttonGroup.add(r4);
    p2=new JPanel();
    p2.setLayout(new GridLayout(2,1));
    add(p2,BorderLayout.CENTER);
    JPanel l4=new JPanel();
    l4.setLayout(new GridLayout(3,1));
    
    l4.add(t2);
    JPanel l5=new JPanel();
    l5.setLayout(new GridLayout(1,4));
    l5.add(r1);l5.add(r2);l5.add(r3);l5.add(r4);
    l4.add(l5);
    JPanel l6=new JPanel();
    l6.setLayout(new FlowLayout());
     l6.add(find);l6.add(textField6);
     FlowLayout f2=new FlowLayout();
     f2.setAlignment(FlowLayout.LEFT);
     l6.setLayout(f2);
     l4.add(l6);
     p2.add(l4);
   
     p2.add(a);
     a.setEditable(false);
    a.setBackground(Color.WHITE);


	textField7=new JTextField(20);textField8=new JTextField(58);
	p3=new JPanel();
	add(p3,p.SOUTH);
	
	
    find2=new JButton("Find");
    jlabel6=new JLabel("ISBN");
    borrow=new JButton("Borrow");
    borrow.addActionListener(handler);
    return2=new JButton("Return");
    return2.addActionListener(handler);
   
    
    
    p3.setLayout(new GridLayout(4,1));
    p3.add(t3);
    JPanel l=new JPanel();
    
   l.add(jlabel6);
    l.add(textField7);
    find2.addActionListener(handler);
    l.add(find2);
    FlowLayout f=new FlowLayout();
    f.setAlignment(FlowLayout.LEFT);
    l.setLayout(f);
    p3.add(l);
    JPanel l3=new JPanel();
    l3.add(textField8);
    
textField8.setEditable(false);
textField8.setBackground(Color.WHITE);

    p3.add(l3);
    JPanel l2=new JPanel();
   l2.add(borrow);l2.add(return2);
   p3.add(l2);
    
}

	class InternalFrame implements ItemListener,ActionListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(r1.isSelected()) {
				f1=true;
				f2=false;
				f3=false;
				f4=false;
			}
			
			if(r2.isSelected()) {
				f2=true;
				f1=false;
				f3=false;
				f4=false;
			}
			if(r3.isSelected()) {
				f3=true;
				f1=false;
				f2=false;
				f4=false;
			}
			if(r4.isSelected()) {
				f4=true;
				f1=false;
				f2=false;
				f3=false;
			}
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int year,edition;
			if(e.getSource()==clear) {
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
			}
			else if(e.getSource()==insert) {
				Book b2=new Book();
				boolean flag=true;
				char x[]=textField4.getText().toCharArray();
			for(int j=0;j<x.length;j++) {
				if(x[j]>'9'||x[j]<'0') {flag=false;JOptionPane.showMessageDialog(frame.this, "unvalid edition");break;}
			}
			char y[]=textField5.getText().toCharArray();
			for(int h=0;h<y.length;h++) {
				if(y[h]>'9'||y[h]<'0') {flag=false;JOptionPane.showMessageDialog(frame.this, "unvalid year");break;}
			}
			char z[]=textField1.getText().toCharArray();
			for(int r=0;r<z.length;r++) {
				if(z[r]>'9'||z[r]<'0') {flag=false;JOptionPane.showMessageDialog(frame.this, "unvalid ISBN");break;}
			}
				if((textField1.getText().equals(""))||(textField2.getText().equals(""))||(textField3.getText().equals(""))||(textField4.getText().equals(""))||(textField5.getText().equals("")))JOptionPane.showMessageDialog(frame.this, "exist the Field is empty");
				
				else {
					
					for(int i=0;i<b.A.size();i++) {
						if(b.A.get(i).getIsbn().equals(textField1.getText())) {flag=false;
						JOptionPane.showMessageDialog(frame.this, "the ISBN is used for another book");break;
					}
						
						
						}
						
					if(flag==true) {
				b2.setIsbn(textField1.getText());
				b2.setTitle(textField2.getText());
				b2.setAuthor(textField3.getText());
				edition=Integer.parseInt(textField4.getText());
						b2.setEdition(edition);
			    year=Integer.parseInt(textField5.getText());
			    b2.setPublishedYear(year);
			    b2.setBorrowed(true);
			    b.A.add(b2);
			}}
			}
			
			
			  
			String s,s2,s3,s4;
			int count=0;
			if(e.getSource()==find2) {				
				
				for(int i=0;i<b.A.size();i++) {
					s3=textField7.getText();
					s4=b.A.get(i).getIsbn();
					
				
				if(	(s3).equals(s4)) {	
					
              
					if(b.A.get(i).getBorrowed()==true) {s="avaiable";return2.setEnabled(false);borrow.setEnabled(true);}
					else {s="not avaiable";borrow.setEnabled(false);return2.setEnabled(true);}
					s2=b.A.get(i).getTitle()+"\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t"+b.A.get(i).getPublishedYear()+"\t"+s;
				textField8.setText(s2);
				      
				}
				}
				for(int j=0;j<b.A.size();j++) {
					s3=textField7.getText();
					s4=b.A.get(j).getIsbn();

				if(!(s3).equals(s4)) {	count++;
				
				}
				if(count==b.A.size())
				textField8.setText("");
			}
			}
			
			
			
              if(e.getSource()==borrow) {
					
				return2.setEnabled(true);
					borrow.setEnabled(false);
					s="not avaiable";
					for(int i=0;i<b.A.size();i++) {
						s3=textField7.getText();
						s4=b.A.get(i).getIsbn();
						
					if(	(s3).equals(s4)) {
						
					b.A.get(i).setBorrowed(false);	
						
						s2=b.A.get(i).getTitle()+"\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t"+b.A.get(i).getPublishedYear()+"\t"+s;
					
					textField8.setText(s2);
				}
					}
              }
				if(e.getSource()==return2) {
					
					return2.setEnabled(false);
					borrow.setEnabled(true);
					s="avaiable";
					for(int i=0;i<b.A.size();i++) {
						s3=textField7.getText();
						s4=b.A.get(i).getIsbn();
						
					
					if(	(s3).equals(s4)) {
						b.A.get(i).setBorrowed(true);
					
						s2=b.A.get(i).getTitle()+"\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t"+b.A.get(i).getPublishedYear()+"\t"+s;
					textField8.setText(s2);
					}
					}
				}
			
				if(e.getSource()==find) {
			if(f1==true) {
				
				String ss1,ss2,ss3="",ss4,ss5,sTransfer2;
				ss1="ISBN\t"+"\t\t"+"Title"+"\t\t\t"+"Edition"+"\t"+"Author"+"\t\t"+"Year"+"\t"+"State"+"\n";
			ss2="----------------------------------------------------------------------------------------------------------------------------------------"+"\n";
			
		
				for(int i=0;i<b.A.size();i++) {
					sTransfer2=""+b.A.get(i).getIsbn();
					if(sTransfer2.equals(textField6.getText())) {
						if(b.A.get(i).getBorrowed()==true) {ss4="avaiable";}
						else {ss4="not avaiable";}
						
					
						
						ss3+=b.A.get(i).getIsbn()+"\t\t"+b.A.get(i).getTitle()+"\t\t\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t\t"+b.A.get(i).getPublishedYear()+"\t"+ss4+"\n";
					}
					
						
					}
				
				ss5=ss1+ss2+ss3;
				a.setText(ss5);
				
			}
			
			  if(f4==true) {
				String sss1,sss2,sss3="",sss4,sss5,sTransfer;
				sss1="ISBN\t"+"\t\t"+"Title"+"\t\t\t"+"Edition"+"\t"+"Author"+"\t\t"+"Year"+"\t"+"State"+"\n";
				sss2="----------------------------------------------------------------------------------------------------------------------------------------"+"\n";
				for(int i=0;i<b.A.size();i++) {
					sTransfer=""+b.A.get(i).getPublishedYear();
					if(sTransfer.equals(textField6.getText())) {
						if(b.A.get(i).getBorrowed()==true) {sss4="avaiable";}
						else {sss4="not avaiable";}
						
						sss3+=b.A.get(i).getIsbn()+"\t\t"+b.A.get(i).getTitle()+"\t\t\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t\t"+b.A.get(i).getPublishedYear()+"\t"+sss4+"\n";
				
					}
				}
				sss5=sss1+sss2+sss3;
				a.setText(sss5);
			
			}
                
                
                if(f2==true) {
                	String sss1,sss2,sss3="",sss4,sss5,sTransfer;boolean fff;
    				sss1="ISBN\t"+"\t\t"+"Title"+"\t\t\t"+"Edition"+"\t"+"Author"+"\t\t"+"Year"+"\t"+"State"+"\n";
    				sss2="----------------------------------------------------------------------------------------------------------------------------------------"+"\n";
    				for(int i=0;i<b.A.size();i++) {
    					sTransfer=b.A.get(i).getTitle();
    					fff=b.A.get(i).getTitle().contains(textField6.getText());
    					if(sTransfer.equals(textField6.getText())||fff) {
    						if(b.A.get(i).getBorrowed()==true) {sss4="avaiable";}
    						else {sss4="not avaiable";}
    						
    						sss3+=b.A.get(i).getIsbn()+"\t\t"+b.A.get(i).getTitle()+"\t\t\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t\t"+b.A.get(i).getPublishedYear()+"\t"+sss4+"\n";
    				
    					}
    				}
    				sss5=sss1+sss2+sss3;
    				a.setText(sss5);
                }
    				
    				
                
                if(f3==true) {
                	String sss1,sss2,sss3="",sss4,sss5,sTransfer;boolean fff;
                	
    				sss1="ISBN\t"+"\t\t"+"Title"+"\t\t\t"+"Edition"+"\t"+"Author"+"\t\t"+"Year"+"\t"+"State"+"\n";
    				sss2="----------------------------------------------------------------------------------------------------------------------------------------"+"\n";
    				for(int i=0;i<b.A.size();i++) {
    					sTransfer=b.A.get(i).getAuthor();
    					fff=b.A.get(i).getAuthor().contains(textField6.getText());
    					if(sTransfer.equals(textField6.getText())||fff) {
    						if(b.A.get(i).getBorrowed()==true) {sss4="avaiable";}
    						else {sss4="not avaiable";}
    						
    						sss3+=b.A.get(i).getIsbn()+"\t\t"+b.A.get(i).getTitle()+"\t\t\t"+b.A.get(i).getEdition()+"th"+"\t"+b.A.get(i).getAuthor()+"\t\t"+b.A.get(i).getPublishedYear()+"\t"+sss4+"\n";
    				
    					}
    				}
    				sss5=sss1+sss2+sss3;
    				a.setText(sss5);
    				}
		}
		
	}
	
	}
}