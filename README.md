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

    File file = new File("MyTextFile.txt");
````   

## Scanner, File, loop

````java 
      Scanner sc = new Scanner(new File("myNumbers"));
      while (sc.hasNextLong()) {
          long aLong = sc.nextLong();
      }
 

````    


