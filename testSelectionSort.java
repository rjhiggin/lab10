import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;



class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    
    public void testPositive(){
	//Branch bob change
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort ss = new SelectionSort();
        arr = ss.basicSelectionSort(arr);
        
        /** add tests to check for this unit test **/
        
        assertEquals("first valuses are not equal",Sortedarr[0], arr[0]);
        assertEquals("second value is not equal to 7", arr[1], 7);
        assertTrue("sorted array values are not sorted", arr[0] < arr[1]);
        assertArrayEquals("arrays are not eqaul", arr, Sortedarr);
    }
    
    public void testNegative(){
	//branch bob change
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        SelectionSort ss = new SelectionSort();
        
        int[]Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        arr = ss.basicSelectionSort(arr);
        
        
        /** Test data contains negative values only **/
        assertEquals("first valuses are not equal",Sortedarr[0], arr[0]);
        assertTrue("sorted array values are not sorted", arr[0] < arr[1]);
        assertTrue("Last value is not -2", arr[4] == -2);
        assertArrayEquals("arrays are not eqaul", arr, Sortedarr);
    
        
    }
    
    public void testMixed(){
	// Tom changes
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 0;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = 2;
        
        SelectionSort ss = new SelectionSort();
        
        int[]Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = -7;
        Sortedarr[3] = 0;
        Sortedarr[4] = 2;
        
        arr = ss.basicSelectionSort(arr);
        
        /** Test data contains with both positive, negative and zeros **/
        assertEquals("first valuses are not equal",Sortedarr[0], arr[0]);
        assertTrue("sorted array values are not sorted", arr[0] < arr[1]);
        assertTrue("Last value is not 2", arr[4] == 2);
        assertArrayEquals("arrays are not eqaul", arr, Sortedarr);
        
    	
    }
    
    public void testDuplicates(){
	//Tom changes
    	int[] arr = new int[5];
        arr[0] = 7;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        SelectionSort ss = new SelectionSort();
        
        int[]Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 7;
        Sortedarr[4] = 10;
        
        arr = ss.basicSelectionSort(arr);
        
        /** Test data contains duplicates **/
        assertEquals("first valuses are not equal",Sortedarr[0], arr[0]);
        assertTrue("sorted array values are not the same", arr[0] == arr[1]);
        assertTrue("Last value is not 10", arr[4] == 10);
        assertArrayEquals("arrays are not eqaul", arr, Sortedarr);
        
       
    }

}
