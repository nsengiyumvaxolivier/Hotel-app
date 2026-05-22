//HotelRoom class creation.....................................
public class HotelRoom {
    //private variable creation...................................
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    //variable without modifier.................................
    boolean isAvailable;
    //public variable................................................
    public String hotelName;
    //parameterized constructor................................................
    HotelRoom(int roomNumber, String roomType, double pricePerNight, boolean isAvailable, String hotelName) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
        this.hotelName = hotelName;

    }
    //public Function For to Display Room info.............................................
    public void displayRoomInfo(){
        System.out.println("========== Room Information ==========\n");
        System.out.println("Hotel: "+hotelName);
        System.out.println("Room No: "+roomNumber);
        System.out.println("Room Type: "+roomType);
        System.out.println("Price/Night: "+pricePerNight);
        System.out.println("Available: "+isAvailable);
        System.out.println("===============================================\n");

    }
    //function for to Check availability of room........................
    public void checkAvailability(){
        //if Room is available.............................
        if (isAvailable == true){
            System.out.println("Room "+roomNumber+" is available for booking");
        }
        //if room is not available...............................................
        else {
            System.out.println("Room "+roomNumber+" is not available for booking");
        }
    }

}
