
public class Main {

	public static void main(String[] args) {

		// Interface para Reprodutor Musical
		interface ReprodutorMusical {
			void tocar();

			void pausar();

			void selecionarMusica(String musica);
		}

		// Interface para Aparelho Telefônico
		interface AparelhoTelefonico {
			void ligar(String numero);

			void atender();

			void iniciarCorreioVoz();
		}

		// Interface para Navegador na Internet
		interface NavegadorInternet {
			void exibirPagina(String url);

			void adicionarNovaAba();

			void atualizarPagina();
		}

		// Classe iPhone que implementa todas as interfaces
		class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
			// Implementação dos métodos de ReprodutorMusical
			public void tocar() {
				System.out.println("Tocando música...");
			}

			public void pausar() {
				System.out.println("Música pausada.");
			}

			public void selecionarMusica(String musica) {
				System.out.println("Selecionando a música: " + musica);
			}

			// Implementação dos métodos de AparelhoTelefonico
			public void ligar(String numero) {
				System.out.println("Ligando para " + numero);
			}

			public void atender() {
				System.out.println("Atendendo chamada...");
			}

			public void iniciarCorreioVoz() {
				System.out.println("Iniciando correio de voz...");
			}

			// Implementação dos métodos de NavegadorInternet
			public void exibirPagina(String url) {
				System.out.println("Exibindo página: " + url);
			}

			public void adicionarNovaAba() {
				System.out.println("Nova aba adicionada no navegador.");
			}

			public void atualizarPagina() {
				System.out.println("Atualizando página...");
			}
		}

	}

}
