import java.sql.SQLOutput;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> Bud_list;
    AddressBook(){
        Bud_list = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        Bud_list.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        Bud_list.remove(buddy);
    }



    public void save(String fileName){

        try(Buffered writer = new Buffereed Writer(new Filename(fileName))){
            for(BuddyInfo buddy : Bud_list){
                writer.write(buddy.toString());
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }




    public static void main (String []args){
        System.out.println("Address Book");
        System.out.println("Testing commit again");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
