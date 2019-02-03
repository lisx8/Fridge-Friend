import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.ListCellRenderer;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.*;
public class MasterGUI implements ChangeListener{
    static JPanel testPaneList =  new JPanel();
    static JTabbedPane tabs = new JTabbedPane(JTabbedPane.BOTTOM);
    static JFrame fr = new JFrame();
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                Pantry pantry = new Pantry();
                GroceryList groceries = new GroceryList();
                ArrayList<String> itemsToBuy = groceries.getCheckList();
                ArrayList<PantryItem> purchased = pantry.getCheckList();
                JList itemsToBuyList = new JList(itemsToBuy); //WHAT IS
                JTextField shoppingBuddy = new JTextField("Fridge Friend is your shopping buddy!");
                //
                itemsToBuyList.setCellRenderer(new RadioButtonListCellRenderer());
                for (int i=0; i <itemsToBuy.size();i++)
                {
                    itemsToBuyList.add(itemsToBuy.get(i),testPaneList);
                }
                
                JList purchasedList = new JList(purchased);
                purchasedList.setCellRenderer(new RadioButtonListCellRenderer());
                for (int j=0; j <itemsToBuy.size();j++)
                {
                    PantryItem temp = purchased.remove(i);
                    purchasedList.add(temp.pantryItem() + "       " + temp.getNumDaysToExpiry());
                }
                tabs.addTab("Grocery List", null, itemsToBuyList,"n");
                tabs.addTab("Pantry", null, purchasedList,"n");
                fr.add(tabs);
                tabs.addChangeListener(this);
                fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                fr.setPreferredSize(new Dimension(800, 400));
                fr.pack();
                fr.setTitle("Fridge Friend is Your New Shopping Buddy");
                fr.setVisible(true);
                //fr.setIconImage(image);
            }
        });
    }
   public void stateChanged(ChangeEvent e)
   {
       //
   }
   public void actionPerformed(ActionEvent e)
   {
       //keyboard input creates a grocerylist item
   }
   public void addItemToFile()
   {
        
   }
   public void removeItemFromFile()
   {
        
   }
}


//Source from StackOverflow
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

