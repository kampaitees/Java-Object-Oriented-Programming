import java.util.Scanner;

class books{
    String name,publisher,author;

    public books() {
        this.name = null;
        this.author = null;
        this.publisher = null;
        this.id = 0;
    }

    int id;

    public books(String name, String publisher, String author, int id) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.id = id;
    }

    void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Publisher : " + publisher);
        System.out.println("author : " + author);
    }
}

class issuedBooks extends books{
    public issuedBooks() {
    }

    int daysRemaining;
    double penalty;
    public issuedBooks(String name, String publisher, String author, int id) {
        super(name, publisher, author, id);
    }

    void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Publisher : " + publisher);
        System.out.println("author : " + author);
        System.out.println("Days Remaining : " + daysRemaining);
        System.out.println("Penalty : " + penalty);
    }
}


public class checkOut {
    public static void main(String args[]){
        int bookCount=0;
        int issueCount =0;
        String waste;
        Scanner scan = new Scanner(System.in);
        books b[] = new books[100];
        issuedBooks is[] = new issuedBooks[100];
        while(true) {
            System.out.println("Enter\n1.Borrower\n2.Librarian\n3.Exit");
            int role = scan.nextInt();
            switch (role){
                case 1 :
                    boolean cont=true;
                    while(cont){
                        System.out.println("Enter\n1.View by publisher\n2.View by author\n3.view latest\n4.exit as borrower");
                        int ch = scan.nextInt();
                        waste = scan.nextLine();
                        switch (ch){
                            case 1 :
                                System.out.println("Enter the name of the publisher");

                                String pub = scan.nextLine();
                                for (int j=0;j<bookCount;j++){
                                    if((b[j].publisher).equals(pub)){
                                        b[j].showDetails();
                                    }
                                }
                                break;

                            case 2 :
                                System.out.println("Enter the name of the author");
                                String auth = scan.nextLine();
                                for (int j=0;j<bookCount;j++){
                                    if((b[j].author).equals(auth)){
                                        b[j].showDetails();
                                    }
                                }
                                break;


                            case 3 :
                                System.out.println("Enter the name o the publisher");
                                books temp = new books();
                                for(int k=0;k<bookCount;k++){
                                    for(int j=0;j<bookCount;j++){
                                        if(b[j].id < b[k].id){
                                            temp=b[k];
                                            b[k]=b[j];
                                            b[j]=temp;
                                        }
                                    }
                                }
                                for (int j=0;j<bookCount;j++){
                                    b[j].showDetails();
                                }
                                break;

                            case 4 :
                                cont = false;
                                break;


                            default:System.out.println("Wrong choice");
                        }
                    }
                    break;

                case 2 : boolean cont1=true;
                    while(cont1) {
                        System.out.println("Enter\n1.add\n2.delete\n3.view\n4.issue\n5.view issued\n6.return books\n7.Simulate Days\n8.Exit");
                        int ch1 = scan.nextInt();
                        waste = scan.nextLine();
                        switch (ch1){
                            case 1 :
                                System.out.println("Enter the name,publisher,author of the book");
                                b[bookCount] = new books();
                                b[bookCount].id = bookCount;

                                b[bookCount].name = scan.nextLine();
                                b[bookCount].publisher = scan.nextLine();
                                b[bookCount].author = scan.nextLine();
                                bookCount++;
                                System.out.println("book added");
                                break;

                            case 2 :
                                System.out.println("Enter the name of the book to be deleted");
                                String bookname = scan.nextLine();
                                books temp1 = new books();
                                for(int i=0;i<bookCount;i++){
                                    if((b[i].name).equals(bookname)){
                                        temp1 = b[i];
                                        b[i] = b[bookCount-1];
                                        b[bookCount-1] = temp1;
                                    }
                                }
                                bookCount--;
                                System.out.println("Book deleted");
                                break;

                            case 3 :
                                for(int i=0;i<bookCount;i++){
                                    b[i].showDetails();
                                }
                                break;

                            case 4 :
                                System.out.println("Enter the name of the book to be issued");
                                String iname = scan.nextLine();
                                books temp2 = new books();
                                for(int i= 0;i<bookCount;i++){
                                    if((b[i]).name.equals(iname)){
                                        temp2 = b[i];
                                        b[i] = b[bookCount-1];
                                        b[bookCount-1] = temp2;
                                    }
                                }
                                is[issueCount] = new issuedBooks();
                                is[issueCount].id = issueCount;
                                is[issueCount].name=b[bookCount-1].name;
                                is[issueCount].author=b[bookCount-1].author;
                                is[issueCount].publisher=b[bookCount-1].publisher;
                                is[issueCount].daysRemaining = 15;
                                is[issueCount].penalty = 0;
                                issueCount++;
                                bookCount--;
                                System.out.println("book issued");
                                break;

                            case 5 :
                                for(int i=0;i<issueCount;i++){
                                    is[i].showDetails();
                                }
                                break;

                            case 6 :
                                System.out.println("Enter the name of the book to be returned");
                                String rname = scan.nextLine();
                                issuedBooks issuetemp = new issuedBooks();
                                for(int i=0;i<issueCount;i++)
                                {
                                    if((is[i].name).equals(rname)){
                                        issuetemp = is[i];
                                        is[i] = is[issueCount-1];
                                        is[issueCount-1] = issuetemp;
                                    }
                                }
                                b[bookCount] = new books();
                                b[bookCount].id = bookCount;

                                b[bookCount].name = is[issueCount-1].name;
                                b[bookCount].publisher = is[issueCount-1].publisher;
                                b[bookCount].author = is[issueCount-1].author;
                                System.out.println("Penalty to be paid : " + is[issueCount-1].penalty);
                                bookCount++;
                                issueCount--;

                                System.out.println("book returned");

                                break;

                            case 7 :
                                System.out.println("Enter the number of days to simulate");
                                int sim = scan.nextInt();
                                double pen=0;
                                waste = scan.nextLine();
                                for(int i=0;i<issueCount;i++) {
                                    is[i].daysRemaining -= sim;
                                    if ((is[i].daysRemaining) < 0) {
                                        if (is[i].daysRemaining >= -7) {
                                            pen = 0 - is[i].daysRemaining * (2.5);
                                            if(is[i].daysRemaining == -7){
                                                System.out.println("Notice to the borrower sent");
                                            }
                                        } else {
                                            pen = 17.5 - (is[i].daysRemaining + 7) * 5;
                                        }
                                        is[i].penalty = pen;
                                    }
                                }
                                break;

                            case 8 : cont1 = false;
                                break;

                            default:System.out.println("Wrong choice");
                        }

                    }
                    break;

                case 3 :    System.exit(0);

                default:System.out.println("Wrong choice");
            }
        }
    }
}

