package nashtech;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BookTest {
	private BookPriceCalculator bookPriceCalculator;
    private BookSet<String> bookset;
    @Before
    public void setUp() {
    	bookset = new BookSet<>();
        bookPriceCalculator = new BookPriceCalculator(bookset);
    }

    @Test
    public void oneBooksHas8() {
        String[] bookTitles = new String[] { "book_1" };
        Double result = bookPriceCalculator.getTotalPrice(bookTitles);

        Double expectedDiscount = 8.0;
        Assert.assertEquals(expectedDiscount, result);
    	
    }
    @Test
    public void twoEqualBooksPriceIs16() {
        String[] bookTitles = new String[] { "book_1", "book_1" };

        Double result = bookPriceCalculator.getTotalPrice(bookTitles);

        Double expectedResult = 16.0;
        Assert.assertEquals(expectedResult, result);
    }
    
    @Test
    public void twoDifferentsBooksHas5PerrcentOfDiscount() {
        String[] bookTitles = new String[] { "book_1"  , "book_2" };

        Double result = bookPriceCalculator.getTotalPrice(bookTitles);

        Double expectedDiscount = 16 - 16 * 0.05;
        Assert.assertEquals(expectedDiscount, result);
    }
    @Test
    public void threeDifferentsBooksHas5PerrcentOfDiscount() {
        String[] bookTitles = new String[] { "book_1", "book_2" ,"book_3"};

        Double result = bookPriceCalculator.getTotalPrice(bookTitles);

        Double expectedDiscount = 21.6;
        Assert.assertEquals(expectedDiscount, result);
    }
    @Test
    public void fiveDifferentBooksHas25PerrcentDiscount() {
        String[] bookTitles = new String[] { "book_1", "book_2" ,"book_3" ,"book_4","book_5"};
        Double result = bookPriceCalculator.getTotalPrice(bookTitles);

        Double expectedDiscount = 30.0;
        Assert.assertEquals(expectedDiscount, result);

    }
//    @Test
//    public void afiveDifferentBooksHas25PerrcentDiscount() {
//        String[] bookTitles = new String[] { "book_2", "book_2" ,"book_2" ,"book_1","book_1"};
//        Double result = bookPriceCalculator.getTotalPrice(bookTitles);
//
//        Double expectedDiscount = 51.20;
//        Assert.assertEquals(expectedDiscount, result);
//
//
//    }
    @Test
  public void fourDifferentBooksHas20PerrcentDiscount() {
      String[] bookTitles = new String[] { "book_1", "book_2" ,"book_3" ,"book_4"};
      Double result = bookPriceCalculator.getTotalPrice(bookTitles);

      Double expectedDiscount = 25.60;
      Assert.assertEquals(expectedDiscount, result);

  }
    @Test
    public void threeEqualBooksPriceIs24() {
        String[] bookTitles = new String[] {"book_1", "book_1","book_1" };
        Double result = bookPriceCalculator.getTotalPrice(bookTitles);
        Double expectedResult = 24.0;
        Assert.assertEquals(expectedResult, result);
    }
 
}
