import java.io.*;
class takinUserInput {
public static void main(String[] args) throws IOException {

    //translating raw keyboard bytes into more readable characters
    InputStreamReader in = new InputStreamReader(System.in);//System.in reads the input
    //reads input efficiently using buffer; Reads the entire line at once using readLine()
    BufferedReader bf =  new BufferedReader(in);


    int num = Integer.parseInt(bf.readLine());
    System.out.println(num);   

}    
}
