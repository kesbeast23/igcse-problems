
// Java Class deals with all operation  of a Dynamic Cart
// add, remove, resize memory of array is the main feature
public class Cart {
  
    // create three variable array[] is a array,
    // count will deal with no of element add by you and
    // size will with size of array[]
    private Product array[];
    private int count;
    private int size;
    // constructor initialize value to variable
  
    public Cart()
    {
        array = new Product[1];
        count = 0;
        size = 1;
    }
    // function add an element at the end of array
  
    public void add(Product data)
    {
  
        // check no of element is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        } // insert element at end of array
        array[count] = data;
        count++;
    }
  
    // function makes size double of array
    public void growSize()
    {
  
        Product temp[] = null;
        if (count == size) {
  
            // temp is a double size array of array
            // and store array elements
            temp = new Product[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    // copy all array value into temp
                    temp[i] = array[i];
                }
            }
        }
  
        // double size array temp initialize
        // into variable array again
        array = temp;
         
        // and make size is double also of array
        size = size * 2;
    }
  
    // function shrink size of array
    // which block unnecessary remove them
    public void shrinkSize()
    {
        Product temp[] = null;
        if (count > 0) {
  
            // temp is a count size array
            // and store array elements
            temp = new Product[count];
            for (int i = 0; i < count; i++) {
  
                // copy all array value into temp
                temp[i] = array[i];
            }
  
            size = count;
  
            // count size array temp initialize 
            // into variable array again
            array = temp;
        }
    }
    // function add an element at given index
  
    public void addAt(int index, Product data)
    {
        // if size is not enough make size double
        if (count == size) {
            growSize();
        }
  
        for (int i = count - 1; i >= index; i--) {
  
            // shift all element right 
            // from given index
            array[i + 1] = array[i];
        }
  
        // insert data at given index
        array[index] = data;
        count++;
    }
  
    // function remove last element or put
    // zero at last index
    public void remove()
    {
        if (count > 0) {
            array[count - 1] =null;
            count--;
        }
    }
  
    // function shift all element of right
    // side from given index in left
    public void removeAt(int index)
    {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
  
                // shift all element of right 
                // side from given index in left
                array[i] = array[i + 1];
            }
            array[count - 1] = null;
            count--;
        }
    }
    public Product[] getProducts(){
        return array;
    }
}
