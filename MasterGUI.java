import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.ListCellRenderer;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.*;

public class MasterGUI {
    static JPanel testPane =  new JPanel();
    static JTabbedPane tabs = new JTabbedPane(JTabbedPane.BOTTOM);
    static JFrame fr = new JFrame();
    
    public static void main(String args[])throws FileNotFoundException  {
                Pantry pantry = new Pantry();
                GroceryList groceries = new GroceryList();
                String[] itemsToBuy = groceries.getCheckList();
                PantryItem[] purchased = pantry.getPantry();
                String[] arr = groceries.getCheckList();
                JList itemsToBuyList = new JList(arr); //WHAT IS
                //
                itemsToBuyList.setCellRenderer(new RadioButtonListCellRenderer());
                for (int i=0; i <itemsToBuy.length;i++)
                {
                    JButton currButton = new JButton(itemsToBuy[i]);
                    itemsToBuyList.add(currButton);
                    currButton.setActionCommand(Integer.toString(i));
                }
                
                JList purchasedList = new JList(purchased);
                purchasedList.setCellRenderer(new RadioButtonListCellRenderer());
                for (int j=0; j <itemsToBuy.length;j++)
                {
                    groceries.deleteAndAddToPantry(itemsToBuy[j]);
                }
                tabs.addTab("Grocery List", null, itemsToBuyList,"n");
                tabs.addTab("Pantry", null, purchasedList,"n");
                fr.add(tabs);
                fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                fr.setPreferredSize(new Dimension(800, 400));
                fr.pack();
                fr.setTitle("Fridge Friend is Your New Shopping Buddy");
                fr.setVisible(true);
                //fr.setIconImage(image);
            }
    }
//Source: StackOverflow
 class RadioButtonListCellRenderer extends JRadioButton implements ListCellRenderer{
    public Component getListCellRendererComponent(JList list, Object value, int index, 
            boolean isSelected, boolean cellHasFocus) {

        setComponentOrientation(list.getComponentOrientation());
        setFont(list.getFont());
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        setSelected(isSelected);
        setEnabled(list.isEnabled());

        setText(value == null ? "" : value.toString());  

        return this;
    }  
}

