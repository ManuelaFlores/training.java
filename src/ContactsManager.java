public class ContactsManager {
    //fields : it's in charge to store data
    Contact [] myFriends;
    int friendsCount;

    /** Constructor : A special method that have the same name as the class itself,
     * is in charge to initialize an object of a class,
     * a constructor do not have return types, instead can recieve paramethers
      */
    ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }
}
