package ifsc.poo;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Clientes 

        Cliente cliente = new Cliente("Maria", "Oliveira", "98765432100", "mariaO44@gmail.com", 
                                       "Rua A, 123", "44-9999-9999", false, "01/01/2023");

        System.out.println(cliente.getResumo());
        System.out.println("-------------------------");

        //Funcionários CLT / Estagio / Temporário

        //CLT

        HashSet<String> habilidades = new HashSet<>();
        habilidades.add("Java");
        habilidades.add("Python");
        habilidades.add("SQL");

        CLTSenior cltSenior = new CLTSenior("João", "Silva", "12345678900", "joaoSilva14@gmail.com", "10/01/2022", 
                                             5000, 40, 123456, 1000, habilidades);

        CLTPleno cltPleno1 = new CLTPleno("Ana", "Souza", "23456789001", "ana12312@gmail.com", "15/02/2022", 
                                          4000, 40, 654321, cltSenior, habilidades);

        CLTPleno cltPleno2 = new CLTPleno("Carlos", "Pereira", "34567890123", "carlp2121@gmail.com", "20/03/2022", 
                                          4000, 40, 789012, cltSenior, habilidades);

        cltSenior.adicionarFuncionario(cltPleno2);

        CLTJunior cltJunior1 = new CLTJunior("Lucas", "Lima", "45678901234", "LucasLL@gmail.com", "25/04/2022", 
                                             3000, 40, 345678, cltPleno1, habilidades);

        CLTJunior cltJunior2 = new CLTJunior("Fernanda", "Costa", "56789012345", "FCosta@gmail.com", "30/05/2022", 
                                             3000, 40, 456789, cltPleno1, habilidades);

        cltPleno1.adicionarFuncionario(cltJunior1);
        cltPleno1.adicionarFuncionario(cltJunior2);


        System.out.println(cltSenior.getResumo());
        System.out.println("-------------------------");
        System.out.println(cltPleno1.getResumo());
        System.out.println("-------------------------");

        //Estagiários

        EstagiarioADM estagiarioADM = new EstagiarioADM("Pedro", "Almeida", "67890123456", "PedroA123@gmail.com", 
                                                        "01/06/2022", 1500, 30, "Financeiro", "Cuidar dos gastos da empresa", "IFSC", cltPleno1);

        cltPleno1.adicionarEstagiarioOrientado(estagiarioADM);
        System.out.println(estagiarioADM.getResumo());
        System.out.println("-------------------------");
        EstagiarioTI estagiarioTI = new EstagiarioTI("Julia", "Martins", "78901234567", "JuliaMart8838@gmail.com", 
                                                    "01/07/2022", 1200, 30, "55XG9505", true, "IFSC", cltPleno1);

        cltPleno1.adicionarEstagiarioOrientado(estagiarioTI);
        System.out.println(estagiarioTI.getResumo());
        System.out.println("-------------------------");

        //Funcionários Temporários
        
        TempConsultor tempConsultor = new TempConsultor("Roberto", "Gomes", "89012345678", "Roberto93939@gmail.com" ,
                                                        "01/08/2022", "01/12/2022", 2000, 5, cltPleno1);
        System.out.println(tempConsultor.getResumo());
        System.out.println("-------------------------");

        TempTecnico tempTecnico = new TempTecnico("Sofia", "Ribeiro", "90123456789", "SoSo3323@gmail.com" ,
                                                  "01/09/2022", "01/11/2022", 1800, "Manhã", true);
        System.out.println(tempTecnico.getResumo());
        System.out.println("-------------------------");

    }
}
