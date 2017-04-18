# 39 Read from a file


* [File Object](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)
* [Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
* [While Loop]()


## While loop

`````java     
    class WhileDemo {
        public static void main(String[] args){
            int count = 1;
            while (count < 11) {
                System.out.println("Count is: " + count);
                count++;
            }
        }
    }
`````     

## Scanner

````java
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

````   

## File

````java    
    // Create a file object, that can operate on MyTextFile.txt
    // Does not create a file! 
    File file = new File("MyTextFile.txt");
    
    // Create a file if and only if it does not exist
    file.createNewFile();
````   

## Scanner, File, loop

<pre>
      public static void main(String[] args)<b style="color:blue"> throws Exception</b>
      {
            Scanner sc = new Scanner(new File("MyTextFile.txt"));
            while (sc.hasNextLong()) {
                 long aLong = sc.nextLong();
            }
      }
</pre>   

### Scanner methods
`````java    
    hasNext()
    hasNextLine()
    hasNextInt()
    hasNextDouble()
    
````   





