import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class AddressBookView {

    protected JList<BuddyInfo> buddyList;
    protected DefaultListModel<BuddyInfo> buddyListModel;
    private JMenuBar menuBar;
    private JMenu addressBookMenu;
    private JMenu buddyInfoMenu;
    protected JMenuItem addBuddyMenuItem;
    protected JMenuItem removeBuddyMenuItem;
    private JScrollPane scrollPane;


    private JMenuItem exportMenuItem = new JMenuItem("Export");


    private JFrame frame;

    AddressBookView() {
        buddyListModel = new DefaultListModel<>();
        buddyList = new JList<>(buddyListModel);

        frame = new JFrame();
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setSize(new Dimension(500, 500));
        frame.add(panel);
        fileMenu.add(exportMenuItem);

        menuBar = new JMenuBar();
        menuBar.add(MenuBarADDR());
        menuBar.add(MenuBarBOOK());

        frame.setJMenuBar(menuBar);

        panel.add(Scroll());
    }

    public JMenu MenuBarADDR() {
        addressBookMenu = new JMenu("AddressBook");
        return addressBookMenu;
    }

    public JMenu MenuBarBOOK() {
        buddyInfoMenu = new JMenu("BuddyInfo");
        addBuddyMenuItem = menuItemADD();
        removeBuddyMenuItem = menuItemREMOVE();

        buddyInfoMenu.add(addBuddyMenuItem);
        buddyInfoMenu.add(removeBuddyMenuItem);
        return buddyInfoMenu;
    }

    public JMenuItem menuItemADD() {
        return new JMenuItem("Add Buddy");
    }

    public JMenuItem menuItemREMOVE() {
        return new JMenuItem("Remove Buddy");
    }

    public JScrollPane Scroll() {
        scrollPane = new JScrollPane(buddyList);
        return scrollPane;
    }

    public void setVisible(boolean flag){

        frame.setVisible(flag);


    }




    public void addBuddyListener(ActionListener listenforBuddyadd) {
        addBuddyMenuItem.addActionListener(listenforBuddyadd);
    }

    public void addRemoveBuddyListener(ActionListener listenforBuddremove) {
        removeBuddyMenuItem.addActionListener(listenforBuddremove);
    }

    public void addExportMenuItemListener(ActionListener listenforExportMenuItemadd){
        exportMenuItem.addActionListener(listenforExportMenuItemadd);
    }
}