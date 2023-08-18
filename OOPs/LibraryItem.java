package OOPs;

class LibraryItem {
    private String title;
    private int itemID;
    public LibraryItem(String title,int itemID){
        this.title=title;
        this.itemID=itemID;
    }
    public String getTitle(){
        return title;
    }
    public int getItemID(){
        return itemID;
    }

    public void displayInfo(){
        System.out.println("Title : "+title);
        System.out.println("Item ID : "+itemID);
    }
}
class Book extends LibraryItem{
    private String author;
    public Book(String title,int itemID,String author){
        super(title,itemID);
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author : "+author);
    }
}
class DVD extends LibraryItem{
    private int duration;
    public DVD(String title,int itemID,int duration){
        super(title,itemID);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration : "+duration);
    }
}
abstract class LibraryMember{
    private int memberID;
    private String name;
    public  LibraryMember(int memberID, String name){
        this.memberID=memberID;
        this.name=name;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public abstract void borrowItem(LibraryItem item);


}

class StudentMember extends LibraryMember {
    public StudentMember(int memberID,String name){

        super(memberID, name);
    }
    public void borrowItem(LibraryItem item){
        System.out.println("Student : "+getName()+" is Borrowing : "+item.getTitle());
    }
}
class FacultyMember extends LibraryMember {
    public FacultyMember(int memberID, String name) {
        super(memberID, name);
    }

    public void borrowItem(LibraryItem item) {
        System.out.println("Faculty : " + getName() + " is Borrowing : " + item.getTitle());
    }


    interface Reservable {
        void reserveItem(LibraryItem item);
    }
}
class Main{

    public static void main(String[] args) {
        Book B = new Book("Java By Kiran", 2023, "Kiran");
        DVD cd = new DVD("Java", 2022, 28);
        B.displayInfo();
        System.out.println();
        cd.displayInfo();
        System.out.println();
        StudentMember SM = new StudentMember(321, "Sai");
        FacultyMember FM = new FacultyMember(9696, "Sagar");
        SM.borrowItem(B);
        FM.borrowItem(cd);
    }
}

