import java.io.*;
class MyInput
{
    public static void main(String[] args) 
        {
            String text;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            text = br.readLine();
            System.out.println(text);
        }
    } 
