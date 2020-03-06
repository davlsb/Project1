import java.util.StringTokenizer;

public class Project1 {

    public static void main(String[] args) {
        
        int size=0; //array size, starting at 1 because______________________

        TextFileInput in = new TextFileInput(args[0]); //the TextFileInput to read from the text file
        String line = in.readLine(); // reading the first line
        
        while (line!=null) { //as long as we didn't reach the last line
            StringTokenizer Str = new StringTokenizer(line,":");
            if(Str.countTokens()==3) size++;   
            line = in.readLine(); //read the line
        }

        in.close();
        in = new TextFileInput(args[0]);
        
        Clock[] cArr1 = new Clock[size]; //unsorted
        Clock[] cArr2 = new Clock[size]; //sorted
        
        int i=0;
        
        line=in.readLine();
        
        while(line!=null) {
            
            StringTokenizer Str = new StringTokenizer(line,":");
            
            if(Str.countTokens()==3){            
                
            int hours=Integer.parseInt(Str.nextToken());
            int minutes=Integer.parseInt(Str.nextToken());
            int seconds=Integer.parseInt(Str.nextToken());
            
            Clock clock = new Clock(hours,minutes,seconds);
            
            cArr1[i]=clock;
            cArr2[i]=clock;
            
            i++;

            }
            
            else System.out.println(line);
            line = in.readLine();
        }

        selectionSort(cArr2,size);
        ClockGUI window = new ClockGUI(cArr1, cArr2, size);
        window.setVisible(true);
        
      //window.show(cArr1,cArr2,size);
       }
    
    private static void selectionSort (Clock[] array, int length) {

            for ( int i = 0; i < length - 1; i++ ) { 
                int indexLowest = i; 
                for ( int j = i + 1; j < length; j++ ) 
                   if ( array[j].getHours() < array[indexLowest].getHours() ) 
                      indexLowest = j;
                if ( array[indexLowest] != array[i] ) { 
                   int temp = array[indexLowest].getHours();
                   array[indexLowest].setHours(array[i].getHours()); 
                   array[i].setHours(temp); 
                }  // if
             } // for i 
          } // method selectionSort }  
   

}