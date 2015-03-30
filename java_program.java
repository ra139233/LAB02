public class Calculate {
public static void main(String[] args) {
int width = 0;
int length = 0;
try
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
length = Integer.parseInt(br.readLine());
System.out.println("Please enter width of a rectangle");
width = Integer.parseInt(br.readLine());
}
catch(NumberFormatException ne)
{
System.out.println("Invalid value" + ne);
System.exit(0);
}
catch(IOException ioe)
{
System.out.println("IO Error :" + ioe);
System.exit(0);
}
System.out.println("Perimeter of a rectangle is " + perimeter);
}
} 
