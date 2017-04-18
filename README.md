# 39 Read from a file


* [File Object](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)
* [Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
* [While Loop]()

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

````java
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

````   

````java 
      Scanner sc = new Scanner(new File("myNumbers"));
      while (sc.hasNextLong()) {
          long aLong = sc.nextLong();
      }
 

````    


