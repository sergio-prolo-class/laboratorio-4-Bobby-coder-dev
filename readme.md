[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/_PWsXwN8)

```Mermaid
classDiagram
    class Pessoa {
        # String nome
        # String sobrenome
        # String cpf
        # String email
        + Pessoa()
        + String getNome()
        + String getSobrenome()
        + String getCPF()
        + String getEmail()
        + String getResumo()
    }
    class Cliente {
        - static int idCliente
        - String endereco
        - String telefone
        - boolean genero
        - String dataCadastro
        + Cliente()
        + String getEndereco()
        + String getTelefone()
        + boolean isGenero()
        + String getDataCadastro()
        + int getIdCliente()
        + String getResumo()
    }
    class ClientePremium {
        - static int idClientePremium
        - String dataVencimento
        - CLTSenior representante
        + ClientePremium()
        + String getDataVencimento()
        + int getIdClientePremium()
        + CLTSenior getRepresentante()
        + String getResumo()
    }
    class Funcionario {
        - static int idFuncionario
        - String dataInicioContrato
        + int getIdFuncionario()
        + String getDataInicioContrato()
        + String getResumo()
    }
    class CLT {
        - int salario
        - int cargaHoraria
        - int numeroCarteiraTrabalho
        - Set~String~ habilidades
        - List~Estagiario~ estagiariosOrientados
        + boolean adicionarEstagiarioOrientado()
        + boolean removerEstagiarioOrientado()
        + List~Estagiario~ getEstagiariosOrientados()
        + int getSalario()
        + int getCargaHoraria()
        + int getNumeroCarteiraTrabalho()
        + Set~String~ getHabilidades()
        + String getResumo()
    }
    class CLTJunior {
        -senioridade : String
        -orientador: CLTPleno
        + String getResumo()
    }
    class CLTPleno {
        - String senioridade
        - List~CLTJunior~ funcionarios
        - CLTSenior chefe
        + void adicionarFuncionario()
        + String getResumo()
    }
    class CLTSenior {
        - String senioridade
        - int bonificacao
        - List~CLTPleno~ funcionario
        + void adicionarFuncionario()
        + String getResumo()
    }
    class Estagiario {
        - int bolsaAuxilio
        - int cargaHoraria
        - String instituicaoEnsino
        - CLT orientador
        + int getBolsaAuxilio()
        + int getCargaHoraria()
        + String getInstituicaoEnsino()
        + CLT getOrientador()
        + String getResumo()
    }

    class EstagiarioADM {
        - String setor
        - String descricaoTarefa
        + String getSetor()
        + String getDescricaoTarefa()
        + String getResumo()
    }

    class EstagiarioTI {
        - String numeroSerieComputador
        - boolean remotaPresencial
        + String getNumeroSerieComputador()
        + boolean isRemotaPresencial()
        + String getResumo()
    }
    
    class FuncionarioTemp {
        - String terminoContrato
        - int valorContrato
        + String getTerminoContrato()
        + int getValorContrato()
        + String getResumo()
    }

    class TempTecnico {
        - String tipoContrato
        - String turno
        - boolean necessidadeEPI
        + String getTurno()
        + boolean isNecessidadeEPI()
        + String getResumo()
    }

    class TempConsultor {
        - int numRelatorios
        - CLTPleno consultor
        + String getResumo()
    }
        
    Pessoa <|-- Cliente
    Pessoa <|-- Funcionario

    Cliente <|-- ClientePremium

    Funcionario <|-- CLT
    Funcionario <|-- Estagiario
    Funcionario <|-- Temporario

    CLT <|-- CLTJunior
    CLT <|-- CLTPleno
    CLT <|-- CLTSenior

    Estagiario <|-- EstagiarioTI
    Estagiario <|-- EstagiarioADM

    Temporario <|-- TempConsultor
    Temporario <|-- TempTecnico


```