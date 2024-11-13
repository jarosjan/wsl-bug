package wsl.bug.example

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ExampleApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun `this test runs` () {

	}

	@Disabled
	@Test
	fun `this test stuck`() {

	}

}
