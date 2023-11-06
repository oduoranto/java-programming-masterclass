public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this(40,duplex);
        this.duplex = duplex;
    }

    public Printer(int tonerLevel,  boolean duplex) {
       if(tonerLevel < 0 || tonerLevel > 100){
           this.tonerLevel = -1;
       }else {
           this.tonerLevel = tonerLevel;
       }

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tornerAmount){
        int total = tornerAmount + tonerLevel;
        if(total > 100 || total < 0){
            return  -1;
        }
        tonerLevel += tornerAmount ;
        return  tonerLevel;
    }
    public int printPages(int pages){
        int jobPages = (duplex)? (pages/2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
