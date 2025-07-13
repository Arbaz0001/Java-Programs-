

public class Address {
      String houseNo;
      String district;
      String state;
      String pincode;

    // Parameterized constructor to initialize the attributes
    public Address(String houseNo, String district, String state, String pincode) {
        this.houseNo = houseNo;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
    }
}    Address anotherAddress = new Address("456B", "Mumbai", "Maharashtra", "400001");

        // Display the details of another address
        anotherAddress.displayAddressDetails();
    }
}
