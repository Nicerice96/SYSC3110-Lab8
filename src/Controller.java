import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {

    private AddressBookView Theview;
    private AddressBook addressBook;


    public Controller(AddressBookView view, AddressBook addressBook) {
        this.Theview = view;
        this.addressBook = addressBook;

        this.Theview.addBuddyListener(new AddBuddyListener());
        this.Theview.addRemoveBuddyListener(new RemoveBuddyListener());

        this.Theview.

    }

    class AddBuddyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String buddyName = JOptionPane.showInputDialog("Enter Buddy Name");
            String buddyNum = JOptionPane.showInputDialog("Enter Buddy Number");
            String buddyAddr = JOptionPane.showInputDialog("Enter Buddy Address");

            BuddyInfo buddyInfo = new BuddyInfo(buddyName, buddyNum, buddyAddr);

            addressBook.addBuddy(buddyInfo);
            Theview.buddyListModel.addElement(buddyInfo);

        }
    }


    class RemoveBuddyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int selectedIndex = Theview.buddyList.getSelectedIndex();
            if (selectedIndex != -1) {
                BuddyInfo buddyToRemove = Theview.buddyListModel.get(selectedIndex);
                addressBook.removeBuddy(buddyToRemove);
                Theview.buddyListModel.remove(selectedIndex);


            }
        }
    }

        public static void main (String []args){

            AddressBookView view = new AddressBookView();

            Controller controller = new Controller(view, new AddressBook());

            view.setVisible(true);


        }
    }
