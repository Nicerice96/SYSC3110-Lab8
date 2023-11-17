public class BuddyInfo {
    private String name;

    private String number;

    private String address;


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    BuddyInfo(){
        name = "Gerald";
        number = "613-981-9377";
        address = "202 Sage Brook";
    }

    // making a change to Buddyinfo

    BuddyInfo(String name, String number, String address){
        this.name = name;
        this.number = number;
        this.address = address;
    }


    public String toString(){

        return this.name + " " + this.number + " " + this.address;
    }








    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Homer", "613-424-8397", "45 MacDonald");


        System.out.println("Hello World " + buddy.getName());

    }
}
