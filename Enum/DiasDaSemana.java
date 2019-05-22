public enum DiasDaSemana {
	// note que estamos chamando um construtor privado para cada um dos valores enumerados
	DOMINGO("Domingo"), SEGUNDA("Segunda-feira"), TERÇA("Terça-feira"), 
	QUARTA("Quarta-feira"), QUINTA("Quinta-feira"), SEXTA("Sexta-feira"), 
	SABADO("Sábado");
	
	// guarda o nome por extenso (no formato desejado) do dia
	// o descritor do tipo enumerado está sempre em maiúsculas
	// guardamos em nomeDia o formato de saída
	private String nomeDia;

	// uma classe Enum só pode ter construtor do tipo "private"
	private DiasDaSemana(String nome) { this.nomeDia = nome; }

	@Override
	public String toString() {
		return this.nomeDia;
	}
}
