class Main {
    public static void main(String [] args) {
        ContactsManager myContactManager = new ContactsManager();

        //Creating new contacts
        Contact james = new Contact();
        james.name = "James";
        james.phonenumber= "993931325";
        myContactManager.addContact(james);

        Contact rose = new Contact();
        rose.name = "Rose";
        rose.phonenumber = "999333666";

        Contact joseph = new Contact();
        joseph.name = "Joseph";
        joseph.phonenumber= "9998888777";

        Contact isis = new Contact();
        isis.name = "Isis";
        isis.phonenumber= "999555444";

        //Add new contacts to my variable "myContactManager"
        myContactManager.addContact(james);
        myContactManager.addContact(rose);
        myContactManager.addContact(joseph);
        myContactManager.addContact(isis);

        //Should return rose contact:
       System.out.print(myContactManager.searchContact("Rose"));

    }
}
