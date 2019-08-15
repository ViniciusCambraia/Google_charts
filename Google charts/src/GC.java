import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class GC {
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i=0;
    int ano1a=0,ano1b=0,ano2a=0,ano2b=0,ano3a=0,ano3b=0,ano4a=0,ano4b=0;    
    
    
    FileWriter arq = new FileWriter("C:\\Users\\Public\\Alunosquit.html");
    PrintWriter gravarArq = new PrintWriter(arq);
 
    gravarArq.printf("<html><head><script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script><script type=\"text/javascript\">google.charts.load('current', {'packages':['corechart']});google.charts.setOnLoadCallback(drawChart);function drawChart() {var data = google.visualization.arrayToDataTable([%n");
    for (int pebolim=0; pebolim<8; pebolim++) {
    	
    	switch (pebolim){
    	case 0:
    		System.out.println("Informe a quantidade de alunos que entraram em 2015");
    		i=ler.nextInt();
    		ano1a=i;
    	break;
    	case 1:
    		System.out.println("Informe a quantidade de alunos que entraram em 2016");
    		i=ler.nextInt();
    		ano2a=i;
    	break;
    	case 2:
    		System.out.println("Informe a quantidade de alunos que entraram em 2017");
    		i=ler.nextInt();
    		ano3a=i;
    	break;
    	case 3:
    		System.out.println("Informe a quantidade de alunos que entraram em 2018");
    		ano4a=ler.nextInt();
    	break;
    	
    	case 4:
    		System.out.println("Informe a quantidade de alunos que desistiram do curso em 2015:");
     		ano1b=ler.nextInt();
     	break;
    	case 5:
    		System.out.println("Informe a quantidade de alunos que desistiram do curso em 2016: ");
     		ano2b=ler.nextInt();
     	break;
    	case 6:
    		System.out.println("Informe a quantidade de alunos que desistiram do curso em 2017: ");
     		ano3b=ler.nextInt();
    	break;
    	case 7:
    		System.out.println("Informe a quantidade de alunos que desistiram do curso em 2018: ");
     		ano4b=ler.nextInt();
    	break;
    	}
    }
      gravarArq.printf("['Ano','Entrada','Saida'],%n"
    		+  		   "['2015', "+ano1a+","+ano1b+"],%n"
      		+          "['2016', "+ano2a+","+ano2b+"],%n"
      		+ 		   "['2017', "+ano3a+","+ano3b+"],%n"
      		+          "['2018', "+ano4a+","+ano4b+"]%n"  
    		  );
   
    gravarArq.printf("]);var options = {title: 'Entrada e Saida de Alunos',curveType: 'function',legend: { position: 'bottom' }};var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));chart.draw(data, options);}</script></head><body><div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div></body></html>");
    arq.close();
    System.out.printf("Sua Mãe ");
    ler.close();
  }
}