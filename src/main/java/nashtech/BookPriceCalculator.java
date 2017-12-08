package nashtech;

public class BookPriceCalculator {
	 private static final double BOOK_PRICE = 8.0;
	   private static final double ZERO_PERCENT_OF_DISCOUNT = 0.0;
	    private static final double FIVE_PERCENT_OF_DISCOUNT = 0.05;
	    private static final double TEN_PERCENT_OF_DISCOUNT=0.1;
	    private static final double TWENTY_PERCENT_OF_DISCOUNT=0.2;
	    private static final double TWENTYFITTEEN_PERCENT_OF_DISCOUNT=0.25;
	    
	    
	    
	    private BookSet<String> bookset;
	    
	    public BookPriceCalculator(BookSet<String> bookset) {
	        this.bookset = bookset;
	    }
	    public Double getTotalPrice(String[] items) {
	        Double price = BOOK_PRICE * items.length;
	        Double discount = getDiscount(items);
	        return price - discount;
	    }

	    public Double getDiscount(String[] items) {
	        int numberOfDifferentBooks = bookset.getNumberOfUniqueValues(items);
	        Double percent_of_discount = ZERO_PERCENT_OF_DISCOUNT;
	        if (numberOfDifferentBooks == 2) {
	            percent_of_discount = FIVE_PERCENT_OF_DISCOUNT;
	        }
	        else if(numberOfDifferentBooks==3) {
	        	percent_of_discount=TEN_PERCENT_OF_DISCOUNT;
	        }
	        else if(numberOfDifferentBooks==4) {
	        	percent_of_discount=TWENTY_PERCENT_OF_DISCOUNT;
	        }
	        else if(numberOfDifferentBooks==5) {
	        	percent_of_discount=TWENTYFITTEEN_PERCENT_OF_DISCOUNT;
	        }
	        return BOOK_PRICE * numberOfDifferentBooks * percent_of_discount;
	    }	 
}
