package br.unirio;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;



public class OrdenacaoTopologica {
	private class Elo {
		/* Identificação do elemento. */
		public int chave;

		/* Número de predecessores. */
		public int contador;

		/* Aponta para o próximo elo da lista. */
		public Elo prox;

		/* Aponta para o primeiro elemento da lista de sucessores. */
		public EloSuc listaSuc;

		public Elo() {
			prox = null;
			contador = 0;
			listaSuc = null;
		}

		public Elo(int chave, int contador, Elo prox, EloSuc listaSuc) {
			this.chave = chave;
			this.contador = contador;
			this.prox = prox;
			this.listaSuc = listaSuc;
		}
	}

	private class EloSuc {
		/* Aponta para o elo que é sucessor. */
		public Elo id;

		/* Aponta para o próximo elemento. */
		public EloSuc prox;

		public EloSuc() {
			id = null;
			prox = null;
		}

		public EloSuc(Elo id, EloSuc prox) {
			this.id = id;
			this.prox = prox;
		}
	}


	/* Ponteiro (referência) para primeiro elemento da lista. */
	private Elo prim;

	/* Número de elementos na lista. */
	private int n;

	public OrdenacaoTopologica() {
		prim = null;
		n = 0;
	}

	/* Método responsável pela leitura do arquivo de entrada. */
	public void realizaLeitura(String nomeEntrada) throws IOException {
		FileReader leitorArq = new FileReader("C:\\entrada.txt");
		BufferedReader leitor = new BufferedReader(leitorArq);
		nomeEntrada = leitor.readLine() + "\n";
		while(leitor.ready()) {  //enquanto o arquivo nao estiver vazio/nulo
			nomeEntrada += leitor.readLine() + ";";
		}
		leitor.close();
		// FORMATAR STRING
		while (nomeEntrada != null){
			int indexPonto = nomeEntrada.indexOf(">");
			// fazer x receber tudo que vem antes do >
			// fazer y receber o que vem depois de > e antes do ;

		}


	}

	/* Método para impressão do estado atual da estrutura de dados. */
	private void debug() {
		/* Preencher. */
	}

	/* Método responsável por executar o algoritmo. */
	public boolean executa() {
		/* Preencher. */

		return false;
	}

	public void leArquivo() throws IOException {


	}

}