public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {

        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel =-1;
        }
        this.printedPages = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            int total = tonerLevel + tonerAmount;
            if(total > 100){
                return 100;
            }else{
                return total;
            }

        }else{
            return -1;
        }
    }

    public int printPages(int pages){

        int pagesToPrint;
        pagesToPrint = duplex ? (pages/2) + (pages % 2): pages;

        return (pagesToPrint += printedPages);

    }
    public int getPrintedPages(){
        return printedPages;
    }
}
