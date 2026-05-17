package ar.edu.unahur.obj2.persona;

import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Rubia;
import ar.edu.unahur.obj2.marcas.Negra;
import ar.edu.unahur.obj2.pais.Pais;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
	@Test
	void testCantidadAlcoholEnJarra() {
		Pais pais = new Pais("Alemania");
		Rubia rubia = new Rubia(3.0, pais, 8.0);
		Jarra jarra = new Jarra(0.5, rubia);

		assertEquals(0.5 * (8.0 / 100.0), jarra.cantidadDeAlcohol(), 1e-9);
	}

	@Test
	void testTotalAlcoholConsumidoYEstaEbria() {
		Pais pais = new Pais("Argentina");
		Rubia r1 = new Rubia(3.0, pais, 8.0);
		Rubia r2 = new Rubia(2.0, pais, 5.0);
		Jarra j1 = new Jarra(0.5, r1); // 0.04 L alcohol
		Jarra j2 = new Jarra(1.0, r2); // 0.05 L alcohol

		List<Jarra> jarras = List.of(j1, j2);
		Aleman persona = new Aleman(70.0, jarras, true, 1000);

		assertEquals(0.04 + 0.05, persona.totalAlcoholConsumido(), 1e-9);
		// Not drunk with high aguante
		assertFalse(persona.estaEbria());

		// With low aguante should be ebria
		Aleman borracho = new Aleman(70.0, jarras, true, 5);
		assertTrue(borracho.estaEbria());
	}

	@Test
	void testGustosSegunNacionalidad() {
		Pais pais = new Pais("Belgica");
		Rubia rubiaConMuchoLupulo = new Rubia(5.0, pais, 6.0);
		Rubia rubiaFuerte = new Rubia(2.0, pais, 9.0);

		Belga belga = new Belga(70.0, List.of(), true, 10);
		Checo checo = new Checo(70.0, List.of(), true, 10);
		Aleman aleman = new Aleman(70.0, List.of(), true, 10);

		assertTrue(belga.leGusta(rubiaConMuchoLupulo));
		assertFalse(belga.leGusta(rubiaFuerte));

		assertTrue(checo.leGusta(rubiaFuerte));

		assertTrue(aleman.leGusta(rubiaFuerte));
		assertTrue(aleman.leGusta(rubiaConMuchoLupulo));
	}
}
