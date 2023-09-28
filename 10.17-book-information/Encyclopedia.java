public class Encyclopedia extends Book {
    // TODO: Declare private fields
    private String edition;
    private int numPages;

    // TODO: Define mutator methods -
    //       setEdition(), setNumPages()
    public void setEdition(String edition){
        this.edition = edition;
    }

    public void setNumPages(int numPages){
        this.numPages = numPages;
    }


    // TODO: Define accessor methods -
    //       getEdition(), getNumPages()

    public String getEdition(){
        return this.edition;
    }

    public int getNumPages(){
        return this.numPages;
    }

    // TODO: Define a printInfo() method that overrides
    //       the printInfo in Book class

    public void printInfo(){
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + this.edition);
        System.out.println("   Number of Pages: " + this.numPages);

    }

}