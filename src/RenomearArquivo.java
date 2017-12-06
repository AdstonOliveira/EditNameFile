// Author Adston, Caraguatatuba-SP Brazil, 06/12/2017
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RenomearArquivo {

   public static void main(String args[]){
      
      File fileName[];
      File directory = new File("C:\\201711\\"); // Indica o caminho da pasta com os arquivos , pode ser implementado com interatividade
      fileName = directory.listFiles(); // Recebe a lista de arquivos
 
      String test = null;
      List <String> names = new ArrayList<>(); // Recebe os names dos arquivos
      
      for(int i = 0; i < fileName.length; i++){
         test = fileName[i].getName(); 
         String[] test2 = test.split("-"); // Atribui o valor dividido pelo sinal separador
         test = test2[0]; // Atribui a variavel somente o numero do XML lido
         names.add(test); // Adiciona esta parte ao List
      }
 
      for(int i = 0; i < fileName.length; i++){
         String novo = names.get(i); // Variavel recebe o nome
         File newName = new File("C:\\201711\\" + novo.concat("-NFe.xml")); // Cria novo arquivo com o final desejado
         System.out.println(newName.getName()); // Imprime na tela
         
         fileName[i].renameTo(newName); // renomeia o arquivo
      }
      
   }
   
}
