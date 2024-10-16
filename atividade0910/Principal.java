package atividade0910;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(7, "Miguel", "999999999", "11111111111", "222222222");
		Tema tema = new Tema(2, "Herois", 350.00, "Preto");
		ItemTema itemTema = new ItemTema(2, "Batman", "Toalha do batman :)");
		Endereco endereco = new Endereco(4, "Avenida", 42, "Av. Navarro de Andrade", "America", "Santa Fé do Sul", "134253423", "SP");
		
		cliente.exibindoCliente();
		tema.exibindoTema();
		itemTema.exibindoItem();
		endereco.exibindoEndereco();
	}
}
