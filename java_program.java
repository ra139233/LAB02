package main_pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {

	public static void main(String[] args) {

		//definicao de variaveis utilizadas no metodo main.
		int width = 0;
		int length = 0;
		int perimeter = 0;

		//Neste ponto eh feita a leitura dos valores de largura e altura do retangulo
		//E eh calculado o valor do perimetro que eh armazenado na variavel "perimeter".
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter length of a rectangle");
			length = Integer.parseInt(br.readLine());
			//Garante que o valor seja positivo
			while (length <= 0){
				System.out.println("Please enter a POSITIVE (0 is not valid) length of a rectangle");
				length = Integer.parseInt(br.readLine());
			}
			System.out.println("Please enter width of a rectangle");
			width = Integer.parseInt(br.readLine());
			//Garante que o valor seja positivo
			while (width <= 0){
				System.out.println("Please enter a POSITIVE (0 is not valid) width of a rectangle");
				width = Integer.parseInt(br.readLine());
			}
			perimeter = (2*length) + (2*width);
		}
		//Se o numero digitado em length nao eh valido, entao uma excecao de formato->
		//-> eh lancada e o carcatere invalido eh salvo em ne, e o programa deve terminar.
		catch(NumberFormatException ne)
		{
			System.out.println("Invalid value: " + ne);
			System.exit(0);
		}
		//Se por algum motivo durante a leitura ou escrita no bufer de I/O durante a ->
		//->execucao do programa, a excecao detectada eh gravada em ioe e o programa termina.
		catch(IOException ioe)
		{
			System.out.println("IO Error: " + ioe);
			System.exit(0);
		}
		//Se nenhum problema ocorreu, entao o perimetro calculado eh informado.
			System.out.println("Perimeter of a rectangle is: " + perimeter);
		}
}

