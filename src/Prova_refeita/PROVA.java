import java.util.Scanner;

public class PROVA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] eleitores = {1001, 1002, 1003, 1004, 60014351};
        boolean[] eleitoresVotaram = new boolean[5];

        int[] candidatosFederal = {101, 102, 103};
        int[] candidatosEstadual = {201, 202, 203};
        int[] candidatosSenador = {301, 302, 303};
        int[] candidatosGovernador = {401, 402, 403};
        int[] candidatosPresidente = {501, 502, 503};

        String[] nomesFederal = {"José Bombinha", "Ana Silva", "Carlos Lima"};
        String[] nomesEstadual = {"Taffe da Galera", "Rodrigo Pato Depenado", "Mariana Costa"};
        String[] nomesSenador = {"Huilson Clone", "Juliana Rocha", "Roberto Martins"};
        String[] nomesGovernador = {"Patrick Cobra", "Fernanda Souza", "Ricardo Oliveira"};
        String[] nomesPresidente = {"Raqueli", "Alessandro das Redes", "Lucas Ferreira"};

        int[] votosFederal = new int[5];
        int[] votosEstadual = new int[5];
        int[] votosSenador = new int[5];
        int[] votosGovernador = new int[5];
        int[] votosPresidente = new int[5];

        int opcao = -1;

        while (opcao != 0) {

            System.out.println(" SISTEMA DE VOTACAO ");
            System.out.println("1 - Iniciar votacao");
            System.out.println("2 - Consultar votos de um eleitor");
            System.out.println("3 - Exibir resultado");
            System.out.println("4 - Mostrar vencedores");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Sistema finalizado.");
                    break;
                case 1: {
                    System.out.print("Numero do eleitor: ");
                    int numero = sc.nextInt();

                    int posicao = -1;

                    for (int i = 0; i < 5; i++) {
                        if (eleitores[i] == numero) {
                            posicao = i;
                        }
                    }

                    if (posicao == -1) {
                        System.out.println("Eleitor nao cadastrado.");
                        break;
                    }

                    if (eleitoresVotaram[posicao]) {
                        System.out.println("Este eleitor ja votou.");
                        break;
                    }

                    int voto;
                    System.out.println("DEPUTADO FEDERAL");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(candidatosFederal[i] + " - " + nomesFederal[i]);
                    }

                    System.out.print("Digite o voto: ");
                    voto = sc.nextInt();

                    while (voto != 101 && voto != 102 && voto != 103) {
                        System.out.print("Voto invalido. Digite novamente: ");
                        voto = sc.nextInt();
                    }

                    votosFederal[posicao] = voto;

                    System.out.println("DEPUTADO ESTADUAL");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(candidatosEstadual[i] + " - " + nomesEstadual[i]);
                    }

                    System.out.print("Digite o voto: ");
                    voto = sc.nextInt();

                    while (voto != 201 && voto != 202 && voto != 203) {
                        System.out.print("Voto invalido. Digite novamente: ");
                        voto = sc.nextInt();
                    }

                    votosEstadual[posicao] = voto;

                    System.out.println("SENADOR");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(candidatosSenador[i] + " - " + nomesSenador[i]);
                    }

                    System.out.print("Digite o voto: ");
                    voto = sc.nextInt();

                    while (voto != 301 && voto != 302 && voto != 303) {
                        System.out.print("Voto invalido. Digite novamente: ");
                        voto = sc.nextInt();
                    }

                    votosSenador[posicao] = voto;

                    System.out.println("GOVERNADOR");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(candidatosGovernador[i] + " - " + nomesGovernador[i]);
                    }

                    System.out.print("Digite o voto: ");
                    voto = sc.nextInt();

                    while (voto != 401 && voto != 402 && voto != 403) {
                        System.out.print("Voto invalido. Digite novamente: ");
                        voto = sc.nextInt();
                    }

                    votosGovernador[posicao] = voto;

                    System.out.println("PRESIDENTE");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(candidatosPresidente[i] + " - " + nomesPresidente[i]);
                    }

                    System.out.print("Digite o voto: ");
                    voto = sc.nextInt();

                    while (voto != 501 && voto != 502 && voto != 503) {
                        System.out.print("Voto invalido. Digite novamente: ");
                        voto = sc.nextInt();
                    }

                    votosPresidente[posicao] = voto;

                    eleitoresVotaram[posicao] = true;

                    System.out.println("Votacao concluida!");
                    break;
                }

                case 2: {
                    System.out.print("Numero do eleitor: ");
                    int numero = sc.nextInt();

                    int posicao = -1;

                    for (int i = 0; i < 5; i++) {
                        if (eleitores[i] == numero) {
                            posicao = i;
                        }
                    }

                    if (posicao == -1) {
                        System.out.println("Eleitor nao cadastrado.");
                    } else if (!eleitoresVotaram[posicao]) {
                        System.out.println("Este eleitor ainda nao votou.");
                    } else {
                        System.out.println("Federal: " + votosFederal[posicao]);
                        System.out.println("Estadual: " + votosEstadual[posicao]);
                        System.out.println("Senador: " + votosSenador[posicao]);
                        System.out.println("Governador: " + votosGovernador[posicao]);
                        System.out.println("Presidente: " + votosPresidente[posicao]);
                    }

                    break;
                }
                case 3: {
                    int totalEleitores = 0;

                    for (int i = 0; i < 5; i++) {
                        if (eleitoresVotaram[i]) {
                            totalEleitores++;
                        }
                    }

                    if (totalEleitores == 0) {
                        System.out.println("Nao existem votos registrados.");
                        break;
                    }

                    int[] contagem = new int[3];

                    System.out.println("RESULTADO");

                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosFederal[i] == candidatosFederal[j]) {
                                contagem[j]++;
                            }
                        }

                        System.out.println(nomesFederal[j] + ": " + contagem[j] + " voto(s)");
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosEstadual[i] == candidatosEstadual[j]) {
                                contagem[j]++;
                            }
                        }

                        System.out.println(nomesEstadual[j] + ": " + contagem[j] + " voto(s)");
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosSenador[i] == candidatosSenador[j]) {
                                contagem[j]++;
                            }
                        }

                        System.out.println(nomesSenador[j] + ": " + contagem[j] + " voto(s)");
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosGovernador[i] == candidatosGovernador[j]) {
                                contagem[j]++;
                            }
                        }

                        System.out.println(nomesGovernador[j] + ": " + contagem[j] + " voto(s)");
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosPresidente[i] == candidatosPresidente[j]) {
                                contagem[j]++;
                            }
                        }

                        System.out.println(nomesPresidente[j] + ": " + contagem[j] + " voto(s)");
                    }
                    break;
                }
                case 4: {
                    int totalEleitores = 0;

                    for (int i = 0; i < 5; i++) {
                        if (eleitoresVotaram[i]) {
                            totalEleitores++;
                        }
                    }

                    if (totalEleitores < 5) {
                        System.out.println("Todos os cinco eleitores precisam votar.");
                        break;
                    }

                    int[] contagem = new int[3];
                    int maior;

                    System.out.println("VENCEDORES");

                    // VENCEDOR FEDERAL
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosFederal[i] == candidatosFederal[j]) {
                                contagem[j]++;
                            }
                        }
                    }
                    maior = contagem[0];
                    for (int j = 1; j < 3; j++) {
                        if (contagem[j] > maior) {
                            maior = contagem[j];
                        }
                    }

                    System.out.println("Federal:");
                    for (int j = 0; j < 3; j++) {
                        if (contagem[j] == maior) {
                            System.out.println(nomesFederal[j] + " - " + maior + " voto(s)");
                        }
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosEstadual[i] == candidatosEstadual[j]) {
                                contagem[j]++;
                            }
                        }
                    }
                    maior = contagem[0];
                    for (int j = 1; j < 3; j++) {
                        if (contagem[j] > maior) {
                            maior = contagem[j];
                        }
                    }
                    System.out.println("Estadual:");
                    for (int j = 0; j < 3; j++) {
                        if (contagem[j] == maior) {
                            System.out.println(nomesEstadual[j] + " - " + maior + " voto(s)");
                        }
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosSenador[i] == candidatosSenador[j]) {
                                contagem[j]++;
                            }
                        }
                    }
                    maior = contagem[0];
                    for (int j = 1; j < 3; j++) {
                        if (contagem[j] > maior) {
                            maior = contagem[j];
                        }
                    }
                    System.out.println("Senador:");
                    for (int j = 0; j < 3; j++) {
                        if (contagem[j] == maior) {
                            System.out.println(nomesSenador[j] + " - " + maior + " voto(s)");
                        }
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosGovernador[i] == candidatosGovernador[j]) {
                                contagem[j]++;
                            }
                        }
                    }
                    maior = contagem[0];
                    for (int j = 1; j < 3; j++) {
                        if (contagem[j] > maior) {
                            maior = contagem[j];
                        }
                    }
                    System.out.println("Governador:");
                    for (int j = 0; j < 3; j++) {
                        if (contagem[j] == maior) {
                            System.out.println(nomesGovernador[j] + " - " + maior + " voto(s)");
                        }
                    }
                    for (int j = 0; j < 3; j++) {
                        contagem[j] = 0;

                        for (int i = 0; i < 5; i++) {
                            if (votosPresidente[i] == candidatosPresidente[j]) {
                                contagem[j]++;
                            }
                        }
                    }

                    maior = contagem[0];

                    for (int j = 1; j < 3; j++) {
                        if (contagem[j] > maior) {
                            maior = contagem[j];
                        }
                    }

                    System.out.println("Presidente:");
                    for (int j = 0; j < 3; j++) {
                        if (contagem[j] == maior) {
                            System.out.println(nomesPresidente[j] + " - " + maior + " voto(s)");
                        }
                    }

                    break;
                }
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
    }
}