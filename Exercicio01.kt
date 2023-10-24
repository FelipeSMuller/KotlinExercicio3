fun main() {

	val nota = 10;

	val notaFinal = when (nota) {

		in 0..10 -> "reprovado";

		in 11..50 -> "aprovado";

		in 51..100 -> "aprovado com nota alta";

		else -> "um dado diferente de um número foi digitado, tente novamente";

	}

	println("Sua nota é $nota, portanto você está $notaFinal");
}
